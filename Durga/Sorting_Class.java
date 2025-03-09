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

        int array_A[] = { 0, 0, 0, 0 };

        // System.out.println("bubble sort: ASC" +
        // Arrays.toString(bubblesort_ASC(array_A)));

        // System.out.println("bubble sort: DSC" +
        // Arrays.toString(bubblesort_DSC(array_A)));

        // System.out.println("Selection sort : ASC " +
        // Arrays.toString(selectionSort_ASC(array_A)));

        // System.out.println("Selection sort : DSC " +
        // Arrays.toString(selectionSort_DSC(array_A)));

        // System.out.println("Insertion Sort Asc " +
        // Arrays.toString(insertionSort_Asc(array_A)));

        // System.out.println("Insertion Sort Dsc " +
        // Arrays.toString(insertionSort_Dsc(array_A)));

        // quick_Sort(array_A, 0, array_A.length - 1);

        quick_Sort_Pivot_Left(array_A, 0, array_A.length - 1);
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

    // 2) bubble sort: Descending order
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

    // 3) Selection Sort ASC
    public static int[] selectionSort_ASC(int[] a) {

        int length = a.length;

        for (int i = 0; i < length; i++) {

            int min = i;
            for (int j = i + 1; j < length; j++) {

                // Selection index
                if (a[i] > a[j]) {
                    min = j;
                }
            }

            if (min != i) {
                a[min] = a[min] + a[i];
                a[i] = a[min] - a[i];
                a[min] = a[min] - a[i];
            }
        }
        return a;
    }

    // 4) Selection Sort DSC
    public static int[] selectionSort_DSC(int[] a) {

        int length = a.length;

        for (int i = 0; i < length; i++) {

            int max = i;
            for (int j = i + 1; j < length; j++) {

                // Selection index
                if (a[i] < a[j]) {
                    max = j;
                }
            }

            if (max != i) {
                a[max] = a[max] + a[i];
                a[i] = a[max] - a[i];
                a[max] = a[max] - a[i];
            }
        }
        return a;
    }

    // 5)INsertion Sort (Playing card)
    public static int[] insertionSort_Asc(int[] a) {

        int length = a.length;

        for (int i = 1; i < length; i++) {
            int temp = a[i];
            for (int j = i - 1; j >= 0; j--) {

                if (a[j] > temp) {

                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    // 6) Insertion sort Dsc
    public static int[] insertionSort_Dsc(int[] a) {

        int length = a.length;

        for (int i = 1; i < length; i++) {
            int temp = a[i];
            for (int j = i - 1; j >= 0; j--) {

                if (a[j] < temp) {

                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    // 7) Quick Sort pivot right
    public static void quick_Sort(int[] a, int leftIndex, int rightIndex) {
        // Base condition: If the array has one or no elements, it's already sorted
        if (leftIndex >= rightIndex) {
            return;
        }

        // Select pivot (last element of the current subarray)
        int pivot = a[rightIndex];
        int left = leftIndex;
        int right = rightIndex - 1;

        // Partitioning
        while (left <= right) {
            while (left <= right && a[left] <= pivot) {
                left++;
            }
            while (left <= right && a[right] >= pivot) {
                right--;
            }
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }

        // Place pivot in its correct position (Swap right_index & left)
        int temp = a[left];
        a[left] = a[rightIndex];
        a[rightIndex] = temp;

        // Recursively sort the subarrays
        quick_Sort(a, leftIndex, left - 1);
        quick_Sort(a, left + 1, rightIndex);

        System.out.println(Arrays.toString(a));
    }

    // 8) Quick sort Pivot left
    public static void quick_Sort_Pivot_Left(int a[], int left_index, int right_index) {

        if (left_index >= right_index) {
            return;
        }

        int pivot = a[left_index];
        int left = left_index + 1;
        int right = right_index;

        while (left <= right) {

            while (left <= right && pivot >= a[left]) {
                left++;
            }
            while (left <= right && pivot <= a[right]) {
                right--;
            }
            if (left < right) {
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
            }
        }

        // Swap Pivot left_index & right
        int temp = a[right];
        a[right] = a[left_index];
        a[left_index] = temp;

        quick_Sort_Pivot_Left(a, left_index, right - 1);
        quick_Sort_Pivot_Left(a, right + 1, right_index);

        System.out.println("Quic Sort Pivot left " + Arrays.toString(a));
    }

    /*
     * Merge Sort
     * 
     * [2 ,3 , 4, 5, 6, 7 , 8]
     * 
     * Step 1) divide two part (7/2 ) = 3
     * [2 ,3,4] [5 ,6,7,8]
     * 
     * step 2) left side iteration (divide two part (3/2 ) = 1)
     * [2] [3,4]
     * iteration left (right side)
     * [3] [4]
     * 
     * step 3) Right side iteration (divide two part (4/2 ) = 2)
     * [5,6] [7,8]
     * right side iteration (left)
     * [5] [6]
     * right side iteration (right)
     * [7] [8]
     */
    public static void merge_Sort(int a[], int n) {

        // Base n = 0 (case terminated)
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = (mid + 1); i > n; i++) {
            right[i - mid] = a[i];
        }
        // Left side
        merge_Sort(left, left.length);
        // Right side
        merge_Sort(right, right.length);
    }
}
