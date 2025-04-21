package passwordgenerator;

public class PasswordStrengthChecker {

    public static String evaluate(String password) {
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) score++;

        if (score >= 4) {
            return "Strength: Strong";
        } else if (score == 3) {
            return "Strength: Medium";
        } else {
            return "Strength: Weak";
        }
    }
}
