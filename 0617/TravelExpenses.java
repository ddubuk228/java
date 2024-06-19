import java.util.Scanner;

public class TravelExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("여행 지역을 입력하세요: ");
        String area = sc.next();
        System.out.print("1인당 경비를 입력하세요: ");
        double expenses = sc.nextInt();
        System.out.print("여행 인원을 입력하세요: ");
        int people = sc.nextInt();
        System.out.print("할인율(%)을 입력하세요: ");
        float discount = sc.nextInt();
        System.out.print("VIP 여부 (true/false)를 입력하세요: ");
        boolean vip = sc.nextBoolean();
        System.out.print("당부의 말을 입력하세요: ");
        sc.nextLine();
        String purpose = sc.nextLine();

        double total = expenses * people;

        double result_discout;
            if(vip) {
                result_discout = discount +5;
            } else {
                result_discout = discount;
            };
        double discount_expenses = (total * result_discout)/100;

        System.out.println();
        System.out.println("===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " +area);
        System.out.println("1인당 경비: " +expenses+ "원");
        System.out.println("여행 인원: " +people+ "명");
        System.out.println("기본 할인율: "+discount+ "%");
        System.out.println("vip 추가 할인율: 5%");
        System.out.println("최종 할인율 : " +result_discout+ "%");
        System.out.println("총 경비: " +total+"원");
        System.out.println("할인 금액: " +discount_expenses+"원" );
        System.out.println("할인 후 총 경비: "+(total-discount_expenses)+"원" );
        System.out.println("당부의 말: " +purpose);
    }
}
