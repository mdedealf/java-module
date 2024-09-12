package exercises.day9;

import java.util.UUID;

public class Todo {
    private String todoDescription;
    private String todoId;

    public Todo(String todoDescription) {
        this.todoDescription = todoDescription;
        this.todoId = UUID.randomUUID().toString();
    }

    public String getTodoDescription() {
        return todoDescription;
    }

    public void setTodoDescription(String todoDescription) {
        this.todoDescription = todoDescription;
    }

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }
}
