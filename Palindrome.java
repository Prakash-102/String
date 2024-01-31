
// Check if a String is a Palindrome ?:- 
import java.util.*;

public class Palindrome {

    public static boolean ispalidrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a Palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalidrome(str));
    }
}
/*
 * Output:-
 * true
 */
