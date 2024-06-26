class Employee {
    String name;
    int age;
    String gender;
    static int total_employees=0;
    static int total_ages=0;

    Employee (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        total_employees ++;
        total_ages += age;
    }

    public static int getTotalEmployees() {
        return total_employees;
    }

    public static double getAvgAge() {
        return total_ages/(double)total_employees;
    }

    public String toString() {
        return "이름 : " +
                name +
                ", 나이 : " +
                age +
                ", 성별 : " +
                gender;
    }
}


public class Q3 {
    public static void main(String[] args) {
        Employee work1 = new Employee("홍길동", 25, "여");
        Employee work2 = new Employee("김길동", 24, "남");
        Employee work3 = new Employee("송길동", 26, "여");

        System.out.println("우리 회사의 직원 수 : "+ Employee.total_employees);
        System.out.println(work1.toString());
        System.out.println(work2.toString());
        System.out.println(work3.toString());
        System.out.println("우리 회사의 직원의 평균 나이 : " +Employee.getAvgAge());
    }
}
