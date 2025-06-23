
/**
 * Represents the user
 */
public class User {
    private String name;
    private TaskList taskList;

    /**
     * Constructs a user
     * @param name
     */
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    /**
     * Gets the name of the user
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a task to the users list
     * @param description
     */
    public void addTask(String description) {
        taskList.addTask(description);
    }

    /**
     * Marks a task as completed in the users list
     * @param description
     * @return
     */
    public boolean markTaskCompleted(String description) {
        return taskList.markTaskCompleted(description);
    }

    /**
     * Prints tasks in a users list
     */
    public void viewTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }
}