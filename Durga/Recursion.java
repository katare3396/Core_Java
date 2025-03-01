import java.util.*;

public class Recursion {

    public static void main(String[] args) {

        // System.out.println("Sum n natural number " +
        // recursion_Sum_natural_Number(5));

        // System.out.println(" a power & b " + Power(9, 3));

        // System.out.println( factorial(5));

        // System.out.println("Mutiple Two number " + mutiple_Integer(4, 3));

        // System.out.println("Prime Number " + prime_Number(1009, 500));

        // System.out.println( "Sum Of All Digital " + sum_Digital_Number(123456));

        // System.out.println("Reverse of number" + reverseOfNumber(123, 3));

        // System.out.println("Count of number " + count_Number(12345));

        // System.out.println("decimal_Convert_Binary " + decimal_Convert_Binary(19));

        // for(int i = 0 ; i < 8;i++){
        // System.out.println( "Fibnonaci number " + i + ":---> "+ fib(i) );
        // }

        // System.out.println("LCM number " + lcm_Number(24, 57));

        System.out.println("Hcf :--> "+hcf(24, 59));

        // System.out.println(new Recursion().reverseAlphabnetletter("amol"));
        // System.out.println(new Recursion().removeCharcter_Alphabet("axmxoxl", 6));

    }

    // 1) Implement a program to calculate sum of 'n' natural numbers
    public static int recursion_Sum_natural_Number(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + recursion_Sum_natural_Number(n - 1);

        }
    }

    // 2) Implement a program to calculate a^b (a to the power b)
    public static int Power(int constantNumber, int power) {

        if (power <= 0) {
            return 1;
        } else {
            return constantNumber * Power(constantNumber, power - 1);
        }

    }

    // 3) Implement a program to find factorial of the given number?
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 4) Implement a program to calculate product of two integer values (a*b)
    public static int mutiple_Integer(int a, int b) {

        if (b >= 1) {
            return a + mutiple_Integer(a, b - 1);
        } else {
            return 0;
        }
    }

    // 5) Implement a program to check whether the given number is prime number or
    // not
    // ?
    public static boolean prime_Number(int number, int helpernumber) {

        if (helpernumber == 1) {
            return true;
        }

        if (number % helpernumber == 0) {
            return false;
        } else {
            return prime_Number(number, helpernumber - 1);
        }

    }

    // 6) Implement a program to find sum of digits present in the given number?
    public static int sum_Digital_Number(int a) {
        if (a <= 0) {
            return 0;
        } else {
            return (a % 10) + sum_Digital_Number(a / 10);
        }
    }

    // 7) Implement a program to calcualte reverse of the given number?
    public static int reverseOfNumber(int Number, int count_Number) {

        if (count_Number == 0) {
            return 0;
        } else {
            return ((Number % 10) * (int) Math.pow(10, count_Number - 1))
                    + reverseOfNumber(Number / 10, --count_Number);
        }
    }

    // 8) Implement a program to count number of digits present in the given number
    static int count = 0;

    public static int count_Number(int number) {

        if (number == 0) {
            return 0;
        } else {
            count++;
            count_Number(number / 10);
        }
        return count;
    }

    // 9) Implement a program to convert decimal number into binary?
    public static int decimal_Convert_Binary(int constant) {

        if (constant == 0) {
            return 0;
        } else {
            return (constant % 2) + 10 * decimal_Convert_Binary(constant / 2);
        }
    }

    // 10) Implement a program to find nth fib number
    public static int fib(int number) {

        if (number == 1 || number == 0) {
            return number;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }

    // 11) Implement a program to find LCM of two numbers
    static int lowestComFactor = 1;
    public static int lcm_Number(int a, int b) {

        if (lowestComFactor % a == 0 && lowestComFactor % b == 0) {
            return lowestComFactor;
        }
        lowestComFactor++;
        lcm_Number(a, b);
        return lowestComFactor;

    }

    // 12)  Implement a program to find HCF/GCD of the given two numbers
    public static int hcf(int a, int b) {

        while (a != b) {

            if (a > b) {
                return hcf(a - b, b);
            } else {
                return hcf(a, b - a);
            }
        }
        return a;
    }

    // 13)  Implement a program to find reverse of the given string using recursion?
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