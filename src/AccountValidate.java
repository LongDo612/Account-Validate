import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountValidate {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountValidate() {
    }

    public boolean validateAccount(String account) {
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
