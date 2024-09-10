// Lớp DiscreteSignal theo định nghĩa tín hiệu rời rạc
class DiscreteSignal1 {
    // Phương thức tính toán tín hiệu rời rạc x(n)
    public double calculateDiscreteSignal(int n, int[] unitImpulse, int[] inputSignal) {
        double result = 0.0;
        int length = Math.min(unitImpulse.length, inputSignal.length);

        for (int i = 0; i < length; i++) {
            if (n - i >= 0 && n - i < unitImpulse.length) {
                result += inputSignal[i] * unitImpulse[n - i];
            }
        }

        return result;
    }

    // Hàm d(x) là dãy xung đơn vị
    public int unitImpulse(int n) {
        return (n == 0) ? 1 : 0;
    }
}
