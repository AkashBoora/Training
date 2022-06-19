package chapter3;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.println("Enter non-negative to add to sum");
        System.out.println("Enter negative to exit");
        input = scanner.nextInt();
        while (input>0){
            sum+=input;
            System.out.println("Enter non-negative to add to sum");
            System.out.println("Enter negative to exit");
            input = scanner.nextInt();
        }
        System.out.println("The sum is: "+sum);
    }
}
