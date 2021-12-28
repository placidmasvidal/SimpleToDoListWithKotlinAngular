package com.placidmasvidal.todo.controllers

import com.placidmasvidal.todo.entities.Todo
import com.placidmasvidal.todo.entities.TodoRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController(val todoRepository: TodoRepository) {

    @PostMapping
    fun newTodo(@RequestBody todo: Todo): Todo {
        return todoRepository.save(todo)
    }
}