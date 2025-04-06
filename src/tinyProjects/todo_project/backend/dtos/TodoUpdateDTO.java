package tinyProjects.todo_project.backend.dtos;

public record TodoUpdateDTO(String id, String title) {
    public TodoUpdateDTO {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID cannot be null or blank");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
    }
}

