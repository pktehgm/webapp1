package com.mg.webapp1.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new java.util.ArrayList<>();
    static {
        todos.add(new Todo(1, "user1", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "user1", "Learn DevOps", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "user1", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
