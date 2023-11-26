import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream_API_1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            int randomValue = random.nextInt(100);
            integerList.add(randomValue);
        }
        System.out.println("List of integer value in array list : " + integerList);

        ArrayList<Integer> filterList = filterEvenNumber(integerList);
        System.out.println("List of even number after filter out using Stream API : " + Collections.singletonList(filterList));
    }

    //filter using stream API
    public static ArrayList<Integer> filterEvenNumber(ArrayList<Integer> integerArrayList) {
        return (ArrayList<Integer>) integerArrayList.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
    }
}
