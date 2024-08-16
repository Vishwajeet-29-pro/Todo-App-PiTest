package com.todo.app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoAppRepository todoAppRepository;

    public TodoList create(TodoList todoList) {
        return todoAppRepository.save(todoList);
    }
}
