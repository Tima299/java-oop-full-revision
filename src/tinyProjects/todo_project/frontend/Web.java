package tinyProjects.todo_project.frontend;



import tinyProjects.todo_project.backend.domains.Todo;
import tinyProjects.todo_project.backend.dtos.TodoUpdateDTO;
import tinyProjects.todo_project.backend.enums.Category;
import tinyProjects.todo_project.backend.enums.Priority;
import tinyProjects.todo_project.backend.services.TodoService;
import tinyProjects.todo_project.backend.services.TodoServiceImpl;

import java.util.Scanner;

public class Web {
    static TodoService todoService = new TodoServiceImpl();
    static Scanner scanner = new Scanner(System.in);  // Unified scanner instance

    public static void main(String[] args) {
        // Main menu loop for testing
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Create Todo");
            System.out.println("2. Show All Todos");
            System.out.println("3. Delete Todo");
            System.out.println("4. Update Todo");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    testCreateTodoMethod();
                    break;
                case 2:
                    testGetAllTodoMethod();
                    break;
                case 3:
                    testDeleteTodoMethod();
                    break;
                case 4:
                    testUpdateTodoMethod();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void testCreateTodoMethod() {
        Todo todo = Todo.builder()
                .title("Read a book")
                .priority(Priority.HIGH)
                .category(Category.STUDY)
                .build();
        todoService.create(todo);
        System.out.println("Created Todo: " + todo);
    }

    static void testGetAllTodoMethod() {
        System.out.println("-------- All Todos --------");
        for (Todo todo : todoService.getAll()) {
            System.out.println(todo);
        }
    }

    static void testDeleteTodoMethod() {
        System.out.print("Enter Todo ID to delete: ");
        String id = scanner.nextLine();
        boolean deleted = todoService.delete(id);
        if (deleted) {
            System.out.println("Todo with ID " + id + " deleted.");
        } else {
            System.out.println("Todo with ID " + id + " not found.");
        }
    }

    static void testUpdateTodoMethod() {
        System.out.print("Enter Todo ID to update: ");
        String id = scanner.nextLine();

        System.out.print("Enter new title: ");
        String title = scanner.nextLine();

        TodoUpdateDTO dto = new TodoUpdateDTO(id, title);
        boolean updated = todoService.update(dto);

        if (updated) {
            System.out.println("Todo with ID " + id + " updated.");
        } else {
            System.out.println("Todo with ID " + id + " not found.");
        }
    }
}
