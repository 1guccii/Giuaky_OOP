public interface Signal {
    double getBiendo();
    double gettanso();
    double getchuky();
    double getbuocsong();
}
class DiscreteSignal implements Signal {
    private double Biendo;
    private double tanso;
    private double chuky;
    private double buocsong;
    public DiscreteSignal(double Biendo, double tanso, double chuky, double buocsong) {
        this.Biendo = Biendo;
        this.tanso = tanso;
        this.chuky = chuky;
        this.buocsong = buocsong;
    }
    public double getBiendo() {
        return Biendo;
    }
    public double gettanso() {
        return tanso;
    }
    public double getchuky() {
        return chuky;
    }
    public double getbuocsong() {
        return buocsong;
    }
}
class ContinuousSignal implements Signal {
    private double Biendo;
    private double tanso;
    private double chuky;
    private double buocsong;
    public ContinuousSignal(double Biendo, double tanso, double chuky, double buocsong) {
        this.Biendo = Biendo;
        this.chuky = chuky;
        this.tanso = tanso;
        this.buocsong = buocsong;
    }
    public double getBiendo() {
        return Biendo;
    }
    public double gettanso() {
        return tanso;
    }
    public double getchuky() {
        return chuky;
    }
    public double getbuocsong() {
        return buocsong;
    }
}
