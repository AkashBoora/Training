package com.training.business;

import com.training.data.api.TodoService;
import com.training.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodoRelatedToSpring_usingStub(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos= todoBusiness.retrieveTodoRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }
}
