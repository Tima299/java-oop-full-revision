package tinyProjects.todo_project.backend.services;

import tinyProjects.todo_project.backend.domains.Todo;
import tinyProjects.todo_project.backend.dtos.TodoUpdateDTO;
import tinyProjects.todo_project.backend.utils.TodoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        Optional<Todo> todo = todos.stream()
                .filter(t -> t.getId().equals(todoId))
                .findFirst();

        if (todo.isPresent()) {
            todos.remove(todo.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean update(TodoUpdateDTO dto) {
        Optional<Todo> todo = todos.stream()
                .filter(t -> t.getId().equals(dto.id()))
                .findFirst();

        if (todo.isPresent()) {
            todo.get().setTitle(dto.title());
            return true;
        }
        return false;
    }

    @Override
    public Todo get(String todoId) {
        return todos.stream()
                .filter(t -> t.getId().equals(todoId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Todo[] getAll() {
        return todos.toArray(new Todo[0]);
    }
}
