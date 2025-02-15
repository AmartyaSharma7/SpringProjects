package com.prsnlproject.springboot.myfirstwebapp.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static{
        todos.add(new Todo(1,"amartya","learn spring",LocalDate.now().plusYears(1),false));
        todos.add(new Todo(2,"john","learn springboot",LocalDate.now().plusYears(2),false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
}
