staPLOT <- function (data, vars=c(1,2), groups=NULL, grouplabels=NULL, axislabels=c("DV1","DV2"),
                         xlim=NULL, ylim=NULL, pred=NULL, palette="Set1") 
{
  # function staPLOT (data, vars=c(1,2), groups=NULL, grouplabels=NULL, axislabels=c("DV1","DV2"),
  # xlim=NULL, ylim=NULL, pred=NULL, palette="Set1")
  # generates state-trace plot
# get stats from data (depending on its form)
shrink = -1;
if (is(data,"data.frame")) {
  y = gen2list (data) # convert from general format
  ys = staSTATS (y, shrink) # get stats
} 
if (is(data,"list")) {
  if (is.null(data[[1]]$means)) {ys = staSTATS(data, shrink) # in list form, get stats
} else {ys = data} # already in stats form
}

nvar = length(ys)
if (is.null(groups)) {g = rep(1,length(ys[[1]]$means))}
if (is.list(groups)) # convert list to vector of group id's
  {g=rep(1,length(ys[[1]]$means)); k=0;
  for (i in 1:length(groups)) {
    for (j in 1:length(groups[[i]])) {g[groups[[i]][j]]=i}
  }
}
groups=g;

if (is.null(grouplabels)) {
  grouplabels=rep(1,length(groups));
  for (i in 1:length(groups)) {grouplabels[i]=paste("Condition ",toString(groups[i]))}
} else {
    g = rep(1,length(groups));
    for (i in 1:length(groups)) {g[i]=grouplabels[[groups[i]]]};
    grouplabels=g;
}

# calculate model
if (!is.null(pred)) {
ix = vars[1]; iy = vars[2]; 
x = pred[[ix]]; y = pred[[iy]]
i = tiesort(x,y); x = i$x; y = i$y;
model = data.frame(x,y)
} else {model=NULL}

# calculate data
ix = vars[1]; iy = vars[2]; x = ys[[ix]]$means; y = ys[[iy]]$means
if (length(ys[[ix]]$n) > 1)
{cx = sqrt(diag(ys[[ix]]$cov)/diag(ys[[ix]]$n)) # between subjects
cy = sqrt(diag(ys[[iy]]$cov)/diag(ys[[iy]]$n))} else 
{cx = sqrt(diag(ys[[ix]]$lm)/ys[[ix]]$n) # within subjects
cy = sqrt(diag(ys[[iy]]$lm)/ys[[iy]]$n)}

# plot
df = data.frame(x,y)
p=ggplot(data=df, aes(x=x, y=y)) + 
  geom_errorbar(aes(ymin = y-cy, ymax = y+cy), color="black") + 
  geom_errorbarh(aes(xmin = x-cx, xmax = x+cx), color="black") +
  geom_point(aes(fill=as.factor(grouplabels)), color="black",size=5, shape=21)
if (!is.null(model)) {p = p + geom_line(data=model, aes(x=x,y=y), color="black", linetype="dashed") + 
  geom_point(data=model, aes(x=x,y=y), fill="white",color="black",size=2, shape=22)}
p = p + labs(x = axislabels[[1]], y = axislabels[[2]]) + scale_fill_brewer(palette=palette)
p = p + coord_fixed(ratio=1)
if (!is.null(xlim)) {p = p + xlim(xlim[1],xlim[2])}
if (!is.null(ylim)) {p = p + ylim(ylim[1],ylim[2])}
#p = p + scale_fill_discrete(name = "New Legend Title")

p = p + theme(panel.background=element_blank(),
              axis.text.x=element_text(colour="black",size=12),
              axis.text.y=element_text(colour="black",size=12),
              axis.line=element_line(colour="black"),
              legend.title = element_blank(),
              legend.background = element_rect(color = "black", size = .5, linetype = "solid"),
              legend.key = element_rect(colour = NA, fill = NA),
              legend.position = c(.2,.9)
              )

plot(p)
return(p)
}