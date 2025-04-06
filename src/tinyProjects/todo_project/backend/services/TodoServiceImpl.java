package tinyProjects.todo_project.backend.services;

import tinyProjects.todo_project.backend.domains.Todo;
import tinyProjects.todo_project.backend.dtos.TodoUpdateDTO;
import tinyProjects.todo_project.backend.utils.TodoUtil;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService {
    private List<Todo> todos = new ArrayList<>();

    @Override
    public Todo create(Todo todo) {
        todo.setId(TodoUtil.generateUniqueId());
        todos.add(todo);
        return todo;
    }

    @Override
    public boolean delete(String todoId) {
        // Using a traditional for loop to find the Todo by its ID
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);
            if (todo.getId().equals(todoId)) {
                todos.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(TodoUpdateDTO dto) {
        // Using a traditional for loop to find the Todo by its ID
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);
            if (todo.getId().equals(dto.id())) {
                todo.setTitle(dto.title());
                return true;
            }
        }
        return false;
    }

    @Override
    public Todo get(String todoId) {
        // Using a traditional for loop to find the Todo by its ID
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);
            if (todo.getId().equals(todoId)) {
                return todo;
            }
        }
        return null;
    }

    @Override
    public Todo[] getAll() {
        // Converting the List to an array using a for loop
        Todo[] todoArray = new Todo[todos.size()];
        for (int i = 0; i < todos.size(); i++) {
            todoArray[i] = todos.get(i);
        }
        return todoArray;
    }
}
