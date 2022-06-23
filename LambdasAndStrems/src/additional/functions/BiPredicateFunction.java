package additional.functions;

import java.util.function.BiPredicate;

public class BiPredicateFunction {

    BiPredicate <Employee, Manager> employeeManagerBiPredicate = (employee, manager) -> employee.getManager().equals(manager);
    private  void testBIPredicate(Employee emp, Manager manager){

    }

}
