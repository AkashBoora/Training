package yourname.assignment.singleton;

public class Singleton {
    public String string;

    public static Singleton returnObject(String string){
        Singleton singleton = new Singleton();
        singleton.string=string;
        return singleton;
    }

    public void printString(){
        System.out.println("The String is: "+this.string);
    }
}
