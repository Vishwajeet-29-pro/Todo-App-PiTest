package com.todo.app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoAppRepository todoAppRepository;

    public TodoList create(TodoList todoList) {
        return todoAppRepository.save(todoList);
    }

    public TodoList getTodoById(int id) {
        return todoAppRepository.getReferenceById(id);
    }

    public List<TodoList> findAllTodos() {
        return todoAppRepository.findAll();
    }
}
