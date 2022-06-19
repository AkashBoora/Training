package chapter4;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray; //declaration
        myArray = new int[5]; //initialization

        //array is reference data type
        //array size is fixed


        myArray[0]=10;
        myArray[1]=52;
        myArray[2]=61;
        myArray[3]=14;
        myArray[4]=12;

//        for(int i=0;i<myArray.length;i++){
//            System.out.println(myArray[i]);
//        }

        //for-each loop, iterated through each and every element in object
        for(int i : myArray){
            System.out.println(i);
        }
    }
}
