package bai_tap.ValidateClassName;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private static Matcher matcher;

    public static final String CLASS_NAME = "^[C|A|P]+[0-9]{4}+[G|H|I|KL|M]$" ;

    public ValidateClassName() {
        pattern = Pattern.compile(CLASS_NAME);
    }

    public static boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
