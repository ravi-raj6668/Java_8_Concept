import java.util.ArrayList;
import java.util.List;

public class StreamAPI_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Saras");
        list.add("Raj");
        list.add("Gowala");
        list.add("RASA");

        //get words whose length is greater than 3.
        List<String> stringList = list.stream().filter(s -> s.length() > 3).toList();
        System.out.println(stringList);

        //convert to uppercase
        List<String> stringList1 = list.stream().map(String::toUpperCase).toList();
        System.out.println(stringList1);

        long wordCount = list.stream().filter(s -> s.length() > 3).count();
        System.out.println(wordCount);
    }
}
