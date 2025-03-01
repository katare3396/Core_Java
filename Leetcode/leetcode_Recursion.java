
import java.util.*;

public class leetcode_Recursion {

    public static void main(String[] args) {

        System.out.println(numberReverse(12345, 5));

        System.out.println(isPowerOfTwo(1));

    }

    public static int numberReverse(int head, int power) {

        if (head <= 0) {
            return 0;
        } else {
            return numberReverse(head / 10, --power) + (int) Math.pow(10, power) * (head % 10);
        }
    }

    public static boolean isPowerOfTwo(int n) {

        for (int i = 0; i <= n / 2; i++) {

            if ((int) Math.pow(2, i) == n) {
                return true;
            }
        }
        return false;
    }

}
