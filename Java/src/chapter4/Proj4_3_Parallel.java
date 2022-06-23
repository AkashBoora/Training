package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> namesList = new ArrayList<String>();
        ArrayList<Integer> agesList = new ArrayList<Integer>();

        for(int i=0;i<5;i++){
            namesList.add(scanner.nextLine());
            agesList.add(scanner.nextInt());
            scanner.nextLine();
        }

        for(int i=0;i<namesList.size();i++){
            System.out.println(namesList.get(i)+"'s age is "+agesList.get(i));
        }
    }
}
