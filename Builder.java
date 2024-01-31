
//String Builder ?:- 
import java.util.*;

public class Builder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch + " ");
        }
        System.out.println(sb);
    }
}
/*
 * Output:-
 * a b c d e f g h i j k l m n o p q r s t u v w x y z
 */
