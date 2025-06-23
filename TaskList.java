
/**
 * Represents a list of tasks
 */
public class TaskList {
    private Task head;
    
    /**
     * Adds a new task to the list
     * @param description
     */
    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    /**
     * Marks a task as completed
     * @param description
     * @return
     */
    public boolean markTaskCompleted(String description) {
        Task current = head;
        while (current != null) {
            if (current.getDescription().equals(description)) {
                current.markCompleted();
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Prints all tasks in the list
     */
    public void printTasks() {
        Task current = head;
        if (current == null) {
            System.out.println("No tasks");
            return;
        }

        while (current != null) {
            String status = current.isCompleted() ? "Complete" : "pending";
            System.out.println("- " + current.getDescription() + " [" + status + "]");
            current = current.next;
        }
    }
}