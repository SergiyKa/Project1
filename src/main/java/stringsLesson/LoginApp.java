package stringsLesson;

import java.util.Locale;

public class LoginApp {

    public String expectedUserName = "admin";
    public String expectedPassword = "12345";


    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp();
        boolean success = loginApp.verifyUser("ADMiN", "12345");
        System.out.println("Login success " + success);

    }

    public boolean verifyUser(String username, String password) {
        username = username.toLowerCase();
        password = password.toLowerCase();
        boolean success = false;
        if (username == null || password == null) {
            System.out.println("The username or password is null");
        }
//        if (username.isEmpty() || password.isEmpty()) {
        else if (username.length() == 0 || password.length() == 0) {
            System.out.println("The username or password is empty");
        } else if (username.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blank");
        } else if (!username.equalsIgnoreCase(expectedUserName) || !password.equalsIgnoreCase(expectedPassword)) {
            System.out.println("The username or password is does not match the expected values");
        } else {
            success = true;
        }
        return success;
    }
}
