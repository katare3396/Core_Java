import java.util.ArrayList;
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
     * 2) bubble sort: Descending order
     * 3) Selection Sort ASC
     * 4) Selection Sort DSC
     * 5)INsertion Sort (Playing card)
     * 6) Insertion sort Dsc
     * 7) Quick Sort pivot right
     * 8) Quick sort Pivot left
     * 9) Merge Sort
     * 10) Shell sort
     * 
     */
    public static void main(String[] args) {

        int array_A[] = { 5, 3, 1, 4, 2, 6 };

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

        // quick_Sort_Pivot_Left(array_A, 0, array_A.length - 1);

        merge_Sort(array_A, array_A.length);

        // shell_Sort(array_A);

        // System.out.println("Linear search " + linear_Search(array_A, 499));

        // System.out.println("Linear Search have index mutiple Result " +
        // linear_search(array_A, 5));

        // System.out.println("Binary Search " + binarySearch(array_A, 55));

        System.out.println("Binary search " + binarySearch_Recursion(array_A, 0, (array_A.length - 1), 7));
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

                // Selection index (Compare min & i)
                if (a[min] > a[j]) {
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

    /*
     * 7) Quick Sort pivot right
     * Pivot select right
     * [2,4,5,6,7]
     * 
     * pivot --> 7
     * 
     * working array --> [2,4,5,6]
     * 
     * pivot compare left (small)
     * pivot compare right (large)
     * 
     * not satisy
     * swap left & right
     * 
     * (left < right)
     * condtion not satisy than swap (right pivot & left)
     * condtion not satisy than swap (left pivot & right)
     * 
     * Iteration left side
     * Iteration right side
     */
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
     * 9) Merge Sort
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
     * 
     * small value put first & large value put in second
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
        int j = 0;
        for (int i = mid; i < n; i++) {
            right[j++] = a[i];
        }

        System.out.println("Before Sort " + Arrays.toString(a));
        // Left side
        merge_Sort(left, left.length);
        // Right side
        merge_Sort(right, right.length);

        merge(a, left, right, mid, n - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        // Compare left is greated or right (small value put in first index)
        while (i < left && j < right) {
            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }

        // Greater value put in second index
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];

        System.out.println("After sort " + Arrays.toString(a));

    }

    // 10) Shell sort
    /*
     * [5,3,1,4,2,6]
     * 
     * First find gap -> (6/2) -> 3
     * 
     * second start compare 0 index (1 postion) & 2 index ( Gap)
     * 0 index should less than 2 index
     * 0 index is greater than 2 index (swap)
     * [4,2,1,5,3,6]
     * 
     * Three step
     * 0 index is greater than 1 index interchange postion
     * 0 index is less than 1 index --> more (compare 1 index & 2index)
     * 
     * compare 2 index
     * 0 index is less than 2 , 1 index
     * [4,2,1,5,3,6]
     * <-- less value than compare all element toward left
     * 
     * final
     * [1, 2, 3, 4, 5, 6]
     */
    public static void shell_Sort(int[] arr) {
        int n = arr.length;

        // Start with a gap of n/2, then reduce it by half
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Perform a gapped insertion sort for this gap
            for (int i = gap; i < n; i++) {
                System.out.println(i + "  i " + gap + "  gap ");
                int temp = arr[i];
                int j;

                // Shift earlier gap-sorted elements until the correct location is found
                for (j = i; j >= gap; j = j - gap) {

                    System.out.println(" j " + j + " gap " + gap + "Subtarct " + (j - gap) + " i " + i);
                    if (arr[j - gap] < temp) {
                        break;
                    } else {
                        arr[j] = arr[j - gap];
                    }
                }

                // Place the current element at its correct location
                arr[j] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    /*
     * Searching
     */
    // 1) Linear Search
    public static Boolean linear_Search(int[] a, int SearchValue) {

        int length = a.length;

        for (int i = 0; i < length; i++) {
            if (a[i] == SearchValue) {
                return true;
            }
        }
        return false;
    }

    // Linear search Mutiple data
    public static ArrayList<Integer> linear_search(int[] a, int search_key) {

        int length = a.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {

            if (a[i] == search_key) {
                list.add(i);
            }

        }
        return list;
    }

    // Binary search
    public static int binarySearch(int[] a, int key) {

        int length = a.length;
        int low = 0;
        int high = length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Binary search by Recursion
    public static int binarySearch_Recursion(int[] a, int low_index, int high_index, int key) {

        int middle = (low_index + high_index) / 2;

        if (low_index > high_index) {
            return -1;
        }

        if (a[middle] == key) {
            return middle;
        } else if (a[middle] > key) {
            return binarySearch_Recursion(a, low_index, middle - 1, key);
        } else {
            return binarySearch_Recursion(a, middle + 1, high_index, key);
        }

    }
}
