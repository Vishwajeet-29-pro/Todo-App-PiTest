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

    public TodoList updateTodoItemById(int id, TodoList todoList) {
        TodoList todoItem = todoAppRepository.getReferenceById(id);
        todoItem.setTodoName(todoList.getTodoName());
        todoItem.setComplete(todoItem.isComplete());
        todoItem.setCreateDate(todoItem.getCreateDate());
        return todoAppRepository.save(todoItem);
    }
}
