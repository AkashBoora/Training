package oops;

//parent
class A{

}
//child
class B extends  A{

}
//multi level
class C extends B{

}

//mlutiple: more than one parent

interface  AA{
    default void method(){
        System.out.print("Method of AA");
    }
}
interface AAA{
    default void method(){
        System.out.print("Method of AAA");
    }
}
class BB extends A implements AA, AAA{
    // class A is parent of B and BB which is hierarchical

    @Override
    public void method() {
        AAA.super.method(); //we can change which interface default method should e=run by this.
    }
}

public class InheritanceDemo {
}
