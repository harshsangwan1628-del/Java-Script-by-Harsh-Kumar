// Q29: 2D array - a data center server rack temperature grid (rows = shelf, columns = slot)
public class Q29_2DArray {
    public static void main(String[] args) {
        double[][] serverRackTempC = {
            {28.5, 29.1, 30.2},
            {27.8, 31.4, 29.9},
            {26.9, 28.0, 27.3}
        };

        System.out.println("Server rack temperature grid (rows = shelf, cols = slot):");
        for (int shelf = 0; shelf < serverRackTempC.length; shelf++) {
            for (int slot = 0; slot < serverRackTempC[shelf].length; slot++) {
                System.out.printf("%6.1f", serverRackTempC[shelf][slot]);
            }
            System.out.println();
        }
    }
}
