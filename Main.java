import java.util.Scanner;


/**
 * Main class that runs the app
 */
public class Main {
    /**
     *Entry point for the program 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = new User[10];
        int userCount = 0;

        while (true) {
            System.out.println("\n--- To-Do List Manager ---");
            System.out.println("1. Create User");
            System.out.println("2. Add Task to User");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View User Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (userCount >= users.length) {
                        System.out.println("User limit reached.");
                        break;
                    }
                    System.out.print("Enter new username: ");
                    String name = scanner.nextLine();
                    if (getUser(users, userCount, name) == null) {
                        users[userCount++] = new User(name);
                        System.out.println("user created");
                    } else {
                        System.out.println("User already exists");
                    }
                    break;
                
                case 2:
                    System.out.print("enter username: ");
                    String userName = scanner.nextLine();
                    User user = getUser(users, userCount, userName);
                    if (user != null) {
                        System.out.print("Enter task: ");
                        String desc = scanner.nextLine();
                        user.addTask(desc);
                        System.out.println("Task added");
                    } else {
                        System.out.println("User not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter username: ");
                    String nameToMark = scanner.nextLine();
                    user = getUser(users, userCount, nameToMark);
                    if (user != null) {
                        System.out.print("Enter task: ");
                        String desc = scanner.nextLine();
                        if (user.markTaskCompleted(desc)) {
                            System.out.println("Task marked complete");
                        } else {
                            System.out.println("task not found");
                        }
                    } else {
                        System.out.println("user not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter username: ");
                    String nameToView = scanner.nextLine();
                    user = getUser(users, userCount, nameToView);
                    if (user != null) {
                        user.viewTasks();
                    } else {
                        System.out.println("User nout found");
                    }
                    break;

                case 5:
                    System.out.println("Closing");
                    return;
                
                default:
                    System.out.println("Invaild option");
            }
        }
    }

    private static User getUser(User[] users, int userCount, String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equals(name)) {
                return users[i];
            }
        }
        return null;
    }
}