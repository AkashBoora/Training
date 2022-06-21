package yourname.assignment.data;

public class Data {
    int anInt;
    char aChar;

    public void printVariable(){
        System.out.println("Integer value is: "+this.anInt);
        System.out.println("Character value is: "+this.aChar);
    }

    public void printLocal(){
        int anotherInt;
        char anotherChar;
/*
        System.out.println("Integer value is: "+anotherInt);
        System.out.println("Character value is: "+anotherChar);
        We can not use uninitialized method or local variables, as java doesn't support uninitialised variables to use them.
        But we can use static and class variables without initialising. These types of variables get a default value;
 */
    }
}
