/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.todo;

import com.example.todo.TodoService;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TodoController{
   
   TodoService todoService=new TodoService();

   @GetMapping("/todos")
    public ArrayList<Todo>getTodos(){
        return todoService.getTodos();
    }
    
    @GetMapping("/todos/{todoId}")
    public Todo getTodoById(@PathVariable ("todoId") int id){
        return todoService.getTodoById(id);
    }

    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @PutMapping("/todos/{todoId}")
    public Todo updatTodo(@PathVariable ("todoId") int id,@RequestBody Todo todo) {
        return todoService.updateTodo(id, todo);
    }
    @DeleteMapping("/todos/{todoId}")
    public void deleteTodo(@PathVariable ("todoId") int id){
        todoService.deleteTodo(id);
    }    
}