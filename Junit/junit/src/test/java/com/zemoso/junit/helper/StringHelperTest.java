package com.zemoso.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;


public class StringHelperTest {
    StringHelper stringHelper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions(){
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition(){
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NoA(){
        assertEquals("CDEF", stringHelper.truncateAInFirst2Positions("CDEF"));
    }
    @Test
    public void testTruncateAInFirst2Positions_AInLast2Positions(){
        assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"));
    }


    // ABCD => false, ABAB => true, AB=> true, A => false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeTest(){
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveTest(){
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }




}
