package com;

import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        //Access Control and More Assignment

        //1
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        System.out.println();

        for(int i=0;i<3;i++){
            rodents[i].getColour();
            rodents[i].getSize();
            rodents[i].getFood();
            System.out.println();
        }


        //2
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for(int i=0;i<3;i++){
            cycles[i].balance();
        }
        System.out.println();
        //if Cycle class doesn't have balance method it is showing compile time error. So adding balance method in Cycle Class. But Tricycle cycle doesn't have balance method


        //3
        InterfacesPractice interfacesPractice = new InterfacesPractice();
        InterfaceAsArguments interfaceAsArguments = new InterfaceAsArguments();
        interfaceAsArguments.passingInterfaceOne(interfacesPractice);
        interfaceAsArguments.passingInterfaceTwo(interfacesPractice);
        interfaceAsArguments.passingInterfaceThree(interfacesPractice);
        interfaceAsArguments.passingCombineInterface(interfacesPractice);
        System.out.println();


        //4
        CycleFactory factory = new CycleFactory();
        Cycle cycle1 = factory.getMyCycle("Unicycle");
        cycle1.balance();
        Cycle cycle2 = factory.getMyCycle("Bicycle");
        cycle2.balance();
        Cycle cycle3 = factory.getMyCycle("Tricycle");
        cycle3.balance();
        System.out.println();


        //5
        SecondOutterClass secondOutterClass = new SecondOutterClass();
        SecondOutterClass.SecondInnerClass secondInnerClass = secondOutterClass.new SecondInnerClass();
    }
}
