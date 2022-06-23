package yourname.assignment.main;

import yourname.assignment.data.Data;
import yourname.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printVariable();

        System.out.println();

        Singleton singleton = Singleton.returnObject("Akash");
        singleton.printString();
    }
}
