import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[2];

        for(int i=0; i<2; i++) {
            System.out.print("책제목, 작가, isbn을 순서대로 입력>> ");
            String info = sc.nextLine();
            String[] book = info.split(" ");
            books[i] = new Book();
            books[i].setTitle(book[0]);
            books[i].setAuthor(book[1]);
            books[i].setIsbn(book[2]);
        }
        System.out.println("----------- 등록된 도서관 책 목록 -----------");
        for(Book i : books) {
            i.displayInfo();
        }
    }
}
