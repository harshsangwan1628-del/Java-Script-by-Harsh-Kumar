// Q2: Inheritance and polymorphism - a power grid mix of generation sources dispatched through a common base type
public class Q02_InheritancePolymorphism {
    public static void main(String[] args) {
        PowerSource[] grid = {
            new SolarPanel(25),
            new WindTurbine(15),
            new DieselGenerator(40)
        };
        double[] conditions = {0.8, 12.0, 0.9}; // sunlight factor, wind m/s, load factor

        for (int i = 0; i < grid.length; i++) {
            grid[i].report(conditions[i]); // same call, different runtime behavior per subclass
        }
    }
}

abstract class PowerSource {
    protected String name;

    PowerSource(String name) {
        this.name = name;
    }

    abstract double generatePowerKW(double conditionFactor);

    void report(double conditionFactor) {
        System.out.printf("%s generates %.2f kW%n", name, generatePowerKW(conditionFactor));
    }
}

class SolarPanel extends PowerSource {
    private double areaSqMeters;

    SolarPanel(double areaSqMeters) {
        super("Solar Panel");
        this.areaSqMeters = areaSqMeters;
    }

    double generatePowerKW(double sunlightIntensity) {
        return areaSqMeters * sunlightIntensity * 0.2; // 20% panel efficiency
    }
}

class WindTurbine extends PowerSource {
    private double bladeRadiusMeters;

    WindTurbine(double bladeRadiusMeters) {
        super("Wind Turbine");
        this.bladeRadiusMeters = bladeRadiusMeters;
    }

    double generatePowerKW(double windSpeedMps) {
        double sweptArea = Math.PI * bladeRadiusMeters * bladeRadiusMeters;
        return 0.5 * 1.225 * sweptArea * Math.pow(windSpeedMps, 3) * 0.35 / 1000.0;
    }
}

class DieselGenerator extends PowerSource {
    private double fuelFlowRateLph;

    DieselGenerator(double fuelFlowRateLph) {
        super("Diesel Generator");
        this.fuelFlowRateLph = fuelFlowRateLph;
    }

    double generatePowerKW(double loadFactor) {
        return fuelFlowRateLph * 3.5 * loadFactor; // approx kWh generated per liter burned
    }
}
