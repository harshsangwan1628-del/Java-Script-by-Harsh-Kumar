// Q38: Copy constructor - duplicating a drone configuration as an independent backup profile
public class Q38_CopyConstructor {
    public static void main(String[] args) {
        DroneConfiguration original = new DroneConfiguration("Surveyor-1", 4, 5200);
        DroneConfiguration clone = new DroneConfiguration(original); // copy constructor
        clone.rename("Surveyor-1-Backup");

        original.printConfig();
        clone.printConfig();
    }
}

class DroneConfiguration {
    private String callSign;
    private int rotorCount;
    private int batteryMah;

    DroneConfiguration(String callSign, int rotorCount, int batteryMah) {
        this.callSign = callSign;
        this.rotorCount = rotorCount;
        this.batteryMah = batteryMah;
    }

    DroneConfiguration(DroneConfiguration source) { // copy constructor
        this.callSign = source.callSign;
        this.rotorCount = source.rotorCount;
        this.batteryMah = source.batteryMah;
    }

    void rename(String newCallSign) {
        this.callSign = newCallSign;
    }

    void printConfig() {
        System.out.println(callSign + ": " + rotorCount + " rotors, " + batteryMah + " mAh battery");
    }
}
