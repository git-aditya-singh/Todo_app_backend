package org.aditya.todo.todolistapp.model;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,Integer> {
    
}
