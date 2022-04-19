package org.aditya.todo.todolistapp.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    
}
