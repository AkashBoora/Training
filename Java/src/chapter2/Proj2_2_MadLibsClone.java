package chapter2;

import java.util.Scanner;
public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adjective1,adjective2,adjective3;
        String occupation1,occupation2;
        String girlName;
        String boyName;
        String manName;
        String dressing;
        String hobby;
        String city;

        System.out.print("Enter an adjective: ");
        adjective1 = sc.nextLine();

        System.out.print("Enter a girl's name: ");
        girlName = sc.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = sc.nextLine();

        System.out.print("Enter an occupation: ");
        occupation1 = sc.nextLine();

        System.out.print("Enter the name of a place: ");
        city = sc.nextLine();

        System.out.print("Enter the name of piece of clothing: ");
        dressing = sc.nextLine();

        System.out.print("Enter the name of hobby: ");
        hobby = sc.nextLine();

        System.out.print("Enter another adjective: ");
        adjective3 = sc.nextLine();

        System.out.print("Enter an occupation: ");
        occupation2 = sc.nextLine();

        System.out.print("Enter a boy's name: ");
        boyName = sc.nextLine();

        System.out.print("Enter a man's name: ");
        manName = sc.nextLine();

        System.out.println();

        System.out.println("There once was a "+adjective1+" girl named "+girlName+" who was a"+adjective2+" "+occupation1+" in the kingdom of "+city+".");
        System.out.println("She loved to wewr "+dressing+" and to "+hobby+". She wanted to marry"+adjective3+" "+occupation2+" named "
                +boyName+" but her father, King" +manName+" forbid her from seeing him.");

    }
}
