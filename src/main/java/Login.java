
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> username = new ArrayList<>();
        ArrayList<String> password = new ArrayList<>();

        // Add valid usernames and passwords
        username.add("alex");
        password.add("sunshine");
        username.add("emma");
        password.add("haskell");

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        boolean login = false;
        for (int i = 0; i < username.size(); i++) {
            if (inputUsername.equals(username.get(i)) && inputPassword.equals(password.get(i))) {
                login = true;
            }
        }
        if (login) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
