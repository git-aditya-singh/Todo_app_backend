package org.aditya.todo.todolistapp.controller;

import org.aditya.todo.todolistapp.model.Todo;
import org.aditya.todo.todolistapp.model.TodoRepository;
import org.aditya.todo.todolistapp.model.User;
import org.aditya.todo.todolistapp.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todolistappcontroller {
    @Autowired
    TodoRepository todoRepository;
    @Autowired
    UserRepository userRepository;
    @GetMapping("/todos")
    public Iterable<Todo>todos(){
        return todoRepository.findAll(); 
    }
    @GetMapping("/users")
    public Iterable<User>users(){
        return userRepository.findAll();
    }


}
