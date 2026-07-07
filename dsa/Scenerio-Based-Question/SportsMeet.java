import java.util.Arrays;

public class SportsMeet {

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int swaps = 0;
        boolean alreadySorted = true;

        System.out.println("===== Bubble Sort =====");

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                    alreadySorted = false;
                }
            }

            System.out.println("Pass " + (i + 1) + " : " + Arrays.toString(arr));

            if (!swapped)
                break;
        }

        System.out.println("Final Sorted Array : " + Arrays.toString(arr));
        System.out.println("Total Swaps : " + swaps);

        if (alreadySorted)
            System.out.println("Array was already sorted.");
        else
            System.out.println("Array was NOT already sorted.");
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {

        System.out.println("\n===== Insertion Sort =====");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + " : " + Arrays.toString(arr));
        }

        System.out.println("Final Sorted Array : " + Arrays.toString(arr));
    }

    // Top 3 Medalists
    static void top3(int[] arr) {

        Arrays.sort(arr);

        System.out.println("\n===== Top 3 Medalists =====");
        System.out.println("Gold   : " + arr[arr.length - 1]);
        System.out.println("Silver : " + arr[arr.length - 2]);
        System.out.println("Bronze : " + arr[arr.length - 3]);
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        // Separate copies because sorting changes the array
        int[] bubbleArray = scores.clone();
        int[] insertionArray = scores.clone();
        int[] medalArray = scores.clone();

        bubbleSort(bubbleArray);

        insertionSort(insertionArray);

        top3(medalArray);
    }
}
