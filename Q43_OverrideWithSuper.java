// Q43: Method overriding using super to call the parent's implementation - jet engine afterburner boost
public class Q43_OverrideWithSuper {
    public static void main(String[] args) {
        AircraftEngine generic = new AircraftEngine();
        TurbojetEngine turbojet = new TurbojetEngine();

        System.out.println("Generic engine at 80%: " + generic.baseThrustKn(80) + " kN");
        System.out.println("Turbojet at 80%: " + turbojet.baseThrustKn(80) + " kN");
        System.out.println("Turbojet at 95% (afterburner): " + turbojet.baseThrustKn(95) + " kN");
    }
}

class AircraftEngine {
    double baseThrustKn(double throttlePercent) {
        return 50 * (throttlePercent / 100.0);
    }
}

class TurbojetEngine extends AircraftEngine {
    @Override
    double baseThrustKn(double throttlePercent) {
        double base = super.baseThrustKn(throttlePercent); // reuse the parent's base calculation
        boolean afterburnerEngaged = throttlePercent > 90;
        return afterburnerEngaged ? base * 1.6 : base;
    }
}
