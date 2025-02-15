package com.prsnlproject.springboot.myfirstwebapp.Todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("listTodos")
    public String listAllodos(ModelMap model){
        List<Todo> todos =  todoService.findByUsername("amartya");
        model.addAttribute("todos",todos);
        return "listTodos";
    }

}
