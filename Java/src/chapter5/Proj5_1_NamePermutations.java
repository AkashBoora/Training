package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();
        String fullname;
        String firstName;
        String lastName;
        int indexOfSpace;

        for(int i=0;i<5;i++){
            System.out.print("Please Enter name "+i+": ");
            fullname = scanner.nextLine();
            indexOfSpace=fullname.indexOf(" ");
            firstName=fullname.substring(0,indexOfSpace);
            lastName=fullname.substring(indexOfSpace+1);

            firstNames.add(firstName);
            lastNames.add(lastName);
        }

        for(int i=0;i<firstNames.size();i++){
            for(int j=0;j<lastNames.size();j++){
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
            }
        }

    }
}
