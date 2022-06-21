package com;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = StudentUtil.createStudent();
        printAllDepartments(students);
        System.out.println();
        printStudentsEnrolledAfter2018(students);
        System.out.println();
        printMaleComputerSciStudents(students);
        System.out.println();
        countOfMaleAndFemaleStudents(students);
        System.out.println();
        avgAgeOfMaleandFemaleStudent(students);
        System.out.println();
        getMaxPerTillNow(students);
        System.out.println();
        noOfStudentsInEachDepartment(students);
        System.out.println();
        avgPercentageInEachDeaprtment(students);
        System.out.println();
        youngStudentInElectronics(students);
        System.out.println();
        noOfMaleAndFemaleStudentInComputerScience(students);

    }

    private static void printAllDepartments(List<Student> students) {
        System.out.println("All Departments: ");
        students.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);
    }
    private static void printStudentsEnrolledAfter2018(List<Student> students) {
        System.out.println("Student names Enrolled After 2018:");
        students.stream().filter(student -> student.getYearOfEnrollment()>2018).map(Student::getName).forEach(System.out::println);
    }
    private static void printMaleComputerSciStudents(List<Student> students) {
        System.out.println("Male Computer Science Student");
        students.stream()
                .filter(student -> student.getEngDepartment().toLowerCase().contains("computer sci"))
                .filter(student -> student.getGender().equals("Male"))
                .forEach(System.out::println);
    }
    private static void countOfMaleAndFemaleStudents(List<Student> students) {
        System.out.println("Count of Male and Female Students:");
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }
    private static void avgAgeOfMaleandFemaleStudent(List<Student> students) {
        System.out.println("Average age of males and females:");
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge))));
    }

    private static void getMaxPerTillNow(List<Student> students) {
        System.out.println("Student name who has max perTillNow:");
        System.out.println(students.stream().max(Comparator.comparing(Student::getPerTillDate)));
    }

    private static void noOfStudentsInEachDepartment(List<Student> students) {
        System.out.println("No of students in each Department");
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())));
    }

    private static void avgPercentageInEachDeaprtment(List<Student> students) {
        System.out.println("Average Percentage of Each Batch");
        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))));
    }

    private static void youngStudentInElectronics(List<Student> students) {
        System.out.println("Young Student in Electronics Department:");
        System.out.println(students.stream().filter(student -> student.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparing(Student::getAge))));
    }

    private static void noOfMaleAndFemaleStudentInComputerScience(List<Student> students) {
        System.out.println("Number of Male and Female Students in Computer Science: ");
        System.out.println(students.stream().filter(student -> student.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }


}
