// Q21: Factorial via recursion - number of possible test orderings for a set of calibration weights
public class Q21_FactorialRecursionCalibration {
    public static void main(String[] args) {
        int[] weightSetSizes = {3, 6, 10};
        for (int n : weightSetSizes) {
            System.out.println(n + " calibration weights -> " + factorial(n) + " possible test orderings");
        }
    }

    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
