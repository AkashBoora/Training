package chapter3;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        char gender;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your gender: ");
        gender = scanner.next().charAt(0);

        if(age >=19 && gender == 'M'){
            System.out.println("You can join the fraternity");
        }else{
            System.out.println("Sorry, you can not");
        }
    }
}
