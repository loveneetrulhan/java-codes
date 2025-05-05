class WeakPasswordException extends Exception {
    private static final long serialVersionUID = 1L;

    public WeakPasswordException(String message) {
        super(message);
    }
}
// Minimum length of 8 characters → password.length() < 8
// Contains at least one letter (uppercase or lowercase) → password.matches(".*[a-zA-Z].*")
// Contains at least one digit (0-9) → password.matches(".*\\d.*")
class PasswordValidator {
    public void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8 || !password.matches(".*[a-zA-Z].*") || !password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Password must be at least 8 characters long and include both letters and numbers.");
        }
        System.out.println("Password is strong.");
    }

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        
        try {
            validator.validatePassword("pass123"); // Weak password
        } catch (WeakPasswordException e) {
            System.out.println("Weak Password: " + e.getMessage());
        }
        //If a weak password is entered, the exception is caught and an error message is displayed.

        try {
            validator.validatePassword("StrongPass123"); // Strong password
        } catch (WeakPasswordException e) {
            System.out.println("Strong Password: " + e.getMessage());
        }
    }
}
