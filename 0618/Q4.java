import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] seats = new Integer[10] ;
        Arrays.fill(seats,0);
        int x;

        while (true) {
            System.out.println("현재 좌석 상태:");
            for (int i = 1; i <= seats.length; i++) {
                System.out.print(i+":"+seats[i-1]+" ");
            }
            System.out.println();
            System.out.print("예매할 좌석 번호를 입력하세요 (종료하려면 0 입력: ");
            x = sc.nextInt();
            if (x==0) {
                break;
            } else {
                seats[x-1] = 1;
                System.out.println(x +"번 좌석이 예매되었습니다.");
                System.out.println("=========================================");
            }
        }
        int total_seats = Collections.frequency(Arrays.asList(seats), 1);
        int total_amount = total_seats * 10000;
        System.out.println("예매돈 좌석 수: " +total_seats);
        System.out.println("총 예매 금액: " +total_amount);
    }
}
