
package com.example.toDoList.controller;

import com.example.toDoList.model.toDoItem;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
public class TodoController {
    @Autowired
    private ToDoRepo toDoRepo;

    @GetMapping
    public List<toDoItem> findAll(){
        return toDoRepo.findAll();
    }

    @PostMapping
    public toDoItem save(@NonNull @RequestBody toDoItem todoItem){
        return toDoRepo.save(todoItem);

    }
    @PostMapping("/demo")
    public String Demo(){
        return "demo";
    }

    @PutMapping
    public toDoItem update(@NotNull @RequestBody toDoItem todoItem){
        return toDoRepo.save(todoItem);
    }

}