/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordgenerator;

/**
 *
 * @author mohAlyosofi
 */
import java.security.SecureRandom;
import java.util.Scanner;
import javax.xml.transform.Source;

public class PasswordGenerator {

   
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS    = "0123456789";
    private static final String CHAR_POOL = UPPERCASE + LOWERCASE + DIGITS;

    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder pwd = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int idx = random.nextInt(CHAR_POOL.length());
            pwd.append(CHAR_POOL.charAt(idx));
        }
        return pwd.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        String pwd = generatePassword(length);
        // هنا نلوّن كلمة السر فقط
        String coloredPwd = PasswordColorizer.colorize(pwd);

        System.out.println("Generated Password: " + coloredPwd);
    }
    
}

