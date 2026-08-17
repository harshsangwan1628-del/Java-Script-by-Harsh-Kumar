// Q8: Constructors in OOP - a capacitor part class with default, single-arg, and fully parameterized constructors
public class Q08_Constructors {
    public static void main(String[] args) {
        new Capacitor().printSpec();
        new Capacitor(4.7).printSpec();
        new Capacitor(100, 25, "Electrolytic").printSpec();
    }
}

class Capacitor {
    private double capacitanceMicroFarad;
    private double voltageRating;
    private String dielectricType;

    Capacitor() {
        this(1.0, 16.0, "Ceramic");
    }

    Capacitor(double capacitanceMicroFarad) {
        this(capacitanceMicroFarad, 16.0, "Ceramic");
    }

    Capacitor(double capacitanceMicroFarad, double voltageRating, String dielectricType) {
        this.capacitanceMicroFarad = capacitanceMicroFarad;
        this.voltageRating = voltageRating;
        this.dielectricType = dielectricType;
    }

    void printSpec() {
        System.out.printf("%.1fuF %s capacitor rated at %.1fV%n", capacitanceMicroFarad, dielectricType, voltageRating);
    }
}
