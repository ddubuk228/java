/*
    class 직원 {
        public String name;
        String address;
        protected int salary;
        private int rrn;

        @Override
        public String toString() {
            return "Employee [name=" + name + ", address=" + address +
                    ", rrn=" + rrn + "]";
        }
    }

    class 매니저 extends 직원 {
        private int bonus;

        @Override
        public String toString() {
            return " Manager [bonus=" +
                    bonus + "]";
        }

        public void test() {
            System.out.println("This is a test method in the Manager class.");
        }
    }

    직원 클래스는 부모 클래스고
    매니저 클래스는 자식 클래스로 직원 클래스를 상속 받는다

    직원 클래스의 rrn은 private로 선언 되어 있어서 매니저 클래스에서 호출이 불가능하다
 */

class Employee {
    public String name = "Jhon";
    protected int salary = 50000;
    String address = "어린이대공원";
    private int rrn = 123456789;

    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address +
                ", rrn=" + rrn + "]";
    }
}

class Manager extends Employee {
    private int bonus = 3000;

    @Override
    public String toString() {
        return " Manager [bonus=" +
                bonus + "]";
    }

    public void test() {
        System.out.println("This is a test method in the Manager class.");
    }
}


class Q1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        System.out.print(e + ", ");
        System.out.println(m);
        m.test();
    }
}