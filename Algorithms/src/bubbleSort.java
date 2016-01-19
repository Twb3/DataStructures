import java.util.Arrays;

/**
 * Created by Travis Ball on 1/10/2016.
 *
 * Bubble sort algorithm.    
 *
 * Worst case: O(n^2)
 *
 */
public class bubbleSort {

    public static void main(String[] args) {
        int[] array = {8, 3, 9, 12, 1};

        bubSort(array);
    }

    public static void bubSort(int[] array){
        boolean check = true;
        int i;
        int temp;
        int j = 0;

        while(check) {
            check = false;
            j++;
            for (i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    check = true;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
