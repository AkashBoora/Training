package chapter6;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(120);
        list.add(142);
        list.add(851);
        list.add(425);

        int sum = sumElement(list);
        System.out.println("The sum is "+sum);
    }

    public  static int sumElement(ArrayList<Integer> list){
        int sum=0;

        for(int i=0;i<list.size();i++){
            sum+= list.get(i);
        }
        return sum;
    }
}
