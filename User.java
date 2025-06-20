public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public boolean markTaskCompleted(String description) {
        return taskList.markTaskCompleted(description);
    }

    public void viewTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }
}