package com.training.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
    @Override
    public List<String> retrieveTodo(String user) {
        return Arrays.asList("Learn Spring MVC","Learn Spring", "Learn to Dance");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
