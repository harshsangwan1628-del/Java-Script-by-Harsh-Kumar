// Q37: Constructor overloading - a resistor class with default, single-arg, and full-spec constructors
public class Q37_ConstructorOverloading {
    public static void main(String[] args) {
        Resistor r1 = new Resistor();
        Resistor r2 = new Resistor(220);
        Resistor r3 = new Resistor(4700, 5);

        r1.printSpec();
        r2.printSpec();
        r3.printSpec();
    }
}

class Resistor {
    private double ohms;
    private double tolerancePercent;

    Resistor() {
        this(1000, 10);
    }

    Resistor(double ohms) {
        this(ohms, 10);
    }

    Resistor(double ohms, double tolerancePercent) {
        this.ohms = ohms;
        this.tolerancePercent = tolerancePercent;
    }

    void printSpec() {
        System.out.printf("%.0f ohm resistor, +/-%.0f%% tolerance%n", ohms, tolerancePercent);
    }
}
