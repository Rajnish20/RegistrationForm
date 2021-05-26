import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {
    boolean validateFirstName(String firstName) {
        String regex = "[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }


    public static void main(String[] args) {
        System.out.println("User Registration");
        System.out.println("Enter Details");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        RegistrationForm registrationForm = new RegistrationForm();
        System.out.println(registrationForm.validateFirstName(firstName));

    }
}
