import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamAPI_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            int randomValue = random.nextInt(100);
            list.add(randomValue);
        }
        System.out.println("List of integer value in array list : " + list);

        List<Integer> doubleNumber = doubleValue(list);
        System.out.println("List of integer after double the value : " + doubleNumber);
    }

    public static List<Integer> doubleValue(List<Integer> list){
        return list.stream().map(num -> num * 2).collect(Collectors.toList());
    }
}
