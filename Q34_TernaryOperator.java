// Q34: Ternary operator - pass/fail verdict for power supply output voltage against tolerance
public class Q34_TernaryOperator {
    public static void main(String[] args) {
        double[] outputVoltages = {4.98, 5.21, 4.75, 5.02};
        double nominal = 5.0, tolerance = 0.1;

        for (double v : outputVoltages) {
            String verdict = (Math.abs(v - nominal) <= tolerance) ? "PASS" : "FAIL";
            System.out.printf("Output %.2fV -> %s%n", v, verdict);
        }
    }
}
