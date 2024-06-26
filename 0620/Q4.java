import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[3];

        for (int i = 0; i < 3; i++) {
            items[i] = new Item();
        }

        items[0].name = "Burger";
        items[0].price = 5.99;
        items[1].name = "Fries";
        items[1].price = 2.99;
        items[2].name = "Soda";
        items[2].price = 1.99;

        ArrayList<Integer> orders = new ArrayList<>();
        String select;

        while (true){
            System.out.println("주문 가능한 메뉴입니다.");
            System.out.println("===================================");
            for (int i = 1; i <= 3; i++) {
                System.out.println(i +">> "+ items[i-1].getName() +": "+ "$"+items[i-1].getPrice()) ;
            }
            System.out.print("\n메뉴 번호 입력, 3개 모두 주문 완료되었으면 'x'입력 >> ");
            select = sc.next();
            if (select.equals("x")){
                System.out.println("프로그램을 종료합니다\n");
                break;
            } else {
                orders.add((Integer.parseInt(select)-1));
            }
        }
        System.out.println("Your order:");
        for(int i=0; i<orders.size(); i++) {
            System.out.println(items[orders.get(i)].getName()+": "+items[orders.get(i)].getPrice());
        }
    }
}
