package tinyProjects.todo_project.backend.utils;

import java.util.UUID;

public class TodoUtil {
    public static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}
