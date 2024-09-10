// 1. Tạo giao diện tín hiệu Signal
interface Signal {
    double getAmplitude();  // Biên độ (A)
    double getFrequency();  // Tần số (f)
    double getPeriod();     // Chu kỳ (T)
    double getWavelength(); // Bước sóng (λ)
}

// 2. Tạo lớp tín hiệu rời rạc kế thừa Signal
class DiscreteSignal implements Signal {
    private final double amplitude;
    private final double frequency;
    private final double period;
    private final double wavelength;

    // Constructor
    public DiscreteSignal(double amplitude, double frequency, double period, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
    }

    // Implement các phương thức từ interface Signal
    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }
}

// 3. Tạo lớp tín hiệu liên tục kế thừa Signal
class ContinuousSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;
    private double wavelength;

    // Constructor
    public ContinuousSignal(double amplitude, double frequency, double period, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
    }

    // Implement các phương thức từ interface Signal
    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }
}
