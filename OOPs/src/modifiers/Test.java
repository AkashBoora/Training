package modifiers;

public final class Test {
    public static void main(String[] args) {
        DeptOne one = new DeptOne();
        System.out.println(one.getEmployee());
        one.attendance();
        final int a=0; //value can not be changed.
    }
}
//public  class UnitTent extends Test{ a final class can not be inherited
//
//}
