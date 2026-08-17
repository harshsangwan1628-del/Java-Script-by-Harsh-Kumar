// Q16: Factorial via recursion - counting possible assembly sequences for a set of distinct components
public class Q16_FactorialRecursion {
    public static void main(String[] args) {
        int[] componentCounts = {0, 1, 5, 8};
        for (int n : componentCounts) {
            System.out.println(n + " distinct components -> " + factorial(n) + " possible assembly sequences");
        }
    }

    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
