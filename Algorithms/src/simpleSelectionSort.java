import java.util.Arrays;

/**
 * Created by Travis Ball on 1/13/2016.
 *
 * Simple selection sort.
 *
 * Worst case: O(n^2)
 *
 */
public class simpleSelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 12, 1, 3, 14, 5};

        sortMe(array);
    }

    public static void sortMe(int[] array) {
        int i;
        int j;
        int temp;
        int n = array.length;

        for(i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (array[i] > array [j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } System.out.println(Arrays.toString(array));
            }
        }
    }
}
