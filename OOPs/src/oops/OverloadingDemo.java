package oops;

class Addition{
    public void sum(int x, int y){
        System.out.println("The sum is "+(x+y));
    }
    public void sum(int x, int y, int z){
        System.out.println("The sum is "+(x+y+z));
    }
    public void sum(double x, double y){
        System.out.println("The sum is "+(x+y));
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.sum(10,15);
        add.sum(10,5,20);
        add.sum(10.15f,15.27);
   }
}
