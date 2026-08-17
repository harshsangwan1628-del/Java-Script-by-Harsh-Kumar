// Q19: Odd or even check - routing production batch numbers to one of two assembly lines
public class Q19_OddEvenCheck {
    public static void main(String[] args) {
        int[] batchNumbers = {1042, 1057, 2200, 3391};
        for (int batch : batchNumbers) {
            String line = (batch % 2 == 0) ? "Assembly Line A (even batch)" : "Assembly Line B (odd batch)";
            System.out.println("Batch #" + batch + " -> " + line);
        }
    }
}
