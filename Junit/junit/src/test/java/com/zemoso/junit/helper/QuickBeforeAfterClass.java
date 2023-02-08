package com.zemoso.junit.helper;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class QuickBeforeAfterClass {


    static StringHelper stringHelper;

    // before will run first, then it runs

    // it will run before after class methods one time


    @BeforeClass
    public static void setup() {
        System.out.println("Before Class");
        stringHelper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions(){
        System.out.println("In Test1");
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition(){
        System.out.println("Test 2");
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @AfterClass
    public static void shutdown(){
        System.out.println("After Class");
    }

}
