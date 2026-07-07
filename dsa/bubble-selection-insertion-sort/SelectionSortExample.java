import java.util.Arrays;

public class SelectionSortExample {

    public static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] scores = {88, 45, 70, 99, 61};

        selectionSort(scores);

        System.out.println(Arrays.toString(scores));
    }
}
