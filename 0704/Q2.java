import java.util.Arrays;
import java.util.OptionalInt;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {5,3,10,40,2};
        int[] arr3 = {1,2,2,5,5,6,7,7,9,10};

        int sum = Arrays.stream(arr)
                .filter(x -> x % 2 != 0)
                .sum();
        System.out.println(sum);

        OptionalInt max = Arrays.stream(arr2)
                        .max();
        System.out.println(max.getAsInt());

        Arrays.stream(arr3)
                .filter(x -> x >5)
                .distinct()
                .forEach(x -> System.out.print(x + " "));
    }
}
