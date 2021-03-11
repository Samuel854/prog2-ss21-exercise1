import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPassword {

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])" + //Atleast one Digit.
            "(?!.*(012|123|234|345|456|567|678|789|890))" + // No use of rows of numbers.
            "(?!.*(1111|2222|3333|4444|5555|6666|7777|8888|9999|0000))" + // No use of same numbers in pairs of four.
            "(?=.*[a-z])" + //Atleast one lower case.
            "(?=.*[A-Z])" + //Atleast one upper case.
            "(?=.*[()#$?!%/@])" + //Atleast one of the following special characters.
            "(?=.*[^&–[{}]:;',*~^+=<>])" + //None of these following characters should be used.
            ".{8,25}$"; //Length of 8-25 characters.*/


    //private static final String PASSWORD_PATTERN_DIGIT = "[0-9]";
    //private static final String PASSWORD_PATTERN_ORDER = "(?!.*(012|123|234|345|456|567|678|789|890))";
    //private static final String PASSWORD_PATTERN_ROW = "(?!.*(1111|2222|3333|4444|5555|6666|7777|8888|9999|0000))";
    //private static final String PASSWORD_PATTERN_LOWER = ".*[a-z]";
    //private static final String PASSWORD_PATTERN_UPPER = "[A-Z]";
    private static final String PASSWORD_PATTERN_SPECIAL = ".*[()#$?!%/@]";
    private static final String PASSWORD_PATTERNNO_SPECIAL = ".*[&–[{}]:;',*~^+=<>]";
    private static final String PASSWORD_PATTERN_LENGTH = ".{8,25}";


    public static boolean validPassword_Length(String password) {

        if (password.matches(PASSWORD_PATTERN_LENGTH)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Password not valid. Try Again!");
            return false;
        }

    }

    public static boolean validPassword_Digit(String password) {

        if (password.matches(PASSWORD_PATTERN)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Password not valid. Try Again!");
            return false; // returns false
        }

    }

    public static boolean validPassword_Order(String password) {

        if (password.matches(PASSWORD_PATTERN)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Password not valid. Try Again!");
            return false;
        }

    }

    public static boolean validPassword_Row(String password) {

        if (password.matches(PASSWORD_PATTERN)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Password not valid. Try Again!");
            return false;
        }

    }

    public static boolean validPassword_Lower(String password) {

        if (password.matches(PASSWORD_PATTERN)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Password not valid. Try Again!");
            return false;
        }

    }

    public static boolean validPassword_Upper(String password) {

        if (password.matches(PASSWORD_PATTERN)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Password not valid. Try Again!");
            return false;
        }

    }

    public static boolean validPassword_Special(String password) {

        if (password.matches(PASSWORD_PATTERN_SPECIAL)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Password not valid. Try Again!");
            return false;
        }

    }

    public static boolean validPassword_No_Special(String password) {

        if (password.matches(PASSWORD_PATTERNNO_SPECIAL)) {
            System.out.println("Password not valid. Try Again!");
            return true;
        } else {
            System.out.println("Valid");
            return false;
        }

    }

}

