package chapter3;

import java.util.Scanner;

public class RepetationFun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter a non-negative number to continue, or zero or negitive number to exit: ");
            input = scanner.nextInt();
        }while (input>0);
        System.out.println("Done");


//        int count = 0;
//
//        while(count < 10){
//            System.out.println(count);
//            count++;
//        }

//        int count2=15;
//        do{
//            System.out.println(count2);
//            count2++;
//        }while(count2 <10);

//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }



    }
}
