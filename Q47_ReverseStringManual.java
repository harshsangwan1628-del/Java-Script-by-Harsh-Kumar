// Q47: Reverse a string without built-in reverse methods - flipping a barcode string manually
public class Q47_ReverseStringManual {
    public static void main(String[] args) {
        String barcode = "SN-88213-REV-C";
        char[] chars = barcode.toCharArray();

        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(chars);
        System.out.println("Original barcode: " + barcode);
        System.out.println("Reversed (checking scan direction): " + reversed);
    }
}
