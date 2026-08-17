// Q20: Largest of three numbers - selecting the reading to trust among triple-redundant voltage sensors
public class Q20_LargestOfThree {
    public static void main(String[] args) {
        double sensorA = 220.4, sensorB = 221.9, sensorC = 219.7;

        double largest = sensorA;
        if (sensorB > largest) largest = sensorB;
        if (sensorC > largest) largest = sensorC;

        System.out.println("Redundant voltage readings: " + sensorA + ", " + sensorB + ", " + sensorC);
        System.out.println("Selected (largest) reading for logging: " + largest);
    }
}
