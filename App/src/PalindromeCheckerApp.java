import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
        }

        String reverse = "";

        while(!stack.isEmpty()) {
            reverse += stack.pop();
        }

        if(word.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}