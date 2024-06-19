import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bread = new String[] {"샌드위치", "바게트"};
        int[] prices = new int[] { 2000, 3500};
        int select;
        int sandwich_count= 0;
        int baguette_count = 0;
        int count;
        int total=0;

        while (true) {
            System.out.print("주문할 상품을 선택하세요 (");
            for (int i = 1; i <= bread.length; i++) {
                System.out.printf(i +": "+ bread[i-1] + ", ");
            }
            System.out.println("0: 주문 종료)");
            select = sc.nextInt();

            if (select == 0) {
                System.out.println("최종 주문 내역: ");
                System.out.println(bread[0] +": "+ sandwich_count +"개");
                System.out.println(bread[1] +": "+ baguette_count +"개");
                System.out.println("최종 주문 가격: " +total+ "원");
                break;
            } else if (select == 1 || select == 2) {
                System.out.println("선택한 상품: " +bread[select-1]);

                System.out.println("주문할 수량을 입력하세요: ");
                count = sc.nextInt();

                if (select == 1) {
                    sandwich_count += count;
                } else if (select == 2) {
                    baguette_count += count;
                }

                System.out.println("현재 주문 상황: ");
                System.out.println(bread[0] +": "+ sandwich_count +"개");
                System.out.println(bread[1] +": "+ baguette_count +"개");
                total = (prices[0] * sandwich_count) + (prices[1] * baguette_count);
                System.out.println("현재까지의 총 주문 금액: " +total+ "원");
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
