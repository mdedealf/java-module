package exercises.day9;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private final List<Todo> todos;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.todos = new ArrayList<Todo>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addTodo(String description) {
        todos.add(new Todo(description));
        System.out.println("Successfully added to-do: " + description+"\n");
    }

    public void viewTodo() {
        if(todos.isEmpty()) System.out.println("To - Do list is empty. add a new one\n");
        else {
            System.out.println("Your To - Do list : ");
            int counterIdx = 0;
            for(Todo todo : todos) {
                System.out.println((counterIdx+1) + ". "+todo.getTodoDescription());
                counterIdx++;
            }
        }
    }

    public void editTodo(int taskIdx, String todoDescription) {
        if(taskIdx > 0 && taskIdx <= todos.size()) {
            Todo editTodo = todos.get(taskIdx - 1);
            editTodo.setTodoDescription(todoDescription);
            System.out.println("Todo successfully updated : " +editTodo.getTodoDescription()+"\n");
        } else System.out.println("Wrong Todo number to edit!\n");
    }

    public void deleteTodo(int taskIdx) {
        if(taskIdx > 0 && taskIdx <= todos.size()) {
            Todo removeTodo = todos.remove(taskIdx - 1);
            System.out.println("Todo successfully removed : " +removeTodo.getTodoDescription()+"\n");
        } else System.out.println("Wrong Todo number to remove!\n");
    }
}
