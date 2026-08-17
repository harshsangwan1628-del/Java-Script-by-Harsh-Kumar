// Q30: Binary search on a sorted array - locating a part ID in a sorted inventory catalog
public class Q30_BinarySearch {
    public static void main(String[] args) {
        int[] sortedPartIds = {1002, 1015, 1023, 1041, 1058, 1077, 1090};
        int target = 1058;

        int index = binarySearch(sortedPartIds, target);
        if (index >= 0) {
            System.out.println("Part ID " + target + " found in inventory at index " + index);
        } else {
            System.out.println("Part ID " + target + " not found in inventory");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
