import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        String[] subject = new String[] {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] grade1 = new int[] {44, 66, 22, 99, 100};
        int[] grade2 = grade1.clone();
        int same_grade = 0;
        int up_grade = 0;
        ArrayList<Integer> index = new ArrayList<>();

        grade2[0] = 22;
        grade2[2] = 88;

        System.out.println("1학기 성적: " + Arrays.toString(grade1));
        System.out.println("2학기 성적: " + Arrays.toString(grade2));

        for (int i = 0; i < grade1.length; i++) {
            if (grade1[i] == grade2[i]) {
                same_grade++;
            }
        }
        System.out.println("1학기와 2학기 성적이 동일한 과목 수: " + same_grade);
        for (int i = 0; i < grade1.length; i++) {
            if (grade1[i] < grade2[i]) {
                up_grade++;
                index.add(i);
            }
        }
        System.out.println("1학기보다 성적이 오른 과목 수: " +up_grade);
        System.out.print("성적이 오른 과목명: ");
        for (int i = 0; i < index.size(); i++) {
            System.out.printf(subject[index.get(i)] +" ");
        }
    }
}
