package recursion;

public class Palindrome {
    public boolean isPalindrome(String word){
        int n = word.length();
        boolean t = false;

        if (n < 2){
            return true;
        }

        else if (word.charAt(0) == word.charAt(n-1)) {
            t = true;
            if (n > 2) {
                isPalindrome(word.substring(1, n - 2));
            }
        }
        return t;
    }
}
