package chapter4;

import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

        for (int num : array) {
            System.out.println(num*2);
        }
    }
}
