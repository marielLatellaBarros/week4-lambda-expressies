package be.pxl.ja.week4.opgaves.opgave01_02;

//Opgave 1
public class User {
    private String name;
    private String role;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return name + " [" + role + "]";
    }
}
