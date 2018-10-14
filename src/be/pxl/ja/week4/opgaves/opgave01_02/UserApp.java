package be.pxl.ja.week4.opgaves.opgave01_02;

public class UserApp {
    public static void main (String[] args) {

        // Opgave 2
        DisplayOnly displayOnly = user -> System.out.println(user);
//        DisplayOnly displayOnly = System.out::println;

        User user = new User();
        user.setName("Tom");
        user.setRole("developer");

        displayOnly.print(user);
    }
}
