// Q44: Abstract class overridden by subclasses - shared factory robotic arm stations with different jobs
public class Q44_AbstractClass {
    public static void main(String[] args) {
        RoboticArm[] stations = { new WeldingArm("ARM-01"), new PaintingArm("ARM-02") };
        for (RoboticArm arm : stations) {
            arm.powerOn();
            arm.performTask();
        }
    }
}

abstract class RoboticArm {
    protected String stationId;

    RoboticArm(String stationId) {
        this.stationId = stationId;
    }

    abstract void performTask();

    void powerOn() {
        System.out.println(stationId + " powering on...");
    }
}

class WeldingArm extends RoboticArm {
    WeldingArm(String stationId) {
        super(stationId);
    }

    void performTask() {
        System.out.println(stationId + " welding seam at 1800C torch temperature");
    }
}

class PaintingArm extends RoboticArm {
    PaintingArm(String stationId) {
        super(stationId);
    }

    void performTask() {
        System.out.println(stationId + " spraying base coat at 2.5 bar pressure");
    }
}
