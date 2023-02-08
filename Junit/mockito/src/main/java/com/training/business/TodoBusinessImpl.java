package com.training.business;

import com.training.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

// TodoBusinessImpl is SUT -> SystemUnderTest
// TodoService -> dependency

// we don't have TodoService, then how can we test?

public class TodoBusinessImpl{
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }
    public List<String> retrieveTodoRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos =todoService.retrieveTodo(user);

        for(String todo:todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }

    public void deleteTodoNotRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos =todoService.retrieveTodo(user);

        for(String todo:todos){
            if(!todo.contains("Spring")){
                todoService.deleteTodo(todo);
            }
        }
    }
}
