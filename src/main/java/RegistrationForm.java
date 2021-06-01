
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {

    IValidateFunction validateDetails = (userData, regex) -> {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userData);
        return matcher.matches();
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationForm registrationForm = new RegistrationForm();
        String firstName;
        String lastName;
        String mobileNo;
        String emailId;
        String password;
        String regex;
        do {
            System.out.println("Enter First Name");
            firstName = scanner.nextLine();
            regex = "^[A-Z][a-z]{3,}";
            System.out.println((registrationForm.validateDetails.validate(firstName, regex)));
        } while (!registrationForm.validateDetails.validate(firstName, regex));

        do {
            System.out.println("Enter Last Name");
            lastName = scanner.nextLine();
            regex = "^[A-Z][a-z]{3,}";
            System.out.println((registrationForm.validateDetails.validate(lastName, regex)));
        } while (!registrationForm.validateDetails.validate(lastName, regex));

        do {
            System.out.println("Enter Mobile No");
            mobileNo = scanner.nextLine();
            regex = "\\d{2} \\d{10}";
            System.out.println((registrationForm.validateDetails.validate(mobileNo, regex)));
        } while (!registrationForm.validateDetails.validate(mobileNo, regex));

        do {
            System.out.println("Enter Email Id");
            emailId = scanner.nextLine();
            regex = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            System.out.println((registrationForm.validateDetails.validate(emailId, regex)));
        } while (!registrationForm.validateDetails.validate(emailId, regex));

        do {
            System.out.println("Enter Password");
            password = scanner.nextLine();
            regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*-+=()]).{8,}$";
            System.out.println((registrationForm.validateDetails.validate(password, regex)));
        } while (!registrationForm.validateDetails.validate(password, regex));
    }

}
