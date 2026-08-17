// Q40: Static vs non-static methods - a thermostat class with a shared unit-conversion utility and per-unit readings
public class Q40_StaticVsNonStatic {
    public static void main(String[] args) {
        System.out.println("25C in Fahrenheit: " + Thermostat.celsiusToFahrenheit(25));

        Thermostat livingRoom = new Thermostat(22.5);
        livingRoom.report();

        Thermostat kitchen = new Thermostat(19.0);
        kitchen.report();

        System.out.println("Total thermostats created: " + Thermostat.getInstanceCount());
    }
}

class Thermostat {
    private static int instanceCount = 0; // shared across every instance
    private double currentTempC;          // unique per instance

    Thermostat(double currentTempC) {
        this.currentTempC = currentTempC;
        instanceCount++;
    }

    static double celsiusToFahrenheit(double celsius) { // static: doesn't need any instance state
        return celsius * 9.0 / 5.0 + 32;
    }

    static int getInstanceCount() {
        return instanceCount;
    }

    void report() { // non-static: depends on this particular thermostat's reading
        System.out.printf("Reading: %.1fC (%.1fF)%n", currentTempC, celsiusToFahrenheit(currentTempC));
    }
}
