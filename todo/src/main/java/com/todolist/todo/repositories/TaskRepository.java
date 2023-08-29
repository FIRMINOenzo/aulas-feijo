package com.todolist.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.todo.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
}