package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String text) {
        text = text.trim();
        StringBuilder sb = new StringBuilder(text);

        return text.equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("madamImAdam"));
        System.out.println(palindromeValidator.isPalindrome("madam Im Adam"));
        System.out.println(palindromeValidator.isPalindrome("racecar"));
        System.out.println(palindromeValidator.isPalindrome("o"));
        System.out.println(palindromeValidator.isPalindrome("\n"));
        System.out.println(palindromeValidator.isPalindrome("no"));
    }
}
