import java.util.Arrays;

public class InsertionSortExample {

    public static void insertionSort(int[] ids) {

        int n = ids.length;

        for (int i = 1; i < n; i++) {

            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] ids = {104, 101, 105, 102, 103};

        insertionSort(ids);

        System.out.println(Arrays.toString(ids));
    }
}
