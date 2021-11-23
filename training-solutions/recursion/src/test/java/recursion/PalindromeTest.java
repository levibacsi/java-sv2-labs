package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertEquals(false, palindrome.isPalindrome("ab"));
        assertEquals(true, palindrome.isPalindrome("bb"));
        assertEquals(true, palindrome.isPalindrome("bab"));
        assertEquals(true, palindrome.isPalindrome("abba"));
        assertEquals(true, palindrome.isPalindrome("racecar"));
        assertEquals(true, palindrome.isPalindrome("wasitacaroracatisaw"));
        assertEquals(false, palindrome.isPalindrome("abc"));
        assertEquals(true, palindrome.isPalindrome("a"));
        assertEquals(true, palindrome.isPalindrome(""));
    }
}