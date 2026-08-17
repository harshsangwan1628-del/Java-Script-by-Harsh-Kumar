// Q1: Encapsulation - private fields of a battery management system, accessed only via validated getters/setters
public class Q01_Encapsulation {
    public static void main(String[] args) {
        BatteryManagementSystem bms = new BatteryManagementSystem(48.0, 100.0);
        System.out.println("Initial voltage: " + bms.getVoltage() + "V");

        bms.setStateOfCharge(120); // invalid input, gets clamped internally
        System.out.println("State of charge after invalid update: " + bms.getStateOfCharge() + "%");

        bms.charge(15.5);
        System.out.println("State of charge after charging: " + bms.getStateOfCharge() + "%");

        bms.discharge(250.0); // exceeds available charge
        System.out.println("State of charge after over-discharge attempt: " + bms.getStateOfCharge() + "%");
    }
}

class BatteryManagementSystem {
    private double voltage;
    private double stateOfCharge; // percentage, 0-100, never exposed directly

    public BatteryManagementSystem(double voltage, double initialSoc) {
        this.voltage = voltage;
        setStateOfCharge(initialSoc);
    }

    public double getVoltage() {
        return voltage;
    }

    public double getStateOfCharge() {
        return stateOfCharge;
    }

    public void setStateOfCharge(double soc) {
        if (soc < 0) {
            stateOfCharge = 0;
        } else if (soc > 100) {
            stateOfCharge = 100;
        } else {
            stateOfCharge = soc;
        }
    }

    public void charge(double amountPercent) {
        setStateOfCharge(stateOfCharge + amountPercent);
    }

    public void discharge(double amountPercent) {
        setStateOfCharge(stateOfCharge - amountPercent);
    }
}
