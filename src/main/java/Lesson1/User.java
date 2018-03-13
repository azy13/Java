package Lesson1;

public class User {

    private String name;
    public String lastName;

    private User(){}

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    private String concatStrings() {
        return name + " " + lastName;
    }

    public String getName() {
        return name;
    }
}
