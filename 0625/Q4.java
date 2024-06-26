import java.util.Scanner;

class Account {
    String account_number;
    String name;
    int balances=0;

    public Account() {}
    public Account(String account_number, String name, int balances) {
        this.account_number = account_number;
        this.name = name;
        this.balances = balances;
    }

    public void deposit(int amount) {
        balances+=amount;
    }

    public void withdraw(int amount) {
        balances-=amount;
    }

    @Override
    public String toString() {
        return account_number +
                "\t" +
                name +
                "\t" +
                balances;
    }
}


public class Q4 {
    private static Account[] accounts = new Account[3];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String account_number;
        int balances;
        int index=-1;

        while(true) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");

            System.out.print("선택> ");
            select = sc.nextInt();

            switch(select) {
                case 1:
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    if(count <3){
                        accounts[count] = new Account();
                        System.out.print("계좌번호: ");
                        accounts[count].account_number = sc.next();
                        System.out.print("계좌주: ");
                        accounts[count].name = sc.next();
                        System.out.print("초기입금액: ");
                        accounts[count].balances = sc.nextInt();
                        count++;
                        System.out.println("결과: 계좌가 생성되었습니다.");
                    } else {
                        System.out.println("계좌 생성이 불가능합니다.");
                    }
                    break;
                case 2:
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");
                    if(count >0){
                        for(int i=0; i<count; i++){
                            System.out.println(accounts[i].toString());
                        }
                    } else {
                        System.out.println("계좌가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    account_number = sc.next();
                    System.out.print("예금액: ");
                    balances = sc.nextInt();

                    if(count >0){
                        for(int i=0; i<count; i++){
                            if(accounts[i].account_number.equals(account_number)){
                                index = i;
                            }
                        }
                        if(index != -1) {
                            accounts[index].deposit(balances);
                            System.out.println("결과: 예금이 성공되었습니다.");
                            index =-1;
                        } else {
                            System.out.println("맞는 계좌가 없습니다.");
                        }
                    } else {
                        System.out.println("계좌가 없습니다.");
                    }
                    break;
                case 4:
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");

                    System.out.print("계좌번호: ");
                    account_number = sc.next();
                    System.out.print("출금액: ");
                    balances = sc.nextInt();

                    if(count >0){
                        for(int i=0; i<count; i++){
                            if(accounts[i].account_number.equals(account_number)){
                                index = i;
                            }
                        }
                        if(index != -1) {
                            accounts[index].withdraw(balances);
                            System.out.println("결과: 출금이 성공되었습니다.");
                            index =-1;
                        } else {
                            System.out.println("맞는 계좌가 없습니다.");
                        }
                    } else {
                        System.out.println("계좌가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력했습니다.");
                    break;
            }
        }

    }
}
