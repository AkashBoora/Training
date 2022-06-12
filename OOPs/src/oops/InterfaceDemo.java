package oops;

public interface InterfaceDemo {
    static final String string = "Static Constant";

    public void m1();

    public int m2();

    static void m3(){} //provide implementation, we can access them with interface name it can be private.
    default int m4(){ // default implemenatation
        return 0;
    }

    private void m5(){} //it is only used by this interface, but not by classes which implements this interface
}

class Test implements  InterfaceDemo{

    @Override
    public void m1() {

    }

    @Override
    public int m2() {
        return  0;
    }
}
