package exercises.day8;

public class Customer {
    String name;
    int age;
    String email;
    String customerId;

    public Customer(String name, int age, String email, String customerId) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
