// Q18: Largest and smallest values in an array - turbine vibration sensor log
public class Q18_ArrayMinMax {
    public static void main(String[] args) {
        double[] vibrationReadingsMm = {0.12, 0.45, 0.08, 0.91, 0.33, 0.02, 0.77};

        double max = vibrationReadingsMm[0];
        double min = vibrationReadingsMm[0];
        for (double reading : vibrationReadingsMm) {
            if (reading > max) max = reading;
            if (reading < min) min = reading;
        }

        System.out.println("Turbine vibration readings (mm/s): " + java.util.Arrays.toString(vibrationReadingsMm));
        System.out.println("Highest vibration: " + max + " mm/s");
        System.out.println("Lowest vibration: " + min + " mm/s");
    }
}
