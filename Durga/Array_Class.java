import java.util.Arrays;

public class Array_Class {

    public static void main(String[] args) {

        int[] array_A = { 1, 4, 2, 5, 3, 6 };
        sorting_Array_Asc(array_A);
        sorting_Array_DSC(array_A);

        predifned_Method(array_A);

        second_Min_ElementArray(array_A);

        second_Max_ElementArray(array_A);

        // alternative_Smaller_Largest(array_A);

        // System.out.println(binarySearch(array_A, 0));

        // System.out.println(Arrays.toString(insert_Element_First(array_A, 10)));

        // System.out.println(Arrays.toString(insert_Element_Given_Location(array_A, 60,
        // 0)));

        System.out.println(Arrays.toString(delete_Element_Given_Location(array_A, 9)));

    }

    public static void sorting_Array_Asc(int[] a) {

        int length = a.length - 1;

        for (int i = 0; i <= length; i++) {

            for (int j = i + 1; j <= length; j++) {

                int temp;
                if (a[i] > a[j]) {

                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (int i = 0; i <= length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sorting_Array_DSC(int[] a) {

        int length = a.length - 1;

        for (int i = 0; i <= length; i++) {

            for (int j = i + 1; j <= length; j++) {

                int temp;
                if (a[i] < a[j]) {

                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (int i = 0; i <= length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void predifned_Method(int[] a) {

        Arrays.sort(a);

        int length = a.length - 1;

        for (int i = 0; i <= length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void second_Min_ElementArray(int[] a) {

        Arrays.sort(a);

        System.out.println(a[1]);
    }

    public static void second_Max_ElementArray(int[] a) {

        Arrays.sort(a);

        int length = a.length - 1;
        System.out.println(a[length - 1]);
    }

    public static void alternative_Smaller_Largest(int[] a) {

        Arrays.sort(a);

        int length = a.length - 1;

        for (int i = 0; i <= (length / 2); i++) {

            int b = a[i];
            int c = a[length - i];

            System.out.println(b + " " + c);
        }

    }

    public static int binarySearch(int[] a, int requiredValue) {

        Arrays.sort(a);

        int high = a.length - 1;
        int low = 0;
        int middle;

        while (low <= high) {

            middle = (low + high) / 2;

            if (a[middle] == requiredValue) {

                return middle;
            } else if (a[middle] > requiredValue) {

                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }

    public static int[] insert_Element_First(int[] a, int insertElement) {

        int[] b = new int[a.length + 1];

        b[0] = insertElement;

        for (int i = 0; i < a.length; i++) {

            b[i + 1] = a[i];
        }

        return b;

    }

    public static int[] insert_Element_Given_Location(int[] a, int insertElement, int givenLocation) {

        int[] b = new int[a.length + 1];
        int j = 0;

        if (givenLocation > (a.length + 1)) {
            return b;
        }

        for (int i = 0; i < a.length; i++, j++) {

            if (i == givenLocation) {
                b[j] = insertElement;
                j++;
                b[j] = a[i];
            } else {
                b[j] = a[i];
            }
        }

        if ((a.length) == givenLocation) {
            b[j] = insertElement;
        }

        return b;
    }

    public static int[] delete_Element_Given_Location(int[] a, int requiredLocation) {

        int[] b = new int[a.length - 1];

        if (requiredLocation >= a.length) {
            return b;
        }

        int j = 0;
        for (int i = 0; i < a.length; i++) {

            if (i == requiredLocation) {
                continue;
            } else {
                b[j] = a[i];
                j++;
            }
        }

        return b;

    }

}
