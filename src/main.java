public class main {
    public static void main(String[] args) {
        String[] validAccount = { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        String[] invalidAccount = {".@", "12345", "1234_", "abcde"};

        AccountValidate accountValidate = new AccountValidate();

        for (String i:validAccount) {
            System.out.println("Account "+i+", is: "+accountValidate.validateAccount(i));
        }

        for (String i:invalidAccount) {
            System.out.println("Account "+i+", is: "+accountValidate.validateAccount(i));
        }
    }
}
