import java.util.Arrays;
import java.util.Random;

public class LibrarySortingComparison {

    // ---------------- Merge Sort ----------------

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // ---------------- Quick Sort (Lomuto Partition) ----------------

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------------- Counting Sort ----------------

    static void countingSort(int[] arr) {

        int[] count = new int[21]; // Genre codes 1–20

        for (int num : arr)
            count[num]++;

        int index = 0;

        for (int i = 1; i <= 20; i++) {

            while (count[i] > 0) {

                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // ---------------- Runtime Comparison ----------------

    static void compareRuntime(int size) {

        Random random = new Random();

        int[] mergeArray = new int[size];
        int[] quickArray = new int[size];
        int[] countArray = new int[size];

        for (int i = 0; i < size; i++) {

            int value = random.nextInt(20) + 1;

            mergeArray[i] = value;
            quickArray[i] = value;
            countArray[i] = value;
        }

        long start = System.nanoTime();
        mergeSort(mergeArray, 0, size - 1);
        long mergeTime = System.nanoTime() - start;

        start = System.nanoTime();
        quickSort(quickArray, 0, size - 1);
        long quickTime = System.nanoTime() - start;

        start = System.nanoTime();
        countingSort(countArray);
        long countTime = System.nanoTime() - start;

        System.out.println("\nArray Size : " + size);
        System.out.println("Merge Sort Time   : " + mergeTime + " ns");
        System.out.println("Quick Sort Time   : " + quickTime + " ns");
        System.out.println("Counting Sort Time: " + countTime + " ns");
    }

    // ---------------- Main ----------------

    public static void main(String[] args) {

        // Books by Year
        int[] books = {2015, 2002, 2018, 1998, 2020, 2010};

        System.out.println("Original Book Years:");
        System.out.println(Arrays.toString(books));

        mergeSort(books, 0, books.length - 1);

        System.out.println("\nAfter Merge Sort:");
        System.out.println(Arrays.toString(books));

        // Quick Sort Demo
        int[] prices = {45, 12, 78, 30, 55, 20};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\nQuick Sort Output:");
        System.out.println(Arrays.toString(prices));

        // Counting Sort Demo
        int[] genres = {5, 2, 1, 20, 10, 5, 7, 2, 18};

        countingSort(genres);

        System.out.println("\nCounting Sort Output:");
        System.out.println(Arrays.toString(genres));

        // Runtime Comparison
        compareRuntime(100);
        compareRuntime(1000);
        compareRuntime(10000);
    }
}
