// Q6: Multiple inheritance via interfaces - a flying car combines two independent behavior contracts
public class Q06_MultipleInheritanceInterfaces {
    public static void main(String[] args) {
        FlyingCar car = new FlyingCar("AeroMobil X2");
        car.fly();
        car.drive();
    }
}

interface Flyable {
    void fly();

    default int maxAltitudeFt() {
        return 1000;
    }
}

interface Drivable {
    void drive();

    default int topSpeedMph() {
        return 60;
    }
}

class FlyingCar implements Flyable, Drivable {
    private String model;

    FlyingCar(String model) {
        this.model = model;
    }

    public void fly() {
        System.out.println(model + " is flying up to " + maxAltitudeFt() + " ft");
    }

    public void drive() {
        System.out.println(model + " is driving at up to " + topSpeedMph() + " mph");
    }

    public int maxAltitudeFt() {
        return 15000; // overrides the default from Flyable
    }
}
