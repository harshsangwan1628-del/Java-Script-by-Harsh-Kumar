// Q42: Multilevel inheritance - Vehicle -> ElectricVehicle -> AutonomousElectricVehicle
public class Q42_MultilevelInheritance {
    public static void main(String[] args) {
        AutonomousElectricVehicle car = new AutonomousElectricVehicle("RoboCab-9", 82.0, 4);
        car.describe();
    }
}

class Vehicle {
    protected String name;

    Vehicle(String name) {
        this.name = name;
    }

    void describe() {
        System.out.println(name + " is a vehicle");
    }
}

class ElectricVehicle extends Vehicle {
    protected double batteryKwh;

    ElectricVehicle(String name, double batteryKwh) {
        super(name);
        this.batteryKwh = batteryKwh;
    }

    void describe() {
        super.describe();
        System.out.println("  Runs on a " + batteryKwh + " kWh battery");
    }
}

class AutonomousElectricVehicle extends ElectricVehicle {
    private int sensorSuiteLevel;

    AutonomousElectricVehicle(String name, double batteryKwh, int sensorSuiteLevel) {
        super(name, batteryKwh);
        this.sensorSuiteLevel = sensorSuiteLevel;
    }

    void describe() {
        super.describe();
        System.out.println("  Level " + sensorSuiteLevel + " autonomous driving suite");
    }
}
