package tinyProjects.todo_project.backend.services;


import tinyProjects.todo_project.backend.domains.Todo;
import tinyProjects.todo_project.backend.dtos.TodoUpdateDTO;

public interface TodoService {
    Todo create(Todo todo);
    boolean delete(String todoId);
    boolean update(TodoUpdateDTO dto);
    Todo get(String todoId);
    Todo[] getAll();
}
