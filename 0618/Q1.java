import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        Integer[] arr = new Integer[20];
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }

        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));

        for (int i=0 ;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("Maximum value: " +max);
        System.out.println("Index of maximum: " +index);

        Arrays.sort(arr);
        System.out.println("Array in ascending order: "+Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array in descending order: "+Arrays.toString(arr) );

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        Integer[] uniqueArr = set.toArray(new Integer[0]);
        System.out.println("Unique values: " +Arrays.toString(uniqueArr));

        System.out.println("Count of unique values: " + uniqueArr.length);
    }
}
