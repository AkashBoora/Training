package modifiers;

public abstract class Department {
    public  abstract  int getEmployee();
    public  abstract void  method();

    public final void attendance(){ // concreate method which is available to all child classes. It can be override too.
        System.out.println("Present");
    }

}

class DeptOne extends  Department{

    @Override
    public int getEmployee() {
        return 100;
    }

    @Override
    public void method() {
        System.out.println("This is implementation method");
    }
}
