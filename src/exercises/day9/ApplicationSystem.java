package exercises.day9;

import java.util.List;
import java.util.Scanner;

public class ApplicationSystem implements TodoManager{
    private static User loggedInUser = null;
    private static final UserDatabase userDatabase = new UserDatabase();
    private static Scanner scanner;

    public ApplicationSystem(Scanner scanner) {
        ApplicationSystem.scanner = scanner;
    }

    public void runMainMenu() {
        boolean isRunning = true;

        while (isRunning) {
            try {
                if (loggedInUser == null)
                    showLoginMenu();
                else
                    showTodoMenu();
            } catch (Exception e) {
                isRunning = false;
                System.out.println("Something went wrong");
            }

        }
    }

    public static void showLoginMenu() {
        System.out.println("======== Welcome to the app =========");
        System.out.println("1. Register an account" +
                "\n2. Login" +
                "\n3. Exit");
        System.out.print("Enter an option action : ");
        int loginOption = scanner.nextInt();
        scanner.nextLine();

        switch (loginOption) {
            case 1:
                registerAccount();
                break;
            case 2:
                loginAccount();
                break;
            case 3:
                System.out.println("Exit the program, see yaa later!");
                System.exit(0);
            default:
                System.out.println("You entered invalid option");
        }
    }

    public static void showTodoMenu() {
        System.out.println("======== To-Do List Manager ========");
        System.out.println("1. Add todo" +
                "\n2. View todo" +
                "\n3. Edit todo" +
                "\n4. Delete todo" +
                "\n5. Logout account");
        System.out.print("Enter an option : ");
        int userOption = scanner.nextInt();
        scanner.nextLine();

        ApplicationSystem todoManagement = new ApplicationSystem(scanner);

        switch (userOption) {
            case 1:
                todoManagement.addTodo();
                break;
            case 2:
                todoManagement.viewTodo();
                break;
            case 3:
                todoManagement.editTodo();
                break;
            case 4:
                todoManagement.deleteTodo();
                break;
            case 5:
                logoutAccount();
                break;
            default:
                System.out.println("You entered invalid option\n");
        }
    }

    public static void registerAccount() {
        List<String> registerData = Utility.loginRegisterInput(scanner);
        userDatabase.registerUser(registerData.get(0), registerData.get(1));
    }

    public static void loginAccount() {
        List<String> loginData = Utility.loginRegisterInput(scanner);
        loggedInUser = userDatabase.loginUser(loginData.get(0), loginData.get(1));
    }

    @Override
    public void addTodo() {
        System.out.print("Enter Todo description : ");
        String todoDescription = scanner.nextLine();
        loggedInUser.addTodo(todoDescription);
    }

    @Override
    public void viewTodo() {
        loggedInUser.viewTodo();
    }

    @Override
    public void deleteTodo() {
        System.out.print("Enter todo number that you want to delete : ");
        int todoNumber = scanner.nextInt();
        loggedInUser.deleteTodo(todoNumber);
    }

    @Override
    public void editTodo() {
        System.out.print("Choose Todo number that you want to edit : ");
        int todoNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new Todo description : ");
        String newTodoDescription = scanner.nextLine();
        loggedInUser.editTodo(todoNumber, newTodoDescription);
    }

    private static void logoutAccount() {
        loggedInUser = null;
        System.out.println("Successfully logged out!\n");
    }
}
