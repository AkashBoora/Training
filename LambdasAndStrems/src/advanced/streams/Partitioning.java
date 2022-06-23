package advanced.streams;

import additional.functions.Employee;
import stream.common.operations.EmployeeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class Partitioning {
    List<Employee> employees = EmployeeUtil.createEmployees();

    private void partitionMultiLevel() {
        Map<Boolean, List<Employee>> empPartitioning =employees.stream().collect(partitioningBy(Employee::isExecutive));
        // 2groups, one for exec, one for non exec based on predicate
    }

    private void partitionAndGrouping() {
        Map<Boolean, Map<String, List<Employee>>> empPartitioning =  employees.stream().collect(partitioningBy((Employee::isExecutive), groupingBy(Employee::getDepartment)));
        for(Boolean b : empPartitioning.keySet()){
            System.out.println(b+"-----> "+empPartitioning.get(b));
        }
    }

    private void partitionByExectutives() {
        Map<Boolean, Map<Boolean, List<Employee>>> empPartitioning =  employees.stream().collect(partitioningBy((Employee::isExecutive), partitioningBy(Employee::isSenior)));
    }


    public static void main(String[] args) {
        new Partitioning().partitionByExectutives();
        new Partitioning().partitionAndGrouping();
        new Partitioning().partitionMultiLevel();
    }

}
