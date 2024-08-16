package com.todo.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Table(name = "todo_list")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoList {

    @Id
    @GeneratedValue
    private int id;
    private String todoName;
    private boolean isComplete;
    private LocalDate createDate;
}
