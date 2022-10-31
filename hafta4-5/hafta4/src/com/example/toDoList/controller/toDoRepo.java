package com.example.toDoList.controller;
import com.example.toDoList.model.toDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoRepo extends JpaRepository<toDoItem, Integer>{

    List<toDoItem> findAll();
}


