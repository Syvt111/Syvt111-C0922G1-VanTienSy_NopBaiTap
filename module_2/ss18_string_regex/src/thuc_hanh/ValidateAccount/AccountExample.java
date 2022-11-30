package thuc_hanh.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Pattern pattern;
    private static Matcher matcher;

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6}$";

    public AccountExample() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public static boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
