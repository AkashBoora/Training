package advanced.streams;

import additional.functions.Employee;
import stream.common.operations.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    List<Employee> employeeList = EmployeeUtil.createEmployees();

    public static void main(String[] args) {
        new GroupingBy().groupingByDeapartment();
    }


    private void groupingByDeapartment() {
        Map<String,List<Employee>> groupByDepartment =employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
