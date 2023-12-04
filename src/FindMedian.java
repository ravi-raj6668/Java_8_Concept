import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, newArray, 0, nums1.length);
        System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
        Arrays.sort(newArray);
        int length = newArray.length;
        if (length % 2 == 0) {
            int mid1 = length / 2 - 1;
            int mid2 = length / 2;
            return (newArray[mid1] + newArray[mid2]) / 2.0;
        } else {
            int mid = length / 2;
            return newArray[mid];
        }
    }
}
