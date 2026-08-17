// Q3: Abstraction via interfaces - industrial sensors expose a common contract while hiding calibration internals
public class Q03_AbstractionInterface {
    public static void main(String[] args) {
        Sensor[] sensors = { new TemperatureSensor(), new PressureSensor() };
        for (Sensor s : sensors) {
            s.calibrate();
            System.out.printf("Reading: %.2f %s%n", s.readValue(), s.unit());
        }
    }
}

interface Sensor {
    void calibrate();
    double readValue();

    default String unit() {
        return "unit";
    }
}

class TemperatureSensor implements Sensor {
    private double offset;

    public void calibrate() {
        offset = 0.5;
        System.out.println("TemperatureSensor calibrated with offset " + offset);
    }

    public double readValue() {
        return 23.4 + offset;
    }

    public String unit() {
        return "C";
    }
}

class PressureSensor implements Sensor {
    private double zeroDrift;

    public void calibrate() {
        zeroDrift = 0.02;
        System.out.println("PressureSensor calibrated, zero drift corrected by " + zeroDrift);
    }

    public double readValue() {
        return 101.3 - zeroDrift;
    }

    public String unit() {
        return "kPa";
    }
}
