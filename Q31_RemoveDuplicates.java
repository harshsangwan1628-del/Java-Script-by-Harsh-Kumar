// Q31: Remove duplicate elements from an array - deduping node IDs found while scanning a mesh network
public class Q31_RemoveDuplicates {
    public static void main(String[] args) {
        int[] meshNodeIds = {201, 305, 201, 412, 305, 118, 412, 501};
        System.out.println("Raw mesh network scan: " + java.util.Arrays.toString(meshNodeIds));

        int[] unique = new int[meshNodeIds.length];
        int count = 0;
        for (int id : meshNodeIds) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (unique[i] == id) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count++] = id;
            }
        }

        int[] result = java.util.Arrays.copyOf(unique, count);
        System.out.println("Unique node IDs discovered: " + java.util.Arrays.toString(result));
    }
}
