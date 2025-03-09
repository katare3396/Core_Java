import java.util.Arrays;

public class Leetcode_Array {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4 };

        int[] b = { 5, 6, 7, 8 };

        // System.out.println(findMedianSortedArrays(a, b));

        int[] max_Area = { 1,8,6,2,5,4,8,3,7 };

        System.out.println("Max Arear " +max_Area(max_Area));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length_num1 = nums1.length;
        int length_num2 = nums2.length;
        int length = length_num1 + length_num2;

        int[] b = new int[length];
        int i = 0;
        int j = 0;

        for (; i < length_num1; i++) {
            b[i] = nums1[i];
        }
        for (; i < length; i++, j++) {
            b[i] = nums2[j];
        }

        Arrays.sort(b);

        int c = b.length;

        if (c % 2 == 0) {

            int e = (c / 2);

            return (b[--e] + b[++e]) / 2.0;

        } else {
            return (double) b[((c - 1) / 2)];

        }
    }

    public static int max_Area(int[] height) {

        int length = (height.length) ;

        int maxxArea = 0;
        int newArea = 0;
        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {

                if (height[i] > height[j]) {
                    newArea = height[j] * (j - i);
                } else {
                    newArea = height[i] * (j - i);
                }

                if (newArea > maxxArea) {
                    maxxArea = newArea;
                }
            }
        }
        return maxxArea;
    }

}
