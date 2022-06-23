package interfaces;

interface Employee {
    // Adding concrete methods to interface.
    // we can have default and static methods in an interface
    // the concrete methods that are belongs to instance of implementation class are called default methods.
    // the concrete methods that are associated to the class are static methods.
    Employee find(int id);

    default boolean isExec(int id){
        return  true;
    }

    static String getDefaultCountry(){
        return "UK";
    }
}

public class  DefaultStaticMethods{
    public static void main(String[] args) {

        class  EmployeeImpl implements Employee{

            @Override
            public Employee find(int id) {
                boolean executive = isExec(id);
                return  null;
            }
        }

        EmployeeImpl impl = new EmployeeImpl();
        impl.isExec(1234);

    }
}