package com.todo.app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoAppRepository extends JpaRepository<TodoList, Integer> {
}
