package banking;

public class BankingSystem {
    private static final String storedAccountNumber = "12345678";
    private static final String storedPin = "1234";

    
    public static class LoginProcessor {
        public static boolean authenticate(String accountNumber, String pin) {
             if (storedAccountNumber == accountNumber && storedPin == pin) {
                return true;
            } else {
                return false;
            }
        }
    }
}
