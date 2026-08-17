// Q39: Parameterized constructor - initializing an electric motor's nameplate specs at creation time
public class Q39_ParameterizedConstructor {
    public static void main(String[] args) {
        ElectricMotor motor = new ElectricMotor("BLDC-500", 48.0, 3200, 12.5);
        motor.printSpec();
    }
}

class ElectricMotor {
    private String modelName;
    private double ratedVoltage;
    private int noLoadRpm;
    private double stallTorqueNm;

    ElectricMotor(String modelName, double ratedVoltage, int noLoadRpm, double stallTorqueNm) {
        this.modelName = modelName;
        this.ratedVoltage = ratedVoltage;
        this.noLoadRpm = noLoadRpm;
        this.stallTorqueNm = stallTorqueNm;
    }

    void printSpec() {
        System.out.println(modelName + ": " + ratedVoltage + "V, " + noLoadRpm + " RPM no-load, " + stallTorqueNm + " Nm stall torque");
    }
}
