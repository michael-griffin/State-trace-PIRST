package au.edu.adelaide.fxmr.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import au.edu.adelaide.fxmr.data.GeneralModel;

public class MRFitsTest {
	double[][][][] data = { { { { 0.9545, 0.9848, 1, 0.9848, 1, 1 }, { 0.9697, 0.9545, 0.9848, 0.9697, 0.9697, 1 },
			{ 0.9545, 0.9848, 1, 0.9545, 1, 0.9545 }, { 0.8939, 0.9394, 0.9697, 0.9697, 1, 0.9848 }, { 0.7273, 0.8636, 0.9091, 1, 1, 1 },
			{ 0.9697, 1, 1, 0.9848, 1, 0.9848 }, { 0.9242, 1, 0.9848, 1, 0.9848, 1 }, { 0.9394, 1, 0.9848, 0.9848, 0.9697, 0.9848 },
			{ 0.9545, 0.9545, 1, 0.9697, 0.9848, 1 }, { 0.5455, 0.5455, 0.9848, 0.9545, 0.9545, 1 },
			{ 0.9697, 0.9545, 1, 0.9848, 0.9697, 0.9697 }, { 0.9545, 0.9697, 1, 0.9848, 0.9848, 1 },
			{ 0.9091, 0.9848, 1, 0.9848, 1, 0.9697 }, { 0.9242, 0.9848, 1, 0.9848, 0.9848, 0.9545 },
			{ 0.9545, 0.9697, 0.9697, 1, 1, 0.9848 }, { 0.8939, 0.9697, 0.9848, 1, 1, 0.9848 },
			{ 0.9545, 0.9697, 0.9848, 0.9848, 1, 0.9697 }, { 0.9394, 1, 1, 1, 1, 1 }, { 0.7879, 0.9697, 0.9697, 0.9545, 1, 1 },
			{ 0.9394, 1, 1, 1, 1, 1 }, { 0.6667, 0.9697, 0.9848, 1, 1, 0.9848 }, { 0.9848, 1, 1, 1, 1, 1 },
			{ 0.6818, 0.9394, 0.9848, 0.9848, 1, 1 }, { 0.8939, 0.8939, 0.9545, 0.9697, 0.9242, 0.9848 },
			{ 0.9697, 1, 1, 1, 0.9697, 0.9848 }, { 0.7121, 1, 1, 0.9697, 0.9848, 1 }, { 0.9545, 1, 1, 1, 0.9848, 1 },
			{ 0.8939, 0.9848, 0.9394, 0.9697, 0.9242, 0.9697 }, { 0.9848, 1, 0.9848, 0.9242, 1, 0.9697 }, { 0.7121, 0.9545, 1, 1, 1, 1 },
			{ 0.4697, 0.4242, 0.4545, 0.5758, 0.5606, 0.4848 }, { 0.7727000000000001, 0.9697, 0.9848, 1, 0.9394, 0.9697 },
			{ 0.9697, 0.9848, 0.9848, 0.9545, 1, 1 }, { 0.697, 1, 1, 1, 1, 0.9848 }, { 0.7727000000000001, 0.9242, 0.9545, 0.9848, 1, 1 },
			{ 0.8030000000000001, 0.9848, 1, 0.9848, 1, 0.9848 }
	}, { { 0.6818, 0.8485, 0.7576000000000001, 0.8030000000000001, 0.7424, 0.7879 },
			{ 0.8333, 0.7576000000000001, 0.9091, 0.8939, 0.8939, 0.8333 }, { 0.8030000000000001, 0.8636, 0.9394, 0.8485, 0.7879, 0.8182 },
			{ 0.6667, 0.8333, 0.7727000000000001, 0.8939, 0.7576000000000001, 0.8030000000000001 },
			{ 0.7576000000000001, 0.8485, 0.8030000000000001, 0.9242, 0.8182, 0.8939 },
			{ 0.8182, 0.8485, 0.9394, 0.8333, 0.7727000000000001, 0.9091 }, { 0.8485, 0.9242, 0.8636, 0.8636, 0.9242, 0.8788 },
			{ 0.7879, 0.9394, 0.9091, 0.9091, 0.8636, 0.9394 }, { 0.8182, 0.7879, 0.8182, 0.9242, 0.8788, 0.8788 },
			{ 0.7576000000000001, 0.8182, 0.697, 0.8333, 0.7121, 0.7576000000000001 },
			{ 0.7424, 0.8636, 0.7727000000000001, 0.9242, 0.9242, 0.9091 }, { 0.5455, 0.5152, 0.5606, 0.5455, 0.4242, 0.5 },
			{ 0.5, 0.7424, 0.8333, 0.8333, 0.8182, 0.7576000000000001 }, { 0.7424, 0.7576000000000001, 0.8939, 0.8788, 0.8939, 0.8788 },
			{ 0.5455, 0.7121, 0.8939, 0.9091, 0.8333, 0.9091 }, { 0.7424, 0.8333, 0.8788, 0.8030000000000001, 0.8182, 0.8788 },
			{ 0.4242, 0.4394, 0.4697, 0.5455, 0.4242, 0.3788 }, { 0.6212, 0.9242, 0.8636, 0.8939, 0.8485, 0.8939 },
			{ 0.7273, 0.8182, 0.8636, 0.8030000000000001, 0.7576000000000001, 0.7576000000000001 },
			{ 0.5152, 0.8485, 0.8636, 0.9545, 0.8485, 0.8636 }, { 0.9091, 0.7121, 0.8788, 0.7727000000000001, 0.7576000000000001, 0.8333 },
			{ 0.7879, 0.9697, 0.8788, 0.8788, 0.9242, 0.9545 }, { 0.7727000000000001, 0.8939, 0.9242, 0.9091, 0.8939, 0.8939 },
			{ 0.7576000000000001, 0.7576000000000001, 0.7121, 0.8030000000000001, 0.8788, 0.7727000000000001 },
			{ 0.5758, 0.5152, 0.4394, 0.5758, 0.4545, 0.6061 }, { 0.8182, 0.8788, 0.8030000000000001, 0.8939, 0.8939, 0.8939 },
			{ 0.8030000000000001, 0.8485, 0.8485, 0.9091, 0.9091, 0.9091 }, { 0.8333, 0.8636, 0.8485, 0.9091, 0.9091, 0.8636 },
			{ 0.7424, 0.8485, 0.8333, 0.8333, 0.8485, 0.7879 }, { 0.4848, 0.6667, 0.5, 0.6061, 0.7121, 0.6667 },
			{ 0.5152, 0.4242, 0.4697, 0.6212, 0.4848, 0.4545 }, { 0.8182, 0.8333, 0.8485, 0.8485, 0.8333, 0.8030000000000001 },
			{ 0.8485, 0.8939, 0.9242, 0.9091, 0.8485, 0.8636 }, { 0.8182, 0.8636, 0.7727000000000001, 0.8788, 0.8788, 0.8939 },
			{ 0.5758, 0.4848, 0.5152, 0.5606, 0.5606, 0.8182 }, { 0.7576000000000001, 0.8788, 0.8636, 0.9091, 0.9545, 0.8788 }
	}, { { 0.6364, 0.8182, 0.8182, 0.8182, 0.8788, 0.8788 }, { 0.8030000000000001, 0.9394, 0.8788, 0.9091, 0.9394, 0.8788 },
			{ 0.4091, 0.6364, 0.8636, 0.8636, 0.8485, 0.7273 }, { 0.4848, 0.4242, 0.4697, 0.4242, 0.5, 0.5606 },
			{ 0.6061, 0.8030000000000001, 0.8636, 0.7879, 0.8030000000000001, 0.8788 },
			{ 0.4091, 0.5, 0.8333, 0.7273, 0.7879, 0.7727000000000001 }, { 0.4697, 0.7424, 0.8636, 0.8030000000000001, 0.8939, 0.8333 },
			{ 0.5303, 0.4848, 0.4394, 0.3939, 0.3788, 0.4242 }, { 0.7424, 0.6818, 0.7576000000000001, 0.8939, 0.8030000000000001, 0.8636 },
			{ 0.6212, 0.7879, 0.8333, 0.8333, 0.7879, 0.8485 }, { 0.5758, 0.7576000000000001, 0.697, 0.8636, 0.9091, 0.7121 },
			{ 0.5455, 0.5303, 0.5455, 0.5455, 0.7879, 0.8182 }, { 0.5455, 0.6818, 0.697, 0.8030000000000001, 0.8030000000000001, 0.8182 },
			{ 0.7424, 0.9545, 0.7273, 0.6061, 0.7424, 0.8636 }, { 0.6515, 0.8485, 0.7879, 0.8485, 0.8485, 0.9242 },
			{ 0.5909, 0.5455, 0.8939, 0.8788, 0.8939, 0.8939 }, { 0.4697, 0.6364, 0.8636, 0.9091, 0.8939, 0.7879 },
			{ 0.697, 0.7273, 0.8182, 0.8030000000000001, 0.8788, 0.7879 },
			{ 0.7121, 0.7727000000000001, 0.7576000000000001, 0.7576000000000001, 0.8030000000000001, 0.8333 },
			{ 0.7727000000000001, 0.8182, 0.7273, 0.8636, 0.8788, 0.9242 }, { 0.5909, 0.7879, 0.7576000000000001, 0.8788, 0.8485, 0.9242 },
			{ 0.4848, 0.7576000000000001, 0.6364, 0.697, 0.5758, 0.697 }, { 0.5455, 0.4697, 0.6061, 0.6364, 0.6818, 0.8788 },
			{ 0.5303, 0.5152, 0.6061, 0.4545, 0.7727000000000001, 0.6212 }, { 0.8182, 0.9091, 0.8939, 0.8182, 0.9394, 0.9545 },
			{ 0.5758, 0.7576000000000001, 0.8030000000000001, 0.8030000000000001, 0.8485, 0.7424 },
			{ 0.7424, 0.8030000000000001, 0.8182, 0.8788, 0.8788, 0.8788 },
			{ 0.7273, 0.6364, 0.7424, 0.8030000000000001, 0.7576000000000001, 0.7727000000000001 },
			{ 0.7424, 0.8333, 0.8030000000000001, 0.8182, 0.8939, 0.8939 }, { 0.4697, 0.5152, 0.5455, 0.5303, 0.697, 0.5909 },
			{ 0.4242, 0.5, 0.7273, 0.7727000000000001, 0.7879, 0.8485 }, { 0.4697, 0.8485, 0.7727000000000001, 0.7879, 0.8333, 0.7424 },
			{ 0.4848, 0.5303, 0.4848, 0.5606, 0.4242, 0.4545 }, { 0.5455, 0.4697, 0.6364, 0.7879, 0.7727000000000001, 0.7424 },
			{ 0.4394, 0.4091, 0.7424, 0.7424, 0.8182, 0.8030000000000001 }, { 0.4848, 0.4697, 0.4545, 0.4394, 0.5152, 0.5 }
	}, { { 0.6364, 0.7424, 0.8939, 0.8788, 0.8788, 0.8788 }, { 0.5455, 0.6818, 0.8333, 0.9697, 0.9091, 0.9091 },
			{ 0.5909, 0.7273, 0.8485, 0.8788, 0.9545, 0.9242 }, { 0.5909, 0.6818, 0.8636, 0.8485, 0.8182, 0.8636 },
			{ 0.8182, 0.8182, 0.8182, 0.8788, 0.8788, 0.9394 }, { 0.6515, 0.6818, 0.8182, 0.8939, 0.9091, 0.8939 },
			{ 0.6061, 0.5758, 0.5606, 0.6061, 0.6061, 0.4848 }, { 0.6061, 0.6212, 0.6818, 0.6667, 0.7576000000000001, 0.7424 },
			{ 0.6515, 0.4848, 0.697, 0.6515, 0.7273, 0.6667 }, { 0.4242, 0.6212, 0.7879, 0.7727000000000001, 0.8333, 0.7576000000000001 },
			{ 0.5758, 0.5909, 0.7424, 0.7121, 0.8030000000000001, 0.8485 }, { 0.6061, 0.6364, 0.5606, 0.5909, 0.5909, 0.4394 },
			{ 0.6515, 0.6061, 0.8333, 0.9091, 0.9545, 0.9394 }, { 0.7121, 0.7576000000000001, 0.9394, 0.9697, 0.9545, 0.9091 },
			{ 0.5, 0.7121, 0.8333, 0.8182, 0.8030000000000001, 0.8939 }, { 0.6061, 0.8333, 0.8788, 0.8788, 0.8939, 0.8485 },
			{ 0.5758, 0.7121, 0.7273, 0.6212, 0.7273, 0.7424 }, { 0.6667, 0.6818, 0.8030000000000001, 0.8030000000000001, 0.8333, 0.8788 },
			{ 0.6212, 0.7727000000000001, 0.8485, 0.697, 0.8788, 0.8030000000000001 }, { 0.5152, 0.8333, 0.8485, 0.8788, 0.8636, 0.8788 },
			{ 0.7273, 0.8030000000000001, 0.8333, 0.8636, 0.8030000000000001, 0.8333 }, { 0.7121, 0.7879, 0.8788, 0.9545, 0.9697, 0.9394 },
			{ 0.6818, 0.7273, 0.8333, 0.8333, 0.8636, 0.8485 }, { 0.7273, 0.5909, 0.6818, 0.7576000000000001, 0.8030000000000001, 0.8636 },
			{ 0.6818, 0.7576000000000001, 0.7879, 0.7879, 0.8788, 0.8636 }, { 0.6364, 0.6364, 0.7273, 0.8333, 0.9242, 0.9394 },
			{ 0.5758, 0.7576000000000001, 0.8182, 0.8030000000000001, 0.8182, 0.8333 }, { 0.5758, 0.6818, 0.7273, 0.7879, 0.7424, 0.7121 },
			{ 0.5909, 0.5152, 0.6515, 0.697, 0.8182, 0.8788 }, { 0.7424, 0.8636, 0.9242, 0.9697, 0.9242, 0.9697 },
			{ 0.5606, 0.697, 0.697, 0.7727000000000001, 0.6818, 0.6515 },
			{ 0.6818, 0.7121, 0.8030000000000001, 0.7424, 0.8333, 0.7576000000000001 }, { 0.7121, 0.7424, 0.8182, 0.8939, 0.8485, 0.8485 },
			{ 0.6515, 0.8333, 0.9848, 0.9394, 0.8636, 0.8182 },
			{ 0.5909, 0.7121, 0.7576000000000001, 0.7879, 0.7727000000000001, 0.7727000000000001 },
			{ 0.697, 0.8939, 0.9697, 0.8939, 0.0455, 0.8788 }
	}, { { 0.5909, 0.7273, 0.6061, 0.5455, 0.7121, 0.6667 }, { 0.7121, 0.7879, 0.9242, 0.9091, 0.8182, 0.8939 },
			{ 0.6667, 0.7273, 0.6515, 0.7727000000000001, 0.8485, 0.8485 }, { 0.4545, 0.3939, 0.5152, 0.5455, 0.5303, 0.4394 },
			{ 0.5758, 0.7424, 0.6667, 0.697, 0.7424, 0.7879 }, { 0.6818, 0.7879, 0.8485, 0.8333, 0.8333, 0.8333 },
			{ 0.5152, 0.5758, 0.5606, 0.6061, 0.5, 0.4697 }, { 0.5909, 0.6515, 0.6364, 0.7576000000000001, 0.697, 0.7273 },
			{ 0.6667, 0.6515, 0.5758, 0.7727000000000001, 0.7576000000000001, 0.6818 }, { 0.5909, 0.5455, 0.5909, 0.5758, 0.697, 0.5606 },
			{ 0.5152, 0.6061, 0.5606, 0.7576000000000001, 0.7424, 0.7121 }, { 0.5758, 0.5606, 0.6667, 0.5303, 0.5303, 0.5455 },
			{ 0.7879, 0.8636, 0.8939, 0.8939, 0.8939, 0.8182 }, { 0.8030000000000001, 0.9394, 0.8182, 0.9545, 0.9545, 0.8333 },
			{ 0.6667, 0.6818, 0.6364, 0.697, 0.697, 0.7879 }, { 0.5303, 0.5152, 0.5758, 0.6212, 0.6818, 0.7424 },
			{ 0.6515, 0.6061, 0.5606, 0.6212, 0.6515, 0.7121 }, { 0.8182, 0.8485, 0.8636, 0.8939, 0.8636, 0.9091 },
			{ 0.7576000000000001, 0.7879, 0.8333, 0.8788, 0.8939, 0.7879 }, { 0.7273, 0.7273, 0.8182, 0.8788, 0.8636, 0.8030000000000001 },
			{ 0.4848, 0.5152, 0.6061, 0.5303, 0.4848, 0.5 }, { 0.6061, 0.6364, 0.5909, 0.5606, 0.5758, 0.6061 },
			{ 0.5758, 0.5758, 0.6364, 0.6818, 0.697, 0.6364 }, { 0.5, 0.6515, 0.6515, 0.7727000000000001, 0.7727000000000001, 0.8182 },
			{ 0.5303, 0.6818, 0.697, 0.7727000000000001, 0.8030000000000001, 0.6818 },
			{ 0.4091, 0.6212, 0.7121, 0.7879, 0.7879, 0.7727000000000001 }, { 0.7121, 0.8030000000000001, 0.8636, 0.8939, 0.8939, 0.8939 },
			{ 0.5, 0.5909, 0.6212, 0.697, 0.6515, 0.7121 }, { 0.7121, 0.8333, 0.8788, 0.9242, 0.8788, 0.9091 },
			{ 0.7121, 0.6667, 0.8485, 0.7727000000000001, 0.8182, 0.8030000000000001 }, { 0.5758, 0.6212, 0.5303, 0.5909, 0.6061, 0.5758 },
			{ 0.5455, 0.6364, 0.6364, 0.5758, 0.5606, 0.6667 }, { 0.6212, 0.5303, 0.6515, 0.6212, 0.7273, 0.7121 },
			{ 0.4545, 0.6212, 0.5606, 0.7121, 0.7879, 0.6667 }, { 0.7273, 0.8030000000000001, 0.8182, 0.8636, 0.8182, 0.7879 },
			{ 0.4697, 0.6212, 0.6515, 0.697, 0.7273, 0.5758 }
	}, { { 0.5303, 0.5, 0.6061, 0.5909, 0.6667, 0.5758 }, { 0.6364, 0.7576000000000001, 0.8485, 0.7273, 0.8182, 0.7576000000000001 },
			{ 0.6364, 0.5, 0.5303, 0.4848, 0.4697, 0.5909 }, { 0.4697, 0.4848, 0.5455, 0.5909, 0.5909, 0.5 },
			{ 0.5, 0.4091, 0.5, 0.3636, 0.4545, 0.5303 }, { 0.7273, 0.7879, 0.7424, 0.6818, 0.8030000000000001, 0.7576000000000001 },
			{ 0.4848, 0.5303, 0.5, 0.5152, 0.5, 0.6667 }, { 0.5909, 0.6818, 0.7121, 0.6515, 0.697, 0.6667 },
			{ 0.697, 0.6364, 0.6667, 0.6061, 0.6818, 0.5758 }, { 0.4545, 0.5303, 0.5909, 0.5758, 0.5152, 0.6364 },
			{ 0.5606, 0.6212, 0.4394, 0.4545, 0.697, 0.4697 }, { 0.5, 0.6061, 0.5909, 0.5303, 0.5152, 0.6818 },
			{ 0.6364, 0.7424, 0.7727000000000001, 0.8333, 0.7424, 0.8939 },
			{ 0.6212, 0.7576000000000001, 0.8030000000000001, 0.6515, 0.7121, 0.7273 }, { 0.5152, 0.5152, 0.6061, 0.5606, 0.5758, 0.5909 },
			{ 0.4697, 0.5909, 0.4697, 0.5, 0.5152, 0.4697 }, { 0.4545, 0.5, 0.5455, 0.5, 0.5455, 0.4394 },
			{ 0.6364, 0.6818, 0.7424, 0.7576000000000001, 0.6818, 0.6515 }, { 0.5758, 0.6515, 0.6515, 0.7273, 0.6667, 0.697 },
			{ 0.6667, 0.7879, 0.8333, 0.7576000000000001, 0.8030000000000001, 0.8333 }, { 0.4697, 0.5606, 0.5758, 0.5758, 0.4848, 0.4545 },
			{ 0.5, 0.6061, 0.5303, 0.5758, 0.4545, 0.4394 }, { 0.5, 0.5, 0.4848, 0.5758, 0.5909, 0.5606 },
			{ 0.5455, 0.5909, 0.6364, 0.5758, 0.7273, 0.6212 }, { 0.4697, 0.4848, 0.5303, 0.6818, 0.5606, 0.6364 },
			{ 0.5455, 0.5152, 0.6212, 0.7424, 0.7273, 0.7273 },
			{ 0.7273, 0.8333, 0.8030000000000001, 0.7576000000000001, 0.7576000000000001, 0.7879 },
			{ 0.6061, 0.6212, 0.6364, 0.6061, 0.6364, 0.5303 }, { 0.6364, 0.7576000000000001, 0.7576000000000001, 0.6818, 0.7273, 0.7273 },
			{ 0.5758, 0.6061, 0.6061, 0.4545, 0.6212, 0.5303 }, { 0.4697, 0.4394, 0.6212, 0.5455, 0.5455, 0.6667 },
			{ 0.4848, 0.5909, 0.5303, 0.5909, 0.5152, 0.4697 }, { 0.5, 0.5606, 0.6364, 0.5152, 0.5303, 0.5152 },
			{ 0.4697, 0.5455, 0.5758, 0.6212, 0.5, 0.5455 }, { 0.5455, 0.6212, 0.7273, 0.6667, 0.7121, 0.5606 },
			{ 0.5758, 0.5152, 0.5455, 0.4697, 0.5152, 0.4394 }
	}
	}, { { { 0.9848, 1, 0.9848, 1, 0.9848, 0.9545 }, { 0.9242, 1, 1, 1, 0.9848, 1 }, { 1, 1, 1, 1, 1, 1 },
			{ 0.9697, 1, 0.9848, 0.9848, 1, 1 }, { 0.9545, 0.9697, 1, 1, 1, 1 }, { 0.9545, 0.9697, 0.9848, 1, 0.9848, 1 },
			{ 0.9242, 0.9394, 0.9848, 0.9848, 0.9697, 0.9848 }, { 0.9697, 0.9697, 0.9545, 0.9697, 0.8939, 0.9545 },
			{ 0.9697, 0.9848, 1, 1, 1, 1 }, { 0.8333, 1, 1, 1, 1, 1 }, { 0.5909, 0.9394, 1, 1, 1, 1 }, { 0.8333, 1, 1, 0.9848, 0.9848, 1 },
			{ 0.9545, 1, 0.9848, 1, 0.9848, 1 }, { 0.7727000000000001, 1, 1, 1, 1, 1 }, { 0.9394, 0.9848, 1, 0.9848, 0.9545, 0.9848 },
			{ 0.6061, 0.9545, 1, 1, 1, 1 }, { 0.9394, 0.9697, 0.9848, 0.9545, 0.9545, 0.9697 }, { 0.8939, 0.9848, 1, 1, 0.9848, 1 },
			{ 0.5758, 0.9394, 0.9848, 0.9848, 0.9848, 1 }, { 0.9394, 1, 1, 0.9848, 0.9545, 0.9242 }, { 0.9697, 1, 0.9545, 1, 1, 0.9848 },
			{ 0.7879, 1, 1, 1, 1, 1 }, { 0.8485, 0.9848, 1, 1, 1, 1 }, { 0.8333, 1, 0.9697, 0.9545, 0.9545, 0.9091 },
			{ 0.8788, 0.9697, 0.9848, 0.9848, 0.9697, 0.9848 }, { 0.9394, 1, 1, 1, 1, 0.9848 }, { 0.7424, 1, 1, 1, 1, 1 },
			{ 0.9545, 1, 1, 1, 1, 1 }, { 0.9394, 1, 1, 1, 1, 1 }, { 0.9242, 1, 1, 1, 1, 0.9848 }, { 0.9394, 0.9242, 1, 0.9848, 1, 1 },
			{ 0.8788, 1, 1, 1, 0.9848, 1 }, { 0.8788, 0.9848, 1, 1, 0.9697, 0.9848 }, { 1, 1, 1, 0.9848, 1, 1 },
			{ 0.9697, 1, 1, 1, 0.9848, 0.9848 }, { 1, 1, 1, 0.9394, 1, 0.9697 }, { 1, 1, 0.9848, 1, 1, 1 },
			{ 0.9697, 0.9848, 1, 0.9697, 0.9697, 0.9848 }
	}, { { 0.7727000000000001, 0.8636, 0.8939, 0.8788, 0.8636, 0.9242 }, { 0.8636, 0.8485, 0.8636, 0.8788, 0.8333, 0.8333 },
			{ 0.7424, 0.8788, 0.8788, 0.9242, 0.8788, 0.8333 }, { 0.5909, 0.8939, 0.8182, 0.9242, 0.9697, 0.8636 },
			{ 0.6364, 0.5152, 0.9091, 0.8939, 0.8485, 0.9697 }, { 0.7879, 0.9394, 0.8939, 0.9394, 0.8182, 0.9242 },
			{ 0.8333, 0.9091, 0.9545, 0.9394, 0.9697, 0.9848 }, { 0.5606, 0.8485, 0.8182, 0.8182, 0.8333, 0.8788 },
			{ 0.7727000000000001, 0.9394, 0.9242, 0.8333, 0.7879, 0.8030000000000001 }, { 0.4697, 0.4848, 0.5, 0.5758, 0.4697, 0.697 },
			{ 0.8182, 0.9242, 0.8636, 0.9242, 0.8788, 0.9545 }, { 0.8333, 0.8939, 0.9091, 0.9091, 0.8485, 0.8636 },
			{ 0.7424, 0.8333, 0.8182, 0.9394, 0.8333, 0.8030000000000001 }, { 0.8030000000000001, 0.8788, 0.7879, 0.8182, 0.9242, 0.8182 },
			{ 0.3939, 0.5303, 0.8939, 0.8636, 0.7727000000000001, 0.8485 }, { 0.5455, 0.697, 0.8182, 0.8788, 0.9091, 0.8333 },
			{ 0.7576000000000001, 0.8939, 0.9545, 0.8939, 0.8788, 0.8485 }, { 0.8333, 0.8030000000000001, 0.8636, 0.8182, 0.8182, 0.8939 },
			{ 0.8485, 0.9394, 0.9394, 0.9394, 0.9394, 0.9091 }, { 0.7121, 0.9091, 0.8939, 0.8636, 0.9091, 0.8182 },
			{ 0.7879, 0.8788, 0.9091, 0.8939, 0.8788, 0.8939 }, { 0.8636, 0.8333, 0.8788, 0.8636, 0.9091, 0.9242 },
			{ 0.7879, 0.8939, 0.8333, 0.8182, 0.8485, 0.8788 }, { 0.4848, 0.8485, 0.7727000000000001, 0.8788, 0.7121, 0.7424 },
			{ 0.5909, 0.7424, 0.8636, 0.8182, 0.8030000000000001, 0.8485 }, { 0.7727000000000001, 0.6818, 0.8636, 0.9091, 0.8636, 0.9091 },
			{ 0.8182, 0.8636, 0.9394, 0.9394, 0.9394, 0.9242 }, { 0.7273, 0.7273, 0.6818, 0.9091, 0.9242, 0.8939 },
			{ 0.7727000000000001, 0.8636, 0.8182, 0.8788, 0.9242, 0.9091 }, { 0.8788, 0.9545, 0.9242, 0.8788, 0.8182, 0.8636 },
			{ 0.8939, 0.8333, 0.8333, 0.8788, 0.8030000000000001, 0.8788 }, { 0.7879, 0.8485, 0.8636, 0.8636, 0.8030000000000001, 0.9091 },
			{ 0.8333, 0.7121, 0.9091, 0.8939, 0.8485, 0.8636 }, { 0.8788, 0.8485, 0.9091, 0.8333, 0.8788, 0.9091 },
			{ 0.8788, 0.8788, 0.9242, 0.9242, 0.8485, 0.8485 }, { 0.4394, 0.3939, 0.4545, 0.5152, 0.3939, 0.4242 },
			{ 0.6667, 0.7273, 0.8485, 0.8788, 0.8939, 0.7879 }, { 0.8030000000000001, 0.8182, 0.8939, 0.9242, 0.8939, 0.9697 }
	}, { { 0.7727000000000001, 0.9394, 0.8030000000000001, 0.8636, 0.8788, 0.9091 }, { 0.6515, 0.8182, 0.8939, 0.8636, 0.7879, 0.7879 },
			{ 0.5606, 0.5152, 0.7121, 0.7424, 0.8485, 0.8939 }, { 0.6667, 0.8333, 0.8485, 0.8030000000000001, 0.9242, 0.8788 },
			{ 0.5455, 0.5, 0.7879, 0.9394, 0.8030000000000001, 0.8485 }, { 0.8788, 0.8788, 0.8030000000000001, 0.8333, 0.9091, 0.9242 },
			{ 0.6515, 0.8636, 0.8788, 0.8485, 0.8333, 0.9394 }, { 0.697, 0.7424, 0.8030000000000001, 0.8030000000000001, 0.9242, 0.8182 },
			{ 0.7121, 0.8939, 0.8636, 0.8636, 0.7727000000000001, 0.8485 }, { 0.4848, 0.4394, 0.5455, 0.4545, 0.5152, 0.4697 },
			{ 0.4848, 0.4545, 0.5455, 0.8636, 0.9545, 0.8939 }, { 0.5909, 0.8485, 0.8788, 0.8333, 0.8485, 0.8939 },
			{ 0.5, 0.7727000000000001, 0.8182, 0.8788, 0.9545, 0.8788 },
			{ 0.5, 0.7576000000000001, 0.8030000000000001, 0.7576000000000001, 0.8939, 0.8636 },
			{ 0.4848, 0.5909, 0.8333, 0.7879, 0.8030000000000001, 0.7879 }, { 0.4848, 0.6061, 0.8182, 0.8182, 0.8182, 0.7727000000000001 },
			{ 0.6212, 0.7424, 0.7879, 0.8182, 0.8030000000000001, 0.8636 },
			{ 0.7424, 0.8030000000000001, 0.7424, 0.8485, 0.9091, 0.7576000000000001 },
			{ 0.8333, 0.7727000000000001, 0.8788, 0.8636, 0.8636, 0.7879 }, { 0.5909, 0.7576000000000001, 0.7424, 0.8182, 0.8182, 0.8485 },
			{ 0.5455, 0.6667, 0.8788, 0.7727000000000001, 0.8030000000000001, 0.8182 }, { 0.5, 0.8788, 0.8636, 0.8939, 0.8788, 0.8485 },
			{ 0.697, 0.7727000000000001, 0.8636, 0.9091, 0.8788, 0.9242 }, { 0.8182, 0.7879, 0.8636, 0.7273, 0.8939, 0.8182 },
			{ 0.5758, 0.7121, 0.7576000000000001, 0.9091, 0.8788, 0.9091 }, { 0.5303, 0.9545, 0.8939, 0.8939, 0.8636, 0.8788 },
			{ 0.4545, 0.5455, 0.5455, 0.4697, 0.4848, 0.6818 },
			{ 0.7727000000000001, 0.7576000000000001, 0.7121, 0.7727000000000001, 0.8788, 0.7576000000000001 },
			{ 0.4697, 0.6364, 0.5606, 0.6667, 0.7727000000000001, 0.7273 }, { 0.7121, 0.8788, 0.9242, 0.8182, 0.8030000000000001, 0.9091 },
			{ 0.6515, 0.8333, 0.8788, 0.8788, 0.9545, 0.8485 }, { 0.8030000000000001, 0.9242, 0.8182, 0.8333, 0.9545, 0.9091 },
			{ 0.4394, 0.6212, 0.8636, 0.8939, 0.8788, 0.8182 }, { 0.697, 0.7273, 0.6818, 0.7727000000000001, 0.8788, 0.9697 },
			{ 0.8030000000000001, 0.8485, 0.8939, 0.8333, 0.9394, 0.8939 }, { 0.4848, 0.4697, 0.5152, 0.6515, 0.4848, 0.5152 },
			{ 0.7121, 0.8333, 0.7424, 0.7273, 0.697, 0.5909 }, { 0.5606, 0.9242, 0.8636, 0.8182, 0.7879, 0.8182 }
	}, { { 0.6212, 0.7273, 0.8939, 0.9242, 0.8485, 0.9242 }, { 0.5606, 0.6061, 0.6667, 0.5606, 0.6818, 0.6061 },
			{ 0.5303, 0.6515, 0.6667, 0.6515, 0.7273, 0.7879 }, { 0.4848, 0.7121, 0.697, 0.8636, 0.8788, 0.8788 },
			{ 0.697, 0.6061, 0.8030000000000001, 0.6212, 0.8333, 0.7879 }, { 0.6061, 0.7273, 0.7121, 0.8485, 0.8788, 0.7879 },
			{ 0.8636, 0.9545, 0.9545, 0.8485, 0.9242, 0.9091 }, { 0.697, 0.9394, 0.9697, 0.9697, 0.9394, 0.9242 },
			{ 0.6515, 0.6212, 0.697, 0.6515, 0.5909, 0.6364 }, { 0.6212, 0.6061, 0.7576000000000001, 0.8333, 0.8182, 0.8333 },
			{ 0.8182, 0.9091, 0.9242, 0.9394, 0.9545, 0.9545 }, { 0.8333, 0.9848, 0.9394, 0.9848, 1, 0.9697 },
			{ 0.6061, 0.6061, 0.7424, 0.8333, 0.7727000000000001, 0.8788 }, { 0.6818, 0.7273, 0.8788, 0.7727000000000001, 0.7273, 0.7273 },
			{ 0.6212, 0.6667, 0.7879, 0.697, 0.8182, 0.7121 }, { 0.4848, 0.7727000000000001, 0.8182, 0.7879, 0.8939, 0.9242 },
			{ 0.6061, 0.7273, 0.8182, 0.8030000000000001, 0.8182, 0.8485 },
			{ 0.6667, 0.6515, 0.7576000000000001, 0.8030000000000001, 0.8636, 0.8030000000000001 },
			{ 0.7424, 0.9242, 0.8485, 0.9545, 0.9394, 0.9697 }, { 0.6061, 0.7424, 0.7727000000000001, 0.8030000000000001, 0.8182, 0.8182 },
			{ 0.6818, 0.7121, 0.8939, 0.8939, 0.9545, 0.9697 }, { 0.5606, 0.7273, 0.9091, 0.9091, 0.8939, 0.9242 },
			{ 0.8030000000000001, 0.8333, 0.8939, 0.8939, 0.8788, 0.9394 }, { 0.6212, 0.6667, 0.6667, 0.7273, 0.8485, 0.8182 },
			{ 0.6667, 0.7879, 0.8485, 0.8333, 0.9242, 0.8939 }, { 0.8939, 0.9545, 0.9848, 0.9848, 1, 1 },
			{ 0.6515, 0.8030000000000001, 0.8939, 0.9697, 0.9545, 0.9848 }, { 0.6212, 0.8182, 0.7424, 0.7121, 0.8182, 0.8636 },
			{ 0.8333, 0.9394, 1, 0.9545, 0.9091, 0.9394 }, { 0.8485, 0.9242, 1, 0.9545, 1, 0.9697 },
			{ 0.5, 0.697, 0.7273, 0.7879, 0.8939, 0.9091 }, { 0.5758, 0.7424, 0.8182, 0.9545, 0.8939, 0.9394 },
			{ 0.7576000000000001, 0.8030000000000001, 0.8485, 0.8485, 0.8788, 0.8485 },
			{ 0.7879, 0.8333, 0.7424, 0.7576000000000001, 0.7727000000000001, 0.7424 }, { 0.4848, 0.7424, 0.8182, 0.7879, 0.9091, 0.8939 },
			{ 0.6364, 0.5303, 0.5909, 0.4848, 0.5455, 0.6212 }, { 0.5, 0.5909, 0.6515, 0.7121, 0.7727000000000001, 0.8182 },
			{ 0.697, 0.9242, 0.8485, 0.8636, 0.9091, 0.9091 }
	}, { { 0.7879, 0.7424, 0.8788, 0.7879, 0.8333, 0.8333 }, { 0.6061, 0.5909, 0.697, 0.8182, 0.8333, 0.7879 },
			{ 0.6515, 0.697, 0.6364, 0.7121, 0.7424, 0.8485 }, { 0.6515, 0.6212, 0.7576000000000001, 0.8030000000000001, 0.7273, 0.6818 },
			{ 0.7121, 0.6212, 0.6667, 0.7121, 0.697, 0.7121 },
			{ 0.5758, 0.8030000000000001, 0.8030000000000001, 0.7576000000000001, 0.8485, 0.8333 },
			{ 0.697, 0.8939, 0.9242, 0.9545, 0.9697, 0.9848 }, { 0.8030000000000001, 0.8333, 0.8333, 0.8333, 0.9697, 0.9394 },
			{ 0.5455, 0.6818, 0.7121, 0.8485, 0.8636, 0.9242 }, { 0.5, 0.5909, 0.5758, 0.5455, 0.6818, 0.5909 },
			{ 0.5909, 0.7879, 0.7273, 0.8030000000000001, 0.7727000000000001, 0.7727000000000001 },
			{ 0.6061, 0.6212, 0.8333, 0.8182, 0.8939, 0.9091 }, { 0.8030000000000001, 0.8182, 0.8636, 0.8788, 0.9242, 0.8788 },
			{ 0.5152, 0.7273, 0.7727000000000001, 0.7879, 0.8636, 0.8939 }, { 0.8030000000000001, 0.8485, 0.8636, 0.9242, 0.8636, 0.8939 },
			{ 0.6667, 0.7273, 0.6515, 0.7273, 0.7576000000000001, 0.7727000000000001 },
			{ 0.697, 0.7424, 0.7727000000000001, 0.7576000000000001, 0.8182, 0.8636 },
			{ 0.6515, 0.7727000000000001, 0.8333, 0.8636, 0.8788, 0.8788 }, { 0.9091, 0.9545, 0.9242, 0.9242, 0.9697, 0.9697 },
			{ 0.7121, 0.7879, 0.8788, 0.7879, 0.8788, 0.7879 }, { 0.6818, 0.7576000000000001, 0.8939, 0.9242, 0.9545, 0.9242 },
			{ 0.7273, 0.6818, 0.7424, 0.7121, 0.7727000000000001, 0.8030000000000001 },
			{ 0.6818, 0.7424, 0.7879, 0.7576000000000001, 0.7879, 0.7879 }, { 0.8333, 0.8182, 0.697, 0.7879, 0.8333, 0.8030000000000001 },
			{ 0.4848, 0.6515, 0.6515, 0.697, 0.6667, 0.6212 }, { 0.7424, 0.7879, 0.7121, 0.7424, 0.8788, 0.8636 },
			{ 0.5152, 0.6212, 0.8030000000000001, 0.8030000000000001, 0.8636, 0.7879 }, { 0.7424, 0.8182, 0.9091, 0.8788, 0.9091, 0.9697 },
			{ 0.5606, 0.8030000000000001, 0.8788, 0.8182, 0.9242, 0.9545 }, { 0.7121, 0.9091, 0.8939, 0.8485, 0.8788, 0.8788 },
			{ 0.4848, 0.6061, 0.4545, 0.6515, 0.5909, 0.5303 }, { 0.8030000000000001, 0.8030000000000001, 0.8636, 0.8939, 0.8788, 0.8485 },
			{ 0.6667, 0.6061, 0.6061, 0.4848, 0.6515, 0.4848 }, { 0.697, 0.697, 0.7727000000000001, 0.7879, 0.8333, 0.7727000000000001 },
			{ 0.7424, 0.8788, 0.8788, 0.8788, 0.8939, 0.8636 }, { 0.5909, 0.6212, 0.5606, 0.6515, 0.6667, 0.7121 },
			{ 0.5909, 0.7576000000000001, 0.8182, 0.7424, 0.7273, 0.8636 }, { 0.6818, 0.8182, 0.8030000000000001, 0.8182, 0.9394, 0.9091 }
	}, { { 0.5909, 0.7576000000000001, 0.7576000000000001, 0.6818, 0.7121, 0.7121 }, { 0.5909, 0.7424, 0.6364, 0.6818, 0.7121, 0.7121 },
			{ 0.5606, 0.7273, 0.6364, 0.7121, 0.7121, 0.7121 }, { 0.5758, 0.5758, 0.6515, 0.7424, 0.7576000000000001, 0.7273 },
			{ 0.4394, 0.4545, 0.5455, 0.6061, 0.6212, 0.5606 }, { 0.6061, 0.6061, 0.697, 0.7576000000000001, 0.7121, 0.7121 },
			{ 0.5606, 0.6818, 0.8030000000000001, 0.7727000000000001, 0.8030000000000001, 0.8333 },
			{ 0.6212, 0.6667, 0.8030000000000001, 0.7273, 0.7424, 0.7273 }, { 0.6515, 0.6061, 0.6364, 0.7727000000000001, 0.9091, 0.6818 },
			{ 0.6061, 0.5152, 0.4697, 0.5606, 0.5758, 0.5 }, { 0.5, 0.5152, 0.4848, 0.5606, 0.3788, 0.5455 },
			{ 0.4848, 0.5152, 0.5303, 0.5758, 0.6061, 0.7576000000000001 }, { 0.5152, 0.5758, 0.6061, 0.697, 0.7121, 0.6818 },
			{ 0.3939, 0.5909, 0.6364, 0.5758, 0.5303, 0.5303 }, { 0.5606, 0.7273, 0.7576000000000001, 0.7879, 0.7879, 0.7727000000000001 },
			{ 0.5303, 0.6061, 0.5909, 0.4545, 0.5152, 0.5 }, { 0.6515, 0.7879, 0.7273, 0.7273, 0.7121, 0.7273 },
			{ 0.5, 0.5606, 0.697, 0.6667, 0.6818, 0.697 }, { 0.7879, 0.7576000000000001, 0.8030000000000001, 0.8636, 0.8788, 0.8939 },
			{ 0.7879, 0.6667, 0.7576000000000001, 0.7273, 0.7121, 0.6364 },
			{ 0.6061, 0.697, 0.8485, 0.7273, 0.8030000000000001, 0.8030000000000001 }, { 0.4545, 0.5455, 0.5909, 0.6364, 0.6212, 0.6364 },
			{ 0.6364, 0.6061, 0.5152, 0.5455, 0.5606, 0.6061 }, { 0.5152, 0.5909, 0.6515, 0.6061, 0.5303, 0.4848 },
			{ 0.6212, 0.6061, 0.6212, 0.6212, 0.5, 0.5606 }, { 0.5152, 0.6364, 0.6818, 0.6667, 0.5152, 0.5606 },
			{ 0.3788, 0.5152, 0.6061, 0.6515, 0.6061, 0.5909 }, { 0.6515, 0.7273, 0.7879, 0.7727000000000001, 0.8485, 0.7424 },
			{ 0.5606, 0.5606, 0.5, 0.5455, 0.5909, 0.5909 }, { 0.4394, 0.5152, 0.6212, 0.5758, 0.6667, 0.6364 },
			{ 0.5758, 0.4848, 0.6061, 0.6212, 0.7273, 0.5606 }, { 0.6818, 0.8182, 0.8485, 0.8333, 0.8182, 0.8485 },
			{ 0.5606, 0.5455, 0.5152, 0.5606, 0.5303, 0.4848 }, { 0.4394, 0.4091, 0.4697, 0.5152, 0.5909, 0.5758 },
			{ 0.7576000000000001, 0.7424, 0.7879, 0.7576000000000001, 0.7727000000000001, 0.7576000000000001 },
			{ 0.5303, 0.5455, 0.5909, 0.6515, 0.5909, 0.6515 }, { 0.5152, 0.6364, 0.6061, 0.6212, 0.6061, 0.6818 },
			{ 0.5, 0.5152, 0.5758, 0.6212, 0.5909, 0.7273 }
	}
	}
	};

	@Test
	public void mrFitstTest() {
		CMRxFitsGMProblemMaker problem = new CMRxFitsGMProblemMaker();
		problem.setShrink(-1);
		int ngroup = 2;
		int nvar = 6;
		int nCond = 12;

		int index = problem.initAdj();
		problem.addAdj(nCond, index, new int[] { 1, 2, 3, 4, 5, 6 });
		problem.addAdj(nCond, index, new int[] { 7, 8, 9, 10, 11, 12 });
		problem.dupeAdj(nvar);

		for (int group = 0; group < ngroup; group++)
			for (int var = 0; var < nvar; var++)
				problem.addCell(group, var, data[group][var]);

		Fits sol = problem.solve(300, -1, false, true, 0, 0);

		// Be careful - it's possible these may fail and that's ok (sometimes)
		assertTrue(sol.getP() > 0.04);
		assertTrue(sol.getP() < 0.11);
	}

	@Test
	public void mrFitstParametricTest() {
		GeneralModel gm = new GeneralModel();
		int ngroup = 2;
		int nvar = 6;

		int s = 0;
		for (int group = 0; group < ngroup; group++)
			for (int var = 0; var < nvar; var++)
				for (double[] d : data[group][var])
					gm.addData(s++, group, var, d);

		CombinedStatsSTA[] ys = gm.calcStats();

		CMRxFitsProblemMaker problem = new CMRxFitsProblemMaker();

		int[] ns = new int[nvar];
		s = 0;
		for (CombinedStatsSTA y : ys) {
			problem.addMeanArray(y.getMeans().toArray());
			problem.addWeightArray(y.getWeights().toArray());
			problem.addCov(y.getCovariances().toArray());
			ns[s++] = y.getN()[0];
		}
		problem.setN(ns);

		int nCond = 12;

		int index = problem.initAdj();
		problem.addAdj(nCond, index, new int[] { 1, 2, 3, 4, 5, 6 });
		problem.addAdj(nCond, index, new int[] { 7, 8, 9, 10, 11, 12 });
		problem.dupeAdj(nvar);

		Fits sol = new CMRxFits(300, problem.getProblem(), -1, 0, false, true, 0, 0);

		// System.out.println(sol.getP());
		// System.out.println(sol.getDataFit());
		// System.out.println(Arrays.toString(sol.getFits()));

		// Be careful - it's possible these may fail and that's ok (sometimes)
		assertTrue(sol.getP() > 0.01);
		assertTrue(sol.getP() < 0.05);
	}
	
	@Test
	public void mrFitstApproximateTest() {
		GeneralModel gm = new GeneralModel();
		int ngroup = 2;
		int nvar = 6;

		int s = 0;
		for (int group = 0; group < ngroup; group++)
			for (int var = 0; var < nvar; var++)
				for (double[] d : data[group][var])
					gm.addData(s++, group, var, d);

		CombinedStatsSTA[] ys = gm.calcStats();

		CMRxFitsProblemMaker problem = new CMRxFitsProblemMaker();

		int[] ns = new int[nvar];
		s = 0;
		for (CombinedStatsSTA y : ys) {
			problem.addMeanArray(y.getMeans().toArray());
			problem.addWeightArray(y.getWeights().toArray());
			problem.addCov(y.getCovariances().toArray());
			ns[s++] = y.getN()[0];
		}
		problem.setN(ns);

		int nCond = 12;

		int index = problem.initAdj();
		problem.addAdj(nCond, index, new int[] { 1, 2, 3, 4, 5, 6 });
		problem.addAdj(nCond, index, new int[] { 7, 8, 9, 10, 11, 12 });
		problem.dupeAdj(nvar);

		Fits sol = new CMRxFits(200, problem.getProblem(), -1, 0, false, true, 0, 0);
		
		// System.out.println(sol.getP());
		// System.out.println(sol.getDataFit());
		// System.out.println(Arrays.toString(sol.getFits()));

		// Be careful - it's possible these may fail and that's ok (sometimes)
		assertTrue(sol.getP() > 0.005);
		assertTrue(sol.getP() < 0.06);
	}
}
