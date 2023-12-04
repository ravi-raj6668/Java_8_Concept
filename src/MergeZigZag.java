import java.util.Arrays;

public class MergeZigZag {
    public static void main(String[] args) {
        int[] array = {13, 2, 45, 12, 55, 71, 23};

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        int[] mergedArray = new int[array.length * 2];
        int sortedArrayIndex = 0;
        int unsortedArrayIndex = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (i % 2 == 0) {
                mergedArray[i] = array[unsortedArrayIndex];
                unsortedArrayIndex++;
            } else {
                mergedArray[i] = sortedArray[sortedArrayIndex];
                sortedArrayIndex++;
            }
        }
        System.out.println(Arrays.toString(mergedArray));
    }
}
