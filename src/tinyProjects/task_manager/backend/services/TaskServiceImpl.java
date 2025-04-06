package tinyProjects.task_manager.backend.services;

import backend.domains.Task;
import backend.dtos.TaskUpdateDTO;
import utils.TaskUtil;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceImpl implements TaskService{
    private List<Task> tasks = new ArrayList<>();
    @Override
    public Task create(Task task){
        task.setId(TaskUtil.generateUniqueId());
        tasks.add(task);
        return task;
    }
    @Override
    public boolean delete(String taskId){
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if(task.getId().equals(taskId)){
                tasks.remove(i);
                return true;
            }
        }
            return false;
    }
    @Override
    public boolean update(TaskUpdateDTO dto){
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if(task.getId().equals(dto.id())){
                task.setTitle(dto.title());
                return true;
            }
        }
        return false;
    }
    @Override
    public Task get(String taskId){
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if(task.getId().equals(taskId)){
                return task;
            }
        }
        return null;
    }
    @Override
    public Task[] getAll(){
        Task[] taskArray = new Task[tasks.size()];
        for (int i = 0; i < tasks.size(); i++) {
            taskArray[i] = tasks.get(i);
        }
        return taskArray;
    }
}
