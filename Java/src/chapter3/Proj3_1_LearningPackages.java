package chapter3;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packageNumber;
        int numberOfCourses;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost=0;

        System.out.println("Select Package! 1, 2 or 3?: ");
        packageNumber = scanner.nextInt();

        System.out.println("how many courses did you enroll in this month? ");
        numberOfCourses =  scanner.nextInt();

        if(packageNumber == 1){
            baseCost = 10;
            costPerCourse = 6;
            numIncluded =2;
        }else if(packageNumber == 2){
            baseCost = 12;
            costPerCourse = 4;
            numIncluded = 4;
        }else{
            baseCost = 15;
            costPerCourse = 3;
            numIncluded = 6;
        }
        totalCost += baseCost;
        if(numberOfCourses > numIncluded){
            totalCost += (numberOfCourses- numIncluded) * costPerCourse;
        }
        System.out.println(totalCost);
    }
}
