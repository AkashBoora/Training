package functions;

import java.util.function.Predicate;

public class PredicateFunction {

//    no need to create any interface.

    Predicate<Employee> bonusLamda = emp -> emp.getRating()>10?true:false;
    Predicate<Employee> execLamda = emp -> emp.getId().startsWith("E99")?true:false;
    public static void main(String[] args) {

    }
}

class Employee{
    private int rating;
    private String id;

    Employee(int rating, String id){
        this.rating = rating;
        this.id = id;
    }


    public int getRating() {
        return rating;
    }

    public String getId() {
        return id;
    }
}
