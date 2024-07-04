import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Employee2{
    String name;
    String department;
    int age;


    Employee2(String name, String department, int age){
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() {return name;}
    public String getDepartment() {return department;}
    public int getAge() {return age;}
}


public class Q3 {
    public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(
                new Employee2("Michael", "Manager", 35),
                new Employee2("Sarah", "HR", 32),
                new Employee2("Roger", "Manager", 44),
                new Employee2("Mike", "Manager", 30),
                new Employee2("Maureen", "IT", 37)
        );

        double avgAge = employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("Manager"))
                .mapToInt(employee -> employee.getAge())
                .average()
                .orElse(0.0);

        DecimalFormat df = new DecimalFormat("###.##");
        String age = df.format(avgAge);
        System.out.println(age);
    }
}
