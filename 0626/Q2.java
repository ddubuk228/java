class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name+ "이(가) 밥을 먹습니다.");
    }
}

class Man extends Person {
    int power;

    Man(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }
    public void run() {
        System.out.println(name+ "이(가) 달립니다");
    }
}

class SuperMan extends Man {
    boolean sky;

    SuperMan(String name, int age, int power, boolean sky) {
        super(name, age, power);
        this.sky = sky;
    }
    @Override
    public void run() {
        System.out.println(name+ "이(가) 빠르게 달립니다.");
    }

    @Override
    public String toString() {
        return "슈퍼맨 [name=" +name+", "
                + "age=" +age+ ", "
                + "power=" +power+ ", "
                + "sky=" +sky+ "]" ;
    }

    public void space() {
        System.out.println(name+ "이(가) 우주를 날아갑니다.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("클라크 켄트", 30, 100, true);
        superMan.eat();
        superMan.run();
        superMan.space();
        System.out.println(superMan);
    }
}
