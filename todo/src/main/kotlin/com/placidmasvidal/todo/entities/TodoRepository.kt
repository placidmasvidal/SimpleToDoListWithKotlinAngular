package com.placidmasvidal.todo.entities;

import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long> {
}