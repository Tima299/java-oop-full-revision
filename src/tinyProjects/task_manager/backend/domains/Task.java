package tinyProjects.task_manager.backend.domains;

import backend.enums.Category;
import backend.enums.Priority;

public class Task {
    private String id;
    private String title;
    private Category category = Category.STUDY;
    private Priority priority = Priority.HIGH;
    private boolean completed;
    public Task(){
    }
    public Task(String id, String title, Priority priority, Category category, boolean completed) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.category = category;
        this.completed = completed;
    }
    public boolean isCompleted(){
        return completed;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", priority=" + priority +
                ", category=" + category +
                ", completed=" + completed +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private String id;
        private String title;
        private Category category = Category.STUDY;
        private Priority priority = Priority.HIGH;
        private boolean completed;

        public Builder id( String id){
            this.id = id;
            return this;
        }
        public Builder title( String title){
            this.title = title;
            return this;
        }
        public Builder category(Category category){
            this.category = category;
            return this;
        }
        public Builder priority(Priority priority){
            this.priority = priority;
            return this;
        }
        public Builder completed(boolean completed){
            this.completed = completed;
            return this;
        }
        public Task build(){
            return new Task(
                    this.id,
                    this.title,
                    this.priority,
                    this.category,
                    this.completed
            );
        }
    }
}
