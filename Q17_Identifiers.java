// Q17: Valid vs invalid Java identifiers, using engineering quantity names as examples
public class Q17_Identifiers {
    public static void main(String[] args) {
        // Valid identifiers
        int motorRpm2024 = 3600;
        double _voltageDrop = 0.35;
        float $costPerUnit = 12.5f;
        long satelliteId_7 = 1007L;

        System.out.println("Valid identifiers:");
        System.out.println("motorRpm2024 = " + motorRpm2024);
        System.out.println("_voltageDrop = " + _voltageDrop);
        System.out.println("$costPerUnit = " + $costPerUnit);
        System.out.println("satelliteId_7 = " + satelliteId_7);

        System.out.println("\nInvalid identifiers (would fail to compile if uncommented):");
        System.out.println("  int 2ndStageThrust;      // cannot start with a digit");
        System.out.println("  double fuel-flow-rate;   // hyphen is not allowed in identifiers");
        System.out.println("  float class;             // 'class' is a reserved keyword");
        System.out.println("  int engine flow;         // space is not allowed in identifiers");
    }
}
