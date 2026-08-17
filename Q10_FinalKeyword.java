// Q10: final keyword on a constant, an instance variable, a method, and a whole class
public class Q10_FinalKeyword {
    static final double SPEED_OF_LIGHT_KMPS = 299792.458; // final variable: a true constant

    public static void main(String[] args) {
        System.out.println("Speed of light: " + SPEED_OF_LIGHT_KMPS + " km/s");

        ImmutableCoordinate hq = new ImmutableCoordinate(37.4220, -122.0841);
        System.out.println("Coordinate: " + hq.latitude + ", " + hq.longitude);

        Engine engine = new Engine(7000);
        System.out.printf("Redline fraction at 5200 rpm: %.2f%n", engine.redlineFraction(5200));
    }
}

final class ImmutableCoordinate { // final class: cannot be subclassed
    final double latitude;
    final double longitude;

    ImmutableCoordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

class Engine {
    final int maxRpm; // final field: must be assigned exactly once

    Engine(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    final double redlineFraction(int currentRpm) { // final method: cannot be overridden by subclasses
        return (double) currentRpm / maxRpm;
    }
}
