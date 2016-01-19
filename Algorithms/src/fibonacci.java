import java.util.Arrays;

/**
 * Created by Travis Ball on 1/14/2016.
 *
 * Simple recursive example.
 * Stores the fibonacci sequence as an array.
 *
 */
public class fibonacci {

    public static void main(String[] args) {
        int[] array;
        array = new int[10];

        int n = 10;
        for (int i = 0; i < n; i++) {
            array[i] = fib(i);
        }
        System.out.println(Arrays.toString(array));
    }

    public static int fib(int n) {

        if (n <= 1){
            return n;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }
}
