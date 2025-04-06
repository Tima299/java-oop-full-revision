package tinyProjects.task_manager.frontend;

import backend.domains.Task;
import backend.dtos.TaskUpdateDTO;
import backend.enums.Category;
import backend.enums.Priority;
import backend.services.TaskService;
import backend.services.TaskServiceImpl;

import java.util.Scanner;

public class ConsoleApp {
    static TaskService taskService = new TaskServiceImpl();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Create Task");
            System.out.println("2. Show All Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Update Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    testCreateTaskMethod();
                }
                case 2 -> {
                    testGetAllTaskMethod();
                }
                case 3 -> {
                    testDeleteTaskMethod();
                }
                case 4 -> {
                    testUpdateTaskMethod();
                }
                case 5 -> {
                    System.out.println("Exiting...");
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    private static void testCreateTaskMethod() {
        Task task = Task.builder()

                .title("Shopping")
                .priority(Priority.HIGH)
                .category(Category.DEFAULT)
                .build();
        taskService.create(task);
        System.out.println("Created Task: " + task);
    }

    private static void testGetAllTaskMethod() {
        System.out.println("_________All Tasks__________");
        for (Task task : taskService.getAll()) {
            System.out.println(task);
        }
    }

    private static void testDeleteTaskMethod() {
        System.out.println("Enter Task Id to delete: ");
        String id = scanner.nextLine();
        boolean deleted = taskService.delete(id);
        if (deleted) {
            System.out.println("Task with Id " + id + " deleted.");
        } else {
            System.out.println("Task with Id " + id + " not deleted.");
        }
    }

    private static void testUpdateTaskMethod() {
        System.out.print("Enter Task Id to update: ");
        String id = scanner.nextLine();

        System.out.print("Enter new title: ");
        String title = scanner.nextLine();

        TaskUpdateDTO dto = new TaskUpdateDTO(id, title);
        boolean updated = taskService.update(dto);
        if (updated) {
            System.out.println("Task with Id " + id + " updated");
        } else {
            System.out.println("Task with Id " + id + " not updated");
        }
    }
}
