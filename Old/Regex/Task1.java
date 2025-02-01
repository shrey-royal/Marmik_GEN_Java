import java.util.regex.*;


public class Task1 {
    public static boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    
    
    public static void main(String[] args) {
        String email = "user@example.com";

        if(validateEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
