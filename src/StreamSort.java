import java.util.Arrays;

public class StreamSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -1, -2, -5, 12, -11, -7, 15};

        int[] sortedArray = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();
        for (int i : sortedArray)
            System.out.print(i + " ");
    }
}
