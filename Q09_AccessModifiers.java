// Q9: Access modifiers - a nuclear reactor control class showing public/protected/default/private visibility
public class Q09_AccessModifiers {
    public static void main(String[] args) {
        ReactorMonitoringSubsystem sub = new ReactorMonitoringSubsystem("RX-1");
        sub.report();
        sub.scram();
        sub.report();
    }
}

class NuclearReactorControl {
    public String reactorId;          // accessible from anywhere
    protected double coreTemperature; // accessible to subclasses and same package
    double coolantFlowRate;           // default: package-private
    private double controlRodPosition; // accessible only within this class

    NuclearReactorControl(String reactorId) {
        this.reactorId = reactorId;
        this.coreTemperature = 300.0;
        this.coolantFlowRate = 500.0;
        this.controlRodPosition = 50.0;
    }

    private void adjustControlRod(double delta) {
        controlRodPosition += delta;
    }

    public void scram() {
        adjustControlRod(-controlRodPosition); // private method usable only internally
        coreTemperature = 25.0;
        System.out.println(reactorId + " SCRAM executed. Rods fully inserted.");
    }
}

class ReactorMonitoringSubsystem extends NuclearReactorControl {
    ReactorMonitoringSubsystem(String reactorId) {
        super(reactorId);
    }

    void report() {
        // coreTemperature (protected) and coolantFlowRate (default) are reachable here,
        // but controlRodPosition (private in the parent) is not.
        System.out.println(reactorId + " core temp: " + coreTemperature + ", flow: " + coolantFlowRate);
    }
}
