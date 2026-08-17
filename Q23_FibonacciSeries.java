// Q23: First n Fibonacci terms - staggered support-post spacing along a pipeline for vibration damping
public class Q23_FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        long[] supportSpacingMeters = new long[n];
        supportSpacingMeters[0] = 0;
        if (n > 1) {
            supportSpacingMeters[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            supportSpacingMeters[i] = supportSpacingMeters[i - 1] + supportSpacingMeters[i - 2];
        }
        System.out.println("Fibonacci-staggered pipeline support positions (m): " + java.util.Arrays.toString(supportSpacingMeters));
    }
}
