package exercises.day10;

import java.util.UUID;

public class User {
    String name;
    String password;
    String id;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
