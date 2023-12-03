import java.util.Arrays;

public class Search_Insert_Position_LeetCode {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};

        int target = 7;
        int index = findIndex(array, target);
        System.out.println(index);
    }

    private static int findIndex(int[] array, int target) {
        Arrays.sort(array);
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            } else if (array[i] > target) {
                return i;
            }
        }
        return i;
    }
}
