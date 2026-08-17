// Q22: Palindrome check for a string and a number - QA rule validating a valve tag and a sensor ID
public class Q22_PalindromeCheck {
    public static void main(String[] args) {
        String valveTag = "V1-EE-1V";
        int sensorId = 40304;

        System.out.println(valveTag + " is palindrome? " + isPalindromeString(valveTag));
        System.out.println(sensorId + " is palindrome? " + isPalindromeNumber(sensorId));
    }

    static boolean isPalindromeString(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindromeNumber(int number) {
        int original = number, reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }
}
