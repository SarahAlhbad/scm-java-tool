/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passwordgenerator;

public class PasswordColorizer {

    // ANSI escape codes للألوان
    public static final String RESET = "\u001B[0m";
    public static final String RED   = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE  = "\u001B[34m";

    /** 
     * يلف الكلمة بلون عشوائي (أخضر أو أزرق أو أحمر) 
     */
    public static String colorize(String password) {
        String[] colors = {RED, GREEN, BLUE};
        int idx = (int) (Math.random() * colors.length);
        return colors[idx] + password + RESET;
    }
}