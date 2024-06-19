import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] test = new int[1000];
        int[] my = new int[1000];
        int point = 0;

        for (int i=0; i<1000; i++) {
            test[i] = r.nextInt(4)+1;
            my[i] = r.nextInt(4)+1;
        }

        System.out.print("Index\tCorrect Answer\tMy Answer\n");
        for (int i=0; i<1000; i++) {
            System.out.println(i + "\t\t\t" + test[i] + "\t\t\t\t" + my[i]);
            if (test[i] == my[i]) {
                point++;
            }
        }


        System.out.println("맞춘 개수: " +point);
    }
}
