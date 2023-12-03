import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterSetStream_3 {
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};

        List<Integer> list = Arrays.stream(array).boxed().toList();

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);

    }
}
