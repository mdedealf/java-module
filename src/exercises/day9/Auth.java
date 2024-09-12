package exercises.day9;

interface Auth {
    boolean registerUser(String username, String password);
    User loginUser(String username, String password);
}
