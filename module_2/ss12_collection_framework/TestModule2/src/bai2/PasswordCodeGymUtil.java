package bai2;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCodeGymUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
       String input = scanner.nextLine() ;
        System.out.println(isValidPassword(input));
    }
    public static boolean isValidPassword(String input){

        final String REGEX = "^[a-z0-9]@*[A-Z][0-9]@+[a-z0-9]@+$";
        Pattern pattern ;
        Matcher matcher ;
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(input);
        return matcher.matches();

    }
}
