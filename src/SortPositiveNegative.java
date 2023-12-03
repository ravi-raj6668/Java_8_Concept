import java.util.Arrays;
import java.util.List;

public class SortPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -1, -2, -5, 12, -11, -7, 15};
        int[] result = sortNumber(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
    public static int[] sortNumber(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
