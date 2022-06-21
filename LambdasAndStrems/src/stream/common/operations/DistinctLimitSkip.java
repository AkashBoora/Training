package stream.common.operations;

import additional.functions.Employee;

import java.util.List;
import java.util.stream.Stream;

public class DistinctLimitSkip {
    List<Employee> employees = EmployeeUtil.createEmployees();

    public static void main(String[] args) {
        new DistinctLimitSkip().testDistinct();
        new DistinctLimitSkip().testLimit();
        new DistinctLimitSkip().testSkip();
;
    }

    private void testSkip() {
        Stream<String> employeeNamesStream = employees.stream().map(Employee::getName).skip(2);
        employeeNamesStream.forEach(System.out::println);
        //to skip no of records
    }

    private void testLimit() {
        Stream<String> employeeNamesStream = employees.stream().map(Employee::getName).limit(1);
        employeeNamesStream.forEach(System.out::println);
        //for limiting no of entries
    }

    private void testDistinct() {
        Stream<String> employeeNamesStream = employees.stream().map(Employee::getName).distinct();
        employeeNamesStream.forEach(System.out::println);
        //for distinct entries
    }
}
