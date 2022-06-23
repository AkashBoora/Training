package chapter5;

import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName;

        System.out.println("Enter full name");
        fullName=scanner.nextLine();

        int indexOfSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0,indexOfSpace);
        String lastName = fullName.substring(indexOfSpace+1);
        firstName=firstName.toUpperCase();
        lastName=lastName.toLowerCase();

        System.out.println(firstName+" "+lastName);
    }
}
