package tinyProjects.task_manager.backend.dtos;

public record TaskUpdateDTO(String id, String title) {
    public TaskUpdateDTO{
        if(id == null || id.isBlank()){
            throw new IllegalArgumentException("ID cannot be null or blank");
        }
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
    }
}
