import java.util.*;

public class Recursion {

    /*
     * Recursion is a process of calling a method/function by itself, in this
     * process the
     * method which is invoked is called as 'Recursive Method'.
     * this recursion is divided into two ways based on method calls...
     * 1) infinate recursion
     * 2) finate recursion
     * 
     * infinate recursion:
     * -------------------
     * the method which called by itself, infinate times. we will get Error message
     * 'Stack
     * Over Flow' error we will get.
     * 
     * finate recursion:-
     * ------------------
     * a method which is called by itself, and terminates at finate number of steps
     * is called
     * as finate recursion.
     * we can make this finate recursion based on 'BASE CONDITION'.
     * 
     * base condition:
     * ---------------
     * It is a special, we have to create inside recursive calls so that our
     * recursion should
     * terminate at a finate steps.
     * 
     * Properties of Recursion:
     * ~~~~~~~~~~~~~~~~~~~~~~~~
     * 1) same operations with multiple inputs.
     * 2) we will divide the entire problem into small problems.
     * 3) base condition is very very important in recursion, else it leads to
     * infinate exe.
     * 
     * advantages of recursion:
     * ~~~~~~~~~~~~~~~~~~~~~~~~
     * 1) recursive algorithms are easier to write.
     * 2) easy to solve natural big problems, Ex: Towers of Hanoi problem
     * 3) reduce unnecessary function calls.
     * 4) reduce length of the code.
     * 5) very useful while solving data structure related problems.
     * 6) we can evaulate some expressions, infix, prefix and postfix etc
     * 
     * disadvanatges of recursion:
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * 1) recursion uses extra stack space.
     * 2) redundent computations
     * 3) tracing will be difficult
     * 4) slower in execution
     * 5) runs out of memory (StackOverFlow Error)
     */

    /*
     * 
     * 1) Implement a program to calculate sum of 'n' natural numbers
     * 2) Implement a program to calculate a^b (a to the power b)
     * 3) Implement a program to find factorial of the given number?
     * 4) Implement a program to calculate product of two integer values (a*b)
     * 5) Implement a program to check whether the given number is prime number or
     * not?
     * 6) Implement a program to find sum of digits present in the given number?
     * 7) Implement a program to calcualte reverse of the given number?
     * 8) Implement a program to count number of digits present in the given
     * number?
     * 9) Implement a program to convert decimal number into binary?
     * 10) Implement a program to find nth fib number
     * 11) Implement a program to find LCM of two numbers?
     * 12) Implement a program to find HCF/GCD of the given two numbers
     * 13) Implement a program to find reverse of the given string using recursion?
     * 14) Implement a program to remove the given character from a string?
     * 15) Implement a program to return Str, where all the adjacent chars are sep
     * by a "*".
     * 16) Implement a program to return true if a string nesting of zero or more
     * pairs of ()
     * 17) Implement a program to count number of times, the give char occurred.
     * 18) IMP to replace the given old character with new character in the original
     * string?
     * 
     * 19) Implement a program to same character is get identical adjcent chars
     * are sep by *
     * 
     */
    public static void main(String[] args) {

        System.out.println("Sum n natural number " +
                recursion_Sum_natural_Number(5));

        System.out.println(" a power & b " + Power(9, 3));

        System.out.println("Factorial :-> " + factorial(5));

        System.out.println("Mutiple Two number " + mutiple_Integer(4, 3));

        System.out.println("Prime Number " + prime_Number(1009, 500));

        System.out.println("Sum Of All Digital " + sum_Digital_Number(123456));

        System.out.println("Reverse of number" + reverseOfNumber(123, 3));

        System.out.println("Count of number " + count_Number(12345));

        System.out.println("decimal_Convert_Binary " + decimal_Convert_Binary(19));

        for (int i = 0; i < 8; i++) {
            System.out.println("Fibnonaci number " + i + ":---> " + fib(i));
        }

        System.out.println("LCM number " + lcm_Number(24, 57));

        System.out.println("HCF  :--> " + hcf(24, 59));

        System.out.println("Reverse Alphabet Letter " + reverseAlphabnetletter("amol"));

        System.out.println("Remove character from String :-> " + removeCharcter_Alphabet("axmxoxl", 6));

        System.out.println("Remove character : -> " + remove_Character("amol"));

        System.out.println("Adjacent string Add :-> " + adjacent_String_Add("amol"));

        System.out.println("Nesting :-> " + nesting_element_compare("(((())))"));

        System.out.println("Count N number of Result " +
                count_N_Given_Char("axxmxolx"));

        String wordOriginal = "teyou";
        String replaceOldWord = "e";
        String replaceNewWord = "srilanaka project";

        int compareWordLength = replaceOldWord.length();
        System.out.println("Replace Word " +
                replaceString(wordOriginal, wordOriginal.length() - 1, replaceOldWord,
                        replaceNewWord,
                        compareWordLength));

        System.out.println("sameCharacter_Inbetween_Add : -> " + sameCharacter_Inbetween_Add("aamol", 4));
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

    // 12) Implement a program to find HCF/GCD of the given two numbers
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

    // 13) Implement a program to find reverse of the given string using recursion?
    public static String reverseAlphabnetletter(String s) {

        if (s == null || s.length() == 1) {
            return s;
        } else {
            return reverseAlphabnetletter(s.substring(1)) + s.charAt(0);
        }
    }

    // 14) Implement a program to remove the given character from a string
    // Version 1
    public static String removeCharcter_Alphabet(String character, int reducedSize_String) {

        if (reducedSize_String < 0) {
            return " ";
        }

        if (character == null || character.isEmpty() || character.length() == 1) {
            return character;
        } else if (character.charAt(reducedSize_String) == 'x') {
            return removeCharcter_Alphabet(character, reducedSize_String - 1);
        } else {
            return removeCharcter_Alphabet(character, reducedSize_String - 1) + character.charAt(reducedSize_String);
        }
    }

    // Version 2
    public static String remove_Character(String character) {

        if (character == null || character.isEmpty()) {
            return "";
        }

        if (character.length() == 1) {
            return character;
        } else if (character.charAt(character.length() - 1) == 'x') {
            return remove_Character(character.substring(0, character.length() - 1));
        } else {
            return remove_Character(character.substring(0, character.length() - 1))
                    + character.charAt(character.length() - 1);
        }
    }

    // 15) Implement a program to return Str, where all the adjacent chars are sep
    // by a "*"

    public static String adjacent_String_Add(String character) {

        if (character == null || character.isEmpty()) {
            return "";
        }

        if (character.length() == 1) {
            return "*" + character;
        } else {
            int length = character.length() - 1;
            return adjacent_String_Add(character.substring(0, length)) + "*" + character.charAt(length);
        }
    }

    // 16) Implement a program to return true if a string nesting of zero or more
    // pairs of ()

    public static boolean nesting_element_compare(String character) {

        if (character == null || character.isEmpty()) {
            return false;
        }

        int low = 0;
        int high = character.length() - 1;
        int count_open = 0;
        int count_close = 0;

        while (low <= high) {

            if (character.charAt(low) == '(' || character.charAt(high) == '(') {
                count_open++;
            }
            if (character.charAt(low) == ')' || character.charAt(high) == ')') {
                count_close++;
            }
            low++;
            high--;
        }

        if (count_close == count_open) {
            return true;
        } else {
            return false;
        }
    }

    // 17) Implement a program to count number of times, the give char occurred.
    static int count_times = 0;

    public static int count_N_Given_Char(String character) {

        if (character == null || character.isEmpty()) {
            return 0;
        }

        if (character.charAt(character.length() - 1) == 1) {
            if (character.charAt(character.length() - 1) == 'x')
                count_times++;
        }

        if (character.charAt(character.length() - 1) == 'x') {
            count_times++;
            count_N_Given_Char(character.substring(0, character.length() - 1));
        } else {
            count_N_Given_Char(character.substring(0, character.length() - 1));
        }
        return count_times;
    }

    // 18) IMP to replace the given old character with new character in the original
    // string
    public static String replaceString(String s, int count, String compareWord, String replaceWord,
            int compareWordLength) {

        if (s == null || s.isEmpty()) {
            return "";
        }

        if (count < compareWordLength - 1) { // Base case: when remaining string is smaller than compareWord
            return s.substring(0, count + 1);
        }
        if (s.substring(count - compareWordLength + 1, count + 1).equalsIgnoreCase(compareWord)) {
            return replaceString(s, count - compareWordLength, compareWord, replaceWord, compareWordLength)
                    + replaceWord;
        } else {
            return replaceString(s, count - 1, compareWord, replaceWord, compareWordLength) + s.charAt(count);
        }
    }

    // 19) Implement a program to same character is get identical adjcent chars are
    // sep by *
    public static String sameCharacter_Inbetween_Add(String s, int index) {
        if (index < 1)
            return s.substring(0, index + 1);
        if (s.charAt(index - 1) == s.charAt(index))
            return sameCharacter_Inbetween_Add(s, index - 1) + "*" + s.charAt(index);
        else
            return sameCharacter_Inbetween_Add(s, index - 1) + s.charAt(index);
    }

}