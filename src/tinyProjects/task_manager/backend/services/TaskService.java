package tinyProjects.task_manager.backend.services;

import backend.domains.Task;
import backend.dtos.TaskUpdateDTO;

public interface TaskService{
    Task create (Task task);
    boolean delete(String taskId);
    boolean update (TaskUpdateDTO dto);
    Task get(String taskId);
    Task[] getAll();
}
