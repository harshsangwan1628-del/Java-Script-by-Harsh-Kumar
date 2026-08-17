// Q25: Sum of all elements in an array - total energy consumption from a set of smart meter readings
public class Q25_ArraySum {
    public static void main(String[] args) {
        double[] meterReadingsKWh = {12.4, 9.8, 15.2, 7.6, 11.1};

        double total = 0;
        for (double reading : meterReadingsKWh) {
            total += reading;
        }

        System.out.println("Smart meter readings: " + java.util.Arrays.toString(meterReadingsKWh));
        System.out.println("Total energy consumed: " + total + " kWh");
    }
}
