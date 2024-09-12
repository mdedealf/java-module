package exercises.day9;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase implements Auth {
    private final Map<String, User> users;

    public UserDatabase() {
        users = new HashMap<>();
    }

    @Override
    public boolean registerUser(String username, String password) {
        // check if entered username is exist in database
        if(users.containsKey(username)) {
            System.out.println("Username already exists.\n");
            return false;
        }
        users.put(username, new User(username, password));
        System.out.println("Successfully registered a new account.\n");
        return true;
    }

    @Override
    public User loginUser(String username, String password) {
        if(!users.containsKey(username)) {
            System.out.println("Username doesn't exist.\n");
            return null;
        }

        // check entered data existing
        User user = users.get(username);
        boolean checkUsername = user.getUsername().equals(username);
        boolean checkPassword = user.getPassword().equals(password);
        boolean isAccountVerified = checkUsername && checkPassword;

        if(isAccountVerified){
            System.out.println("Successfully logged in.\n");
            return user;
        } else {
            System.out.println("Please enter valid username and password.\n");
            return null;
        }
    }
}
