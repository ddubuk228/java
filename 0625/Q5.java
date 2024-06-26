import java.util.Scanner;

class Drink {
    String name;
    int cost;
    int count;

    Drink() {
    }

    Drink(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    @Override
    public String toString() {
        return name +
                " (가격: " +
                cost +
                "원, 재고: " +
                count + "개)";
    }
}

public class Q5 {
    private static Drink[] drinks = {
            new Drink("콜라", 1200, 10),
            new Drink("사이다", 1100, 10),
            new Drink("커피", 900, 10),

    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        int num = -1;

        while (true) {
            System.out.println("자판기 메뉴");
            System.out.println("1. 음료 보기");
            System.out.println("2. 음료 구매");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("음료 목록:");
                    for (int i = 1; i <= drinks.length; i++) {
                        System.out.println(i +". "+drinks[i-1].toString());
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("음료 목록:");
                    for (int i = 1; i <= drinks.length; i++) {
                        System.out.println(i +". "+drinks[i-1].toString());
                    }
                    System.out.print("구매할 음료 번호를 선택하세요: ");
                    num = sc.nextInt();
                    if((num >0) && (num <=drinks.length)) {
                        if (drinks[num - 1].count > 0) {
                            System.out.println(drinks[num - 1].name + "을 구매했습니다.\n");
                            drinks[num - 1].count--;
                            num = -1;
                        } else {
                            System.out.println("재고가 없습니다.\n");
                        }
                    } else {
                        System.out.println("번호를 잘못 입력했습니다.\n");
                    }
                    break;
                case 3:
                    System.out.println("자판기를 종료합니다");
                    System.exit(0);
                default:
                    System.out.println("번호를 잘못 입력했습니다.\n");
                    break;
            }
        }
    }
}
