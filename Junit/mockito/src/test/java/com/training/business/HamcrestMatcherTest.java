package com.training.business;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatcherTest {


    @Test
    public void testHamcrestAssertThat(){
        List<Integer> scores = Arrays.asList(99,100,101,105);
        assertThat(scores,hasSize(4));
        assertThat(scores, hasItems(99,100));
        assertThat(scores,everyItem(greaterThan(90)));
        assertThat(scores,everyItem(lessThan(190)));
        assertThat("",isEmptyString());
        assertThat(null,isEmptyOrNullString());

        Integer[] marks = {1,2,3};

        assertThat(marks,arrayWithSize(3));
        assertThat(marks,arrayContainingInAnyOrder(3,1,2));
    }
}
