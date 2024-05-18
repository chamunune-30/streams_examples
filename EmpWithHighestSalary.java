
import java.util.*;
import java.util.stream.Collectors;


public class EmpWithHighestSalary {



    public static void main(String[] args) {


        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

            List<Employee> empList = Arrays.asList(arrayOfEmps);
            Optional<Employee> highest_sal = empList.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .findFirst();


            highest_sal.ifPresentOrElse(
                    employee -> System.out.println("Higest salary of employee:" + employee),
                    () -> System.out.println("NO employee found")
            );

//        List<Employee> employees = empList.stream()
//                .sorted()
//                .findFirst()
//                .orElse(null);
        }

}
