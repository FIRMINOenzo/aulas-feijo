package com.todolist.todo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.todo.entities.Task;
import com.todolist.todo.repositories.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskRepository taskRepository;
    
    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = taskRepository.findAll();

        if(tasks == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(tasks);
    }

}
