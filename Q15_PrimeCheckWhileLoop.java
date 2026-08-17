// Q15: Prime check using a while loop - picking gear tooth counts that avoid repeating wear patterns
public class Q15_PrimeCheckWhileLoop {
    public static void main(String[] args) {
        int[] candidateGearTeeth = {17, 20, 23, 44, 97};
        for (int teeth : candidateGearTeeth) {
            System.out.println(teeth + " teeth -> " + (isPrime(teeth) ? "prime (good anti-wear pairing)" : "not prime"));
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int divisor = 2;
        boolean prime = true;
        while (divisor * divisor <= n) {
            if (n % divisor == 0) {
                prime = false;
                break;
            }
            divisor++;
        }
        return prime;
    }
}
