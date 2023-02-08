package com.training.data.api;

import java.util.List;

// create TodoService stub
// Test todoBusinessImpl using ToDoService stub
public interface TodoService {
    public List<String> retrieveTodo(String user);
    public void deleteTodo(String todo);
}
