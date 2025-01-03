import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager t = new TaskManager(); // TaskManager object
        Scanner sc = new Scanner(System.in);

        System.out.println("**** To-Do-List *****");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("00. Exit");

        int choice = -1;
        while (choice != 00) {
            System.out.print("Enter Choice: ");
            choice = sc.nextInt(); // Get user's choice

            switch (choice) {
                case 1:
                    // Prompt user for task details
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();
                    t.addTask(title, description); // Call addTask with parameters
                    break;

                case 2:
                    t.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter Task ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // Consume the newline
                    System.out.print("Enter New Title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter New Description: ");
                    String newDescription = sc.nextLine();
                    System.out.print("Enter New Status (Pending/Completed): ");
                    String newStatus = sc.nextLine();
                    t.updateTask(updateId, newTitle, newDescription, newStatus);
                    break;

                case 4:
                    System.out.print("Enter Task ID to Delete: ");
                    int deleteId = sc.nextInt();
                    t.deleteTask(deleteId);
                    break;

                case 00:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }
}
