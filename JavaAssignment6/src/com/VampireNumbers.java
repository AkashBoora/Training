package com;

import java.util.ArrayList;

public class VampireNumbers {
    public boolean checkIfVampire(long number){
        String numberString = Long.toString(number);
        int length = numberString.length();
        if((length&1)==1){
            return false;
        }
        if(!checkAllPermutations(numberString,length)){
            return false;
        }
        return  true;
    }

    private boolean checkAllPermutations(String numberString, int length) {
        ArrayList<String> result = new ArrayList<String>();
        String firstHalf,secondHalf;
        int half = length/2;
        allPermutations(numberString,0,length-1,result);
        for ( String string : result){
            firstHalf = string.substring(0,half);
            secondHalf = string.substring(half);
            if(firstHalf.charAt(half-1)=='0' && secondHalf.charAt(half-1)=='0')
                continue;
            if(Integer.parseInt(firstHalf)*Integer.parseInt(secondHalf)==Integer.parseInt(numberString))
                return true;
        }
        return  false;
    }

    private void allPermutations(String numberString, int low, int high, ArrayList<String> result) {
        if(low==high)
            result.add(numberString);
        else {
            for(int i=low;i<=high;i++){
                numberString = swap(numberString,low,i);
                allPermutations(numberString,low+1,high, result);
                numberString = swap(numberString,low,i);
            }
        }
    }

    private String swap(String numberString, int i, int j) {
        char temp;
        char[] charArray = numberString.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
