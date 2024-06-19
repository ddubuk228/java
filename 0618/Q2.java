import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[10];
        Integer[] arr2 = new Integer[10];
        Random r = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(50)+1;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(50)+51;
        }

        Integer[] arr3 = new Integer[arr1.length + arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);

        System.out.println("배열1: " +Arrays.toString(arr1));
        System.out.println("배열2: " +Arrays.toString(arr2));

        Set<Integer> set = new HashSet<>(Arrays.asList(arr3));
        Integer[] uniqueArr = set.toArray(new Integer[0]);
        System.out.println("중복 값 제거된 배열: " +Arrays.toString(uniqueArr));
        Arrays.sort(uniqueArr);
        System.out.println("오름차순 정렬된 배열: " +Arrays.toString(uniqueArr));
        System.out.println("최대값: " +uniqueArr[uniqueArr.length-1]);
        System.out.println("최소값: " +uniqueArr[0]);
        System.out.println("최대값의 위치: " +(uniqueArr.length-1));
        System.out.println("최소값의 위치: " +0);
    }
}
