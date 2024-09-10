class Radar {
    public double[] analyzeDiscreteSignal(int n) {
        double[] discreteSignal = new double[16];
        for (int i = 0; i < 16; i++) {
            discreteSignal[i] = (i >= 0 && i <= 15) ? (1 - i / 15.0) : 0;
        }
        return discreteSignal;
    }

    public void printDiscreteSignal(double[] signal) {
        for (int i = 0; i < signal.length; i++) {
            System.out.println("x(" + i + ") = " + signal[i]);
        }
    }
}
    
    
