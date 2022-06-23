package stream.common.operations;

import additional.functions.Employee;

import java.util.List;
import java.util.stream.Stream;

public class Mapping {
    List<Employee> employeeList = EmployeeUtil.createEmployees();

    public static void main(String[] args) {
        new Mapping().testMapping();

    }

    private void testMapping() {
        Stream<String> employeeStream = employeeList.stream().map(Employee::getName);
        //gives entered fields only
    }
}
