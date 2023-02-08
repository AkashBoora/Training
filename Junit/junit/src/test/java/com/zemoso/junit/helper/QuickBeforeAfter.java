package com.zemoso.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import  static org.junit.Assert.*;

public class QuickBeforeAfter {


    StringHelper stringHelper;

    // before will run first, then it runs

    // it will run before after methods at every test


    @Before
    public void setup() {
        System.out.println("Before Test");
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

    @After
    public void shutdown(){
        System.out.println("Test is done");
    }

}
