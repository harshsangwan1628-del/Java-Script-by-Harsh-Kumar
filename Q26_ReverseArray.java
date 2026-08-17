// Q26: Reverse the elements of an array - replaying a flight recorder log from most recent event first
public class Q26_ReverseArray {
    public static void main(String[] args) {
        String[] flightRecorderLog = {"TAKEOFF", "CLIMB", "CRUISE", "DESCENT", "LANDING"};
        System.out.println("Original log order: " + java.util.Arrays.toString(flightRecorderLog));

        int left = 0, right = flightRecorderLog.length - 1;
        while (left < right) {
            String temp = flightRecorderLog[left];
            flightRecorderLog[left] = flightRecorderLog[right];
            flightRecorderLog[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed (most recent first): " + java.util.Arrays.toString(flightRecorderLog));
    }
}
