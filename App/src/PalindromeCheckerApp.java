import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        Deque<Character> deque = new LinkedList<>();

        for(char c : word.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}