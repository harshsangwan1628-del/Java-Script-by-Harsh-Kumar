// Q32: Arithmetic, relational, and logical operators - a drone flight controller safety check
public class Q32_OperatorsDemo {
    public static void main(String[] args) {
        double thrustN = 450.0;
        double weightN = 400.0;
        int altitudeM = 120;
        int maxAltitudeM = 150;
        boolean gpsLocked = true;

        // Arithmetic operators
        double netForce = thrustN - weightN;
        double accel = netForce / 25.0; // drone mass of 25 kg

        // Relational operators
        boolean withinAltitudeLimit = altitudeM < maxAltitudeM;
        boolean climbing = netForce > 0;

        // Logical operators
        boolean safeToClimb = climbing && withinAltitudeLimit && gpsLocked;
        boolean needsIntervention = !gpsLocked || !withinAltitudeLimit;

        System.out.println("Net force: " + netForce + " N, acceleration: " + accel + " m/s^2");
        System.out.println("Within altitude limit? " + withinAltitudeLimit);
        System.out.println("Safe to climb? " + safeToClimb);
        System.out.println("Needs manual intervention? " + needsIntervention);
    }
}
