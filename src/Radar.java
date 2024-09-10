public class Radar {
        public double X(int n) {
            if (n >= 0 && n <= 15) {
                return 1-(double) n / 15;
            } else {
                return 0;
            }
        }
        public static void main(String[] args) {
            Radar radar = new Radar();
            for (int n = 0; n <= 20; n++) {
                System.out.println("X(" + n + ") = " + radar.X(n));
            }
        }
    }
    
