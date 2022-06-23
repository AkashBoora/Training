package chapter6;

public class MethodDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(24);
        int result =giveMe10();
        System.out.println(result);

        int sum =sum(45,34);
        System.out.println(sum);

        double sqaure = sqaureOf(5.5);
        System.out.println(sqaure);
    }

    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printNumber(int number){
        System.out.println("The number is "+number);
    }

    public static  int giveMe10(){
        return 10;
    }

    public static int sum(int x, int y){
        return x+y;
    }

    public static double sqaureOf(double i){
        return i*i;
    }
}
