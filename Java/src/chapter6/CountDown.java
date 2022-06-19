package chapter6;

public class CountDown {
    public static void main(String[] args) {
//        countDownFrom(25);
        countUpTo(0,20);
    }

    public static void countDownFrom(int num){
        if(num >=0){
            System.out.println(num);
            countDownFrom(num-1);
        }
    }

    public static  void countUpTo(int num1, int num2){
        if(num1<=num2){
            System.out.println(num1);
            countUpTo(num1+1,num2);
        }
    }
}
