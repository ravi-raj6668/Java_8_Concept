import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenStream {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 7, 21, 11, 55, 42, 38, 59, 62};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        System.out.println(list);

        ArrayList<Integer> filterList = filterEvenNumber((ArrayList<Integer>) list);
        System.out.println("List of even number after filter out using Stream API : " + Collections.singletonList(filterList));
    }

    //filter using stream API
    public static ArrayList<Integer> filterEvenNumber(ArrayList<Integer> integerArrayList) {
        return (ArrayList<Integer>) integerArrayList.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
    }

}





