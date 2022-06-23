package chapter2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String city;
        double number;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age =  scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a number: ");
        number = scanner.nextDouble();
        number*=2;
        scanner.nextLine();

        System.out.println("Enter your City");
        city = scanner.nextLine();

        System.out.println("Hello, "+name+"\nage is "+age+"\nCity is "+city);
        System.out.println("Multiplies Number: "+number);

//        System.out.println(scanner.nextLine()); //for line
//        System.out.println(scanner.nextBoolean()); // to read boolean
//        System.out.println(scanner.nextDouble()); //to read double
//        System.out.println(scanner.nextFloat()); //to read float
//        System.out.println(scanner.nextInt()); //to read integer
    }
}
