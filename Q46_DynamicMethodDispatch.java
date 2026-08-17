// Q46: Runtime polymorphism via dynamic method dispatch - a common Actuator reference resolving to each real type
public class Q46_DynamicMethodDispatch {
    public static void main(String[] args) {
        Actuator[] actuators = { new ServoActuator(), new HydraulicActuator(), new PneumaticActuator() };
        for (Actuator a : actuators) {
            a.actuate(75); // base-type reference, resolved to the correct override at runtime
        }
    }
}

abstract class Actuator {
    abstract void actuate(double signalPercent);
}

class ServoActuator extends Actuator {
    void actuate(double signalPercent) {
        System.out.println("Servo rotates to " + (signalPercent * 1.8) + " degrees");
    }
}

class HydraulicActuator extends Actuator {
    void actuate(double signalPercent) {
        System.out.println("Hydraulic ram extends " + (signalPercent * 0.5) + " cm under " + (signalPercent * 30) + " bar");
    }
}

class PneumaticActuator extends Actuator {
    void actuate(double signalPercent) {
        System.out.println("Pneumatic piston fires with " + (signalPercent * 2.2) + " N force");
    }
}
