import java.util.Arrays;

public class StreamFindLength {
    public static void main(String[] args) {
        String s = "The output is list of all words that are of length more than k";
        String[] strings = Arrays.stream(s.split(" ")).filter(word -> word.length() > 4).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }
}
