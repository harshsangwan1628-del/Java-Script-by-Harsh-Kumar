// Q13: All primitive data types and their default values, shown via uninitialized fields of a sensor register bank
public class Q13_PrimitiveDefaults {
    public static void main(String[] args) {
        SensorRegisterBank bank = new SensorRegisterBank();
        bank.printDefaults();
    }
}

class SensorRegisterBank {
    byte errorCode;
    short packetCount;
    int sampleId;
    long timestampNanos;
    float calibrationOffset;
    double pressureReading;
    char statusFlag;
    boolean alarmTriggered;

    void printDefaults() {
        System.out.println("byte errorCode        = " + errorCode);
        System.out.println("short packetCount     = " + packetCount);
        System.out.println("int sampleId          = " + sampleId);
        System.out.println("long timestampNanos   = " + timestampNanos);
        System.out.println("float calibrationOffset = " + calibrationOffset);
        System.out.println("double pressureReading  = " + pressureReading);
        System.out.println("char statusFlag       = [" + statusFlag + "] (int value " + (int) statusFlag + ")");
        System.out.println("boolean alarmTriggered  = " + alarmTriggered);
    }
}
