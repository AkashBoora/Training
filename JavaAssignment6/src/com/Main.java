package com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VampireNumbers vampireNumbers = new VampireNumbers();
        for (long i=1,n=1; n<100 ; i++) {
            if (vampireNumbers.checkIfVampire(i) && n <= 100) {
                System.out.println(n+" "+i);
                n++;
            }
        }

        ConstructorOverloading constructorOverloading = new ConstructorOverloading("Hello");

        System.out.println();

        ConstructorString[] array = new ConstructorString[3];
        for(int i=0;i<10;i++){
            array[i] = new ConstructorString("Object Reference "+i);
        }
        System.out.println(array.getClass().getSimpleName());

        ConstructorString[] array1 = new ConstructorString[3];
        for(int i=0;i<10;i++){
            ConstructorString temp = new ConstructorString("Hello"+1);
            array1[i] = temp;
        }
        System.out.println(array1.getClass().getSimpleName());

    }
}
