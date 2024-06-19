import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");
        int select;
        String[] movie = new String[] {"인사이드 아웃2", "설계자", "너의 이름은", "명탐정 코난 VS 괴도 키드", "파묘"};
        int[] price = new int[] {7150, 11000, 1200, 11000, 7000};

        System.out.println("네이버 시리즈온 실시간 영화 목록:");
        for (int i = 1; i <= movie.length; i++) {
            System.out.println(i +". "+ movie[i - 1] + " - " + price[i - 1]+"원");
        }
        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5):");
        select = sc.nextInt();
        System.out.println("선택한 영화: "+movie[select - 1]);
        System.out.println("가격: "+df.format(price[select - 1])+"원");
    }
}
