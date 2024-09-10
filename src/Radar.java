class Radar {
    public double[] analyzeDiscreteSignal(int n) {
        double[] DiscreteSignal = new double[16];
        for (int i = 0; i < 16; i++) {
            DiscreteSignal[i] = (i >= 0 && i <= 15) ? (1 - i / 15.0) : 0;
        }
        return DiscreteSignal;
    }

    public void printDiscreteSignal(double[] signal) {
        for (int i = 0; i < signal.length; i++) {
            System.out.println("x(" + i + ") = " + signal[i]);
        }
    }
}
    
    
