package com.todo.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TodoControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private TodoController todoController;

    @Mock
    private TodoService todoService;

    private TodoList todoList;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(todoController).build();

        todoList = new TodoList();
        todoList.setId(100);
        todoList.setTodoName("First Item");
        todoList.setComplete(false);
        todoList.setCreateDate(LocalDate.now());
    }

//    @Test
//    public void createTodo_ShouldReturnCreatedTodo() throws Exception {
//        when(todoService.create(any(TodoList.class))).thenReturn(todoList);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/todo/save")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(todoList)))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(100))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.todoName").value("First Item"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.isComplete").value(false))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.createDate").value(LocalDate.now()));
//    }
}