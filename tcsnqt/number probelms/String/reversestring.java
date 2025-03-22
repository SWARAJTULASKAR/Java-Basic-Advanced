
import java.util.*;

public class reversestring {

    public static void main(String[] args) {
        String s = "SWARAJ", s1;
        char[] reverseString = new char[s.length()];
        Stack<Character> Stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            Stack.push(s.charAt(i));
        }
        int i = 0;
        while (!Stack.isEmpty()) {
            reverseString[i++] = Stack.pop();

        }
        s1 = new String(reverseString);
        System.out.println(s1);

    }
}
