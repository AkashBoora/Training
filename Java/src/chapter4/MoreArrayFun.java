package chapter4;

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i=0;i<10;i++){
            array[i]=i+1;
        }

        for(int num : array){
            System.out.println(num);
        }
    }
}
