public class PalindromeCheckerApp {

    static boolean isPalindrome(String word) {

        word = word.replaceAll("\\s+", "").toLowerCase();

        String reverse = new StringBuilder(word).reverse().toString();

        return word.equals(reverse);
    }

    public static void main(String[] args) {

        String word = "Madam";

        if(isPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}