import java.util.Scanner;

/**
 * Created by Travis Ball on 1/29/2016.
 */
public class Letters {
    public int countLetters(String str) {
        int count = 0;
        char letter;

        str = str.toUpperCase();

        for (letter = 'A'; letter <= 'Z'; letter++) {
            for (int i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)) {
                    System.out.println(letter);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
