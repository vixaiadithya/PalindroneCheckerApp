import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        LinkedList<Character> list = new LinkedList<>();

        for(char c : word.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while(list.size() > 1) {
            if(list.removeFirst() != list.removeLast()) {
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