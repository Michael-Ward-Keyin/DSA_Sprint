public class Task {
    private String description;
    private boolean isCompleted;
    public Task next;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        this.next = null;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}