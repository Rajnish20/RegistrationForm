import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {
    boolean validateFirstName(String firstName) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    boolean validateLastName(String lastName) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    boolean validateMobileNo(String mobileNo) {
        String regex = "\\d{2} \\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }


    public static void main(String[] args) {
        System.out.println("User Registration");
        System.out.println("Enter Details");
        Scanner scanner = new Scanner(System.in);

        RegistrationForm registrationForm = new RegistrationForm();
        
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        System.out.println(registrationForm.validateFirstName(firstName));

        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        System.out.println(registrationForm.validateLastName(lastName));

        System.out.println("Enter Mobile No :");
        String mobileNo = scanner.nextLine();
        System.out.println(registrationForm.validateMobileNo(mobileNo));


    }
}
