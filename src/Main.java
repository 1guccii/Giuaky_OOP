public class Main {
    public static void main() {
        Radar radar = new Radar() ;
        double []  DiscreteSignal = radar.analyzDiscreteSignal(4);
        radar.printDiscreteSignal(DiscreteSignal);
    }
}
    
