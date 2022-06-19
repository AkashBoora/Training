package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<Double>();

        double read = scanner.nextDouble();

        while (read > 0){
            arrayList.add(read);
            read = scanner.nextDouble();
        }

        for(int i= arrayList.size()-1; i>=0 ;i--){
            System.out.println(arrayList.get(i));
        }
    }
}
