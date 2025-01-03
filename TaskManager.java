import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description){
        int id = generateID();
        Task newTask = new Task(id, title, description, "Pending");
        tasks.add(newTask);
        System.out.println("Task Added Successfully.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void updateTask(int id, String newTitle, String newDescription, String newStatus) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                task.setStatus(newStatus);
                System.out.println("Task updated successfully!");
                return;
            }
        }
        System.out.println("Task with ID " + id + " not found.");
    }

    public void deleteTask(int id){
        for(Task task: tasks){
            if(task.getId() == id){
                tasks.remove(task);
                System.out.println("Task with id :"+ id + " removed successfully!");
                return;
            }
        }
        System.out.println("Task with id :"+ id + " not found.");
    }


    private int idCounter = 1;
        private int generateID() {
            return idCounter++;
        }

}
