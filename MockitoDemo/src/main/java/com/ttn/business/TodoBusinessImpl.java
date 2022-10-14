package com.ttn.business;

import com.ttn.api.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;
    public TodoBusinessImpl(TodoService todoService){
        this.todoService=todoService;
    }
    public List<String> giveSpringTodos(String user){
        List<String>filterTodos=new ArrayList<>();
        List<String> todos=todoService.retrieveTodos(user);
        for(String t:todos){
            if(t.contains("Spring")){
                filterTodos.add(t);
            }
        }
        return filterTodos;
    }
}
