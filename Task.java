/**
 * Represents a task in the to do list
 */

public class Task {
    private String description;
    private boolean isCompleted;
    public Task next;

    /**
     * Constructs a task
     * @param description
     */
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        this.next = null;
    }

    /**
     * Marks tasks as complete
     */
    public void markCompleted() {
        this.isCompleted = true;
    }

    /**
     * Gets the tasks description
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Checks if the task is complete
     * @return
     */
    public boolean isCompleted() {
        return isCompleted;
    }
}