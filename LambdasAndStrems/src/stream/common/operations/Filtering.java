package stream.common.operations;

import additional.functions.Employee;

import java.util.List;
import java.util.stream.Stream;

public class Filtering {
    List<Employee> employees = EmployeeUtil.createEmployees();

    public static void main(String[] args) {
        new Filtering().testFiltering();
    }

    private void testFiltering() {
        Stream<Employee> employeeStream = employees.stream().filter(Employee::isExecutive);
        employeeStream.forEach(System.out::println);
        //filter accepts predicate
    }
}
