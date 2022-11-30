package bai_tap.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;

    public static final String PHONE_NUMBER_REGEX = "^[(]+[0-9]{2}+[)]+-+[(]+[0-9]{10}+[)]$";

    public ValidPhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }

    public static boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
