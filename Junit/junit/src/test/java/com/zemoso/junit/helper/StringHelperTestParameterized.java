package com.zemoso.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class StringHelperTestParameterized {
    StringHelper stringHelper = new StringHelper();

    private String input;
    private String expected;

    public StringHelperTestParameterized(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection testConditions(){
        String[][] paramerters= {{"AACD","CD"},{"ACD","CD"},{"CDAA","CDAA"}};
        return Arrays.asList(paramerters);
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions(){
        assertEquals(expected, stringHelper.truncateAInFirst2Positions(input));
    }

}
