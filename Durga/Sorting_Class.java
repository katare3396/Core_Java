import java.util.Arrays;

public class Sorting_Class {

    /*
     * Sorting
     * Arranging the data in asc order or desc order is called as sorting. there
     * various sorting
     * tech are existed.
     */

    /*
     * 1) bubble sort: Ascending order
     * 
     */
    public static void main(String[] args) {

        int array_A[] = { 1, 3, 2, 4, 1, -1 };

        System.out.println("bubble sort: ASC" + Arrays.toString(bubblesort_ASC(array_A)));

        System.out.println("bubble sort: DSC" + Arrays.toString(bubblesort_DSC(array_A)));

    }

    // 1) bubble sort: Ascending order
    public static int[] bubblesort_ASC(int[] a) {

        int length = a.length;

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {

                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        return a;
    }

    // 1) bubble sort: Descending order
    public static int[] bubblesort_DSC(int[] a) {

        int length = a.length;

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {

                if (a[i] < a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        return a;
    }

}
