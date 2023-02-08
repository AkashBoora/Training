package com.zemoso.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {


    // assertArrayEquals compares two array values
    @Test
    public void testArraySort_RandomArray(){
        int[] numbers = {15,1,26,8};
        int[] expected = {1,8,15,26};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);
    }

    // exception handling
    // if exception thrown then test is passed otherwise it is failed

    // performance testing
    @Test(timeout = 20)
    public void testArraySort_PerformanceTest(){
        int[] array = {12,23,4};
        for(int i=1;i<=1000000;i++){
            array[0]=i;
            Arrays.sort(array);
        }
    }


    @Test(expected = NullPointerException.class)
    public void testNullArray(){
        int[] numbers = null;
        Arrays.sort(numbers);
        int[] expected ={2,3};
        assertEquals(numbers,expected);
    }
}
