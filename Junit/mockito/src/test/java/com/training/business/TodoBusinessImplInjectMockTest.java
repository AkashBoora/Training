package com.training.business;

import com.training.data.api.TodoService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.*;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnit;

public class TodoBusinessImplInjectMockTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    TodoService todoServiceMock;

    @InjectMocks
    TodoBusinessImpl todoBusiness;

    @Captor
    ArgumentCaptor<String> stringArgumentCaptor;

    @Test
    public void testRetrieveTodoRelatedToSpring_usingMock(){
        List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
        when(todoServiceMock.retrieveTodo("Dummy")).thenReturn(todos);
        List<String> filteredTodos= todoBusiness.retrieveTodoRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodoRelatedToSpring_EmptyList(){
        List<String> filteredTodos= todoBusiness.retrieveTodoRelatedToSpring("Dummy");
        assertEquals(0, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodoRelatedToSpring_usingMockBBD(){

        // given
        List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
        given(todoServiceMock.retrieveTodo("Dummy")).willReturn(todos);

        // when
        List<String> filteredTodos= todoBusiness.retrieveTodoRelatedToSpring("Dummy");

        // then
        assertThat(filteredTodos.size(),is(2));
    }

    @Test
    public void testDeleteTodoNotRelatedToSpring_usingMockBBD(){

        // given

        List<String> todos = Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
        given(todoServiceMock.retrieveTodo("Dummy")).willReturn(todos);

        // when
        todoBusiness.deleteTodoNotRelatedToSpring("Dummy");

        // then     <--------> verify to check whether a method is called or not
        verify(todoServiceMock,times(1)).deleteTodo("Learn to Dance");
        then(todoServiceMock).should().deleteTodo("Learn to Dance");
        verify(todoServiceMock,atLeastOnce()).deleteTodo("Learn to Dance");

        verify(todoServiceMock,never()).deleteTodo("Learn Spring");
        then(todoServiceMock).should(never()).deleteTodo("Learn Spring");
    }

    @Test
    public void testDeleteTodoNotRelatedToSpring_argumentCapture(){

        // given
        List<String> todos = Arrays.asList("Learn to Code","Learn Spring", "Learn to Dance");
        given(todoServiceMock.retrieveTodo("Dummy")).willReturn(todos);

        // when
        todoBusiness.deleteTodoNotRelatedToSpring("Dummy");

        // then     <-------->  verify to check whether a method is called or not
        then(todoServiceMock).should(times(2)).deleteTodo(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getAllValues().size(),is(2));

    }

}
