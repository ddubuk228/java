public class Q1 {
    public static void main(String[] args) {
        AppleComputer apple = new AppleComputer();
        BananaComputer banana = new BananaComputer();

        System.out.println("에플 컴퓨터-----------------");
        apple.start();
        apple.shutdown();
        apple.restart();

        System.out.println("바나나 컴퓨터-----------------");
        banana.start();
        banana.shutdown();
        banana.restart();
    }
}
