// Q7: this and super keywords - transformer constructors chain with this(), subclass reaches base logic with super
public class Q07_ThisSuperKeywords {
    public static void main(String[] args) {
        Transformer t = new Transformer(230);
        System.out.println("Ideal secondary voltage: " + t.secondaryVoltage());

        StepUpTransformer st = new StepUpTransformer(230, 4, 0.03);
        System.out.println("Step-up secondary voltage (with core loss): " + st.secondaryVoltage());
    }
}

class Transformer {
    protected double primaryVoltage;
    protected double turnsRatio;

    Transformer(double primaryVoltage) {
        this(primaryVoltage, 1.0); // this() delegates to the two-arg constructor
        System.out.println("Single-arg constructor delegated via this()");
    }

    Transformer(double primaryVoltage, double turnsRatio) {
        this.primaryVoltage = primaryVoltage;
        this.turnsRatio = turnsRatio;
    }

    double secondaryVoltage() {
        return primaryVoltage * turnsRatio;
    }
}

class StepUpTransformer extends Transformer {
    private double coreLossFactor;

    StepUpTransformer(double primaryVoltage, double turnsRatio, double coreLossFactor) {
        super(primaryVoltage, turnsRatio); // super() invokes the parent constructor
        this.coreLossFactor = coreLossFactor;
    }

    @Override
    double secondaryVoltage() {
        double idealVoltage = super.secondaryVoltage(); // super. reaches the parent's calculation
        return idealVoltage * (1 - coreLossFactor);
    }
}
