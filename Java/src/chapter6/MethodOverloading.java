package chapter6;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(5));
        System.out.println(getResult(5,3));
        System.out.println(getResult(3,2,6));
        System.out.println(getResult(5,"10"));
        System.out.println(getResult("Akash","Boora"));
    }

    public  static int getResult(int num){
        return num * 2;
    }

    public  static  int getResult(int num1, int num2){
        return  num1*num2;
    }

    public  static int getResult(int num1, String num2){
        return  num1*Integer.parseInt(num2);
    }

    public  static  int getResult(int num1, int num2, int num3){
        return  num1*num2*num3;
    }

    public  static String getResult(String string1, String string2){
        return string1+" "+string2;
    }
}
