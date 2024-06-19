import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = 0;
        int[] scores = null;
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");
            int x = sc.nextInt();


            switch (x) {
                case 1:
                    System.out.print("학생수> ");
                    student = sc.nextInt();
                    scores = new int[student];
                    break;
                case 2:
                    if (scores == null) {
                        System.out.println("학생수를 먼저 입력하세요.");
                        break;
                    }
                    for (int i = 0; i < student; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = sc.nextInt();
                    }
                    ;
                    break;
                case 3:
                    if (scores == null) {
                        System.out.println("학생수를 먼저 입력하세요.");
                        break;
                    }
                    for (int i = 0; i < student; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                    break;
                case 4:
                    int max = scores[0];
                    double sum = 0;
                    for (int i = 0; i < student; i++) {
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + (sum / student));
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    System.exit(0);
            }
        }
    }
}
