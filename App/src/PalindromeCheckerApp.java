public class PalindromeCheckerApp {

    static boolean isPalindrome(String word) {

        if(word.length() <= 1)
            return true;

        if(word.charAt(0) != word.charAt(word.length()-1))
            return false;

        return isPalindrome(word.substring(1, word.length()-1));
    }

    public static void main(String[] args) {

        String word = "madam";

        if(isPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}