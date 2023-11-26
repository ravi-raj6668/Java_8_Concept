import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenStream {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 7, 21, 11, 55, 42, 38, 59, 62};

        //converting array to list
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        System.out.println("Before filter out the even number : " + list); //[1, 4, 5, 7, 21, 11, 55, 42, 38, 59, 62]

        ArrayList<Integer> filterList = filterEvenNumber((ArrayList<Integer>) list);
        System.out.println("List of even number after filter out : " + Collections.singletonList(filterList)); //[[4, 42, 38, 62]]
    }

    //filter using stream API
    public static ArrayList<Integer> filterEvenNumber(ArrayList<Integer> integerArrayList) {
        return (ArrayList<Integer>) integerArrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

}





