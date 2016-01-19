import java.util.Arrays;

/**
 * Created by Travis Ball on 1/16/2016.
 *
 * A faster selection sort.  Minimum index value is updated to prevent unnecessary steps. 
 *
 */
public class fasterSelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 1, 12, 3};

        selSort(array);
    }

    public static void selSort(int[] array) {
        int i;
        int j;
        int minIndex;
        int temp;

        for (i = 0; i < array.length - 1; i++) {
            minIndex = i;

            for (j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

        } System.out.println(Arrays.toString(array));
    }
}
