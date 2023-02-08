package com.training.business;

import org.junit.Test;
import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void letsMockListSizeMethod(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2,listMock.size());
    }

    @Test
    public void letsMockListSizeMethod_ReturnMultipleValues(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
    }

    @Test
    public void letsMockListGet(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Zemoso");
        assertEquals("Zemoso",listMock.get(0));
        assertEquals(null,listMock.get(1));
    }

    @Test
    public void letsMockListGet_usingBDD(){

        // given
        List listMock = mock(List.class);
        given(listMock.get(0)).willReturn("Zemoso");

        // when
        String firstElement = (String) listMock.get(0);

        // then
       assertThat(firstElement,is("Zemoso"));
    }

    @Test
    public void letsMockListGet_ArgumentMatcher(){
        List listMock = mock(List.class);
        // Argument Matcher
        when(listMock.get(anyInt())).thenReturn("Zemoso");
        assertEquals("Zemoso",listMock.get(0));
        assertEquals("Zemoso",listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockListGet_throwAnException(){
        List listMock = mock(List.class);
        // Argument Matcher
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
        listMock.get(0);
    }

    @Test(expected = RuntimeException.class)
    public void letsMockListGet_matcherAndHardCodedValue(){
        List listMock = mock(List.class);
        // Argument Matcher
        when(listMock.subList(anyInt(),3)).thenThrow(new RuntimeException("Something"));
        listMock.get(0);
    }
}
