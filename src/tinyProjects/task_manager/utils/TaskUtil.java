package tinyProjects.task_manager.utils;

import java.util.UUID;

public class TaskUtil {
    public static  String  generateUniqueId(){
        return UUID.randomUUID().toString();
    }
}
