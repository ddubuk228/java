import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        fruits.stream()
                .distinct()
                .forEach(f -> System.out.println(f));

        System.out.println();

        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        strings.stream()
                .filter(s -> s.length() >= 5)
                .forEach(s -> System.out.println(s));
    }
}
