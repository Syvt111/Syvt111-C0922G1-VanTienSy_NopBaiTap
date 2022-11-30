package thuc_hanh.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private static Matcher matcher ;

    private static final String EMAIL_REGEX = "^\b+\b*@\b+\\.\b+$";
// /b = viết gọn cho [a-zA-Z0-9_]
    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public static boolean validate (String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
