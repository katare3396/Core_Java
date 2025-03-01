import java.util.*;

public class Recursion {

    public static void main(String[] args) {

        // System.out.println(new Recursion().recursion_Sum_natural_Number(5));
        // System.out.println(new Recursion().factorial(5));
        // System.out.println(new Recursion().mutiple(4, 3));
        // System.out.println(new Recursion().sum_Digital_Number(2144));
        // System.out.println(new Recursion().reverseOfNumber(123, 2));

        // System.out.println(new Recursion().lcm_Number(4, 6));
        // System.out.println(new Recursion().hcf(4, 6));

        // System.out.println(new Recursion().reverseAlphabnetletter("amol"));
        System.out.println(new Recursion().removeCharcter_Alphabet("axmxoxl", 6 ));

    }

    public int recursion_Sum_natural_Number(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + recursion_Sum_natural_Number(n - 1);

        }
    }

    public int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int mutiple(int a, int b) {

        if (b >= 1) {
            return a + mutiple(a, b - 1);
        } else {
            return 0;
        }
    }

    public int sum_Digital_Number(int a) {

        if (a >= 1) {
            return (a % 10) + sum_Digital_Number((a / 10));
        } else {
            return 0;
        }
    }

    public int reverseOfNumber(int a, int b) {
        if (b >= 0) {
            return (a % 10) * (int) Math.pow(10, b) + reverseOfNumber(a / 10, b - 1);
        } else {
            return 0;
        }
    }

    int com = 1;

    public int lcm_Number(int a, int b) {

        if (com % a == 0 && com % b == 0) {
            return com;
        }
        com++;
        return com;

    }

    public int hcf(int a, int b) {

        while (a != b) {

            if (a > b) {
                return hcf(a - b, b);
            } else {
                return hcf(a, b - a);
            }
        }
        return a;
    }

    public String reverseAlphabnetletter(String s) {

        if (s == null || s.length() == 1) {
            return s;

        } else {
            return reverseAlphabnetletter(s.substring(1)) + s.charAt(0);
        }
    }

    public String removeCharcter_Alphabet(String s, int a) {

        if (a < 0) {
            return " ";
        }

        if (s == null || s.length() == 1) {
            return s;
        } else if (s.charAt(a) == 'x') {
            return removeCharcter_Alphabet(s, a - 1);
        } else {
            return removeCharcter_Alphabet(s, a - 1) + s.charAt(a);
        }
    }

}