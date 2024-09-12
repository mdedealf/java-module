package exercises.day9;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Task> task;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.task = new ArrayList<Task>();
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
}
