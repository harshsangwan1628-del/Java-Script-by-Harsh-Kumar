// Q24: Prime number check - selecting radio channel frequencies with lower harmonic interference risk
public class Q24_PrimeCheckChannels {
    public static void main(String[] args) {
        int[] candidateFrequenciesMHz = {97, 100, 101, 144, 149};
        for (int freq : candidateFrequenciesMHz) {
            System.out.println(freq + " MHz -> " + (isPrime(freq) ? "prime channel (low interference risk)" : "composite channel"));
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
