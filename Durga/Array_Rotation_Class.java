import java.util.Arrays;

public class Array_Rotation_Class {

    /*
     * 1) Brute Force --> Left Position
     * 2) Brute Force --> Right Position
     * 
     * 3) left_rotate_By_Using_Temp
     * 4) right_rotate_By_Using_Temp
     */
    public static void main(String[] args) {

        System.out.println("Brute Force --> Left Position " +
                Arrays.toString(array_left_Rotation(new int[] { 1, 2, 3,
                        4, 5 }, 6)));

        System.out.println("Brute Force --> Right Position "
                + Arrays.toString(array_right_Rotation(new int[] { 1, 2, 3, 4, 5 }, 3)));

        System.out.println("left_rotate_By_Using_Temp "
                + Arrays.toString(left_rotate_By_Using_Temp(new int[] { 1, 2, 3, 4, 5 },
                        1)));

        System.out.println("right_rotate_By_Using_Temp  "
                + Arrays.toString(right_rotate_By_Using_Temp(new int[] { 1, 2, 3, 4, 5 }, 1)));

    }

    /*
     * 1) Brute Force --> Left Position
     * --------------
     * Rotate all the elements by one position towards left/right direction for 'r'
     * rotations.
     * 
     * [1,2,3,4,5] --> [2, 3, 4, 5, 1]
     * 
     * prev = array[(array.length-1)]
     * array[(array.length-1)] =array[0]
     */
    public static int[] array_left_Rotation(int[] array_element, int number_Rotation) {

        int array_length = array_element.length;

        int prev = 0;
        int temp = 0;

        for (int i = 0; i < number_Rotation; i++) {

            prev = array_element[0];
            for (int j = (array_length - 1); j >= 0; j--) {

                temp = array_element[j];
                array_element[j] = prev;
                prev = temp;
            }
        }
        return array_element;
    }

    /*
     * 2) Brute Force --> Right Position
     * --------------
     * Rotate all the elements by one position towards left/right direction for 'r'
     * rotations.
     */
    public static int[] array_right_Rotation(int[] array_element, int number_Rotation) {

        int array_length = array_element.length;

        int prev = 0;
        int temp = 0;

        for (int i = 0; i < number_Rotation; i++) {

            prev = array_element[(array_length - 1)];
            for (int j = 0; j < array_length; j++) {

                temp = array_element[j];
                array_element[j] = prev;
                prev = temp;
            }
        }
        return array_element;
    }

    /*
     * 3) by using 'temp' variable
     */
    public static int[] left_rotate_By_Using_Temp(int[] array_element, int number_Rotation) {

        int array_length = array_element.length;

        int temp = 0;

        for (int i = 0; i < number_Rotation; i++) {

            temp = array_element[0];

            for (int j = 0; j < (array_length - 1); j++) {
                array_element[j] = array_element[j + 1];
            }

            array_element[array_length - 1] = temp;
        }
        return array_element;
    }

    public static int[] right_rotate_By_Using_Temp(int[] array_element, int number_Rotation) {

        int array_length = array_element.length;

        int temp = 0;

        for (int i = 0; i < number_Rotation; i++) {

            temp = array_element[array_length - 1];

            for (int j = array_length - 1; j > 0; j--) {
                array_element[j] = array_element[j - 1];
            }

            array_element[0] = temp;
        }
        return array_element;
    }

}
