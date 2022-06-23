package additional.functions;

import java.util.stream.Stream;

public class Employee {
    String manager;
    String name;
    String department;
    public String getManager() {
        return manager;
    }

    public boolean isExecutive() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isSenior() {
        return true;
    }
}
