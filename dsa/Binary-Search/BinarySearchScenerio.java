public class BinarySearchScenario {

    // Normal Binary Search
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    // Search in Rotated Sorted Array
    static int searchRotated(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    // First Occurrence
    static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Last Occurrence
    static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Find Minimum in Rotated Sorted Array
    static int findMinimum(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        return arr[low];
    }

    public static void main(String[] args) {

        int[] sorted = {2, 4, 6, 8, 10, 12, 14, 16};
        int[] rotated = {8, 10, 12, 14, 2, 4, 6};
        int[] repeated = {2, 4, 4, 4, 6, 8, 8, 10};

        System.out.println("Binary Search: " +
                binarySearch(sorted, 10));

        System.out.println("Rotated Search: " +
                searchRotated(rotated, 4));

        System.out.println("First Occurrence: " +
                firstOccurrence(repeated, 4));

        System.out.println("Last Occurrence: " +
                lastOccurrence(repeated, 4));

        System.out.println("Minimum Element: " +
                findMinimum(rotated));
    }
}
