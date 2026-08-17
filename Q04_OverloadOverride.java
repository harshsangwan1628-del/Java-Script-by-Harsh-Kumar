// Q4: Method overloading (same class, different signatures) and overriding (subclass changes behavior)
public class Q04_OverloadOverride {
    public static void main(String[] args) {
        SignalProcessor base = new SignalProcessor();
        System.out.println("Base process(0.4): " + base.process(0.4));
        System.out.println("Base process(0.4, 6): " + base.process(0.4, 6));
        System.out.println("Base process(0.4, 6, true): " + base.process(0.4, 6, true));

        SignalProcessor gate = new NoiseGateProcessor(0.1);
        System.out.println("Gate process(0.05): " + gate.process(0.05));
        System.out.println("Gate process(0.4): " + gate.process(0.4));
    }
}

class SignalProcessor {
    double process(double signal) { // overload #1
        return signal;
    }

    double process(double signal, double gainDb) { // overload #2
        return signal * Math.pow(10, gainDb / 20.0);
    }

    double process(double signal, double gainDb, boolean invert) { // overload #3
        double result = process(signal, gainDb);
        return invert ? -result : result;
    }
}

class NoiseGateProcessor extends SignalProcessor {
    private double threshold;

    NoiseGateProcessor(double threshold) {
        this.threshold = threshold;
    }

    @Override
    double process(double signal) { // overriding: silence anything below the gate threshold
        return Math.abs(signal) < threshold ? 0.0 : signal;
    }
}
