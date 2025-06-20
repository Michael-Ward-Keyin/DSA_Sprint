public class TaskList {
    private Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = burrent.next;
            }
            current.next = newTask;
        }
    }

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