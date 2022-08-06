public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12221));
    }

    public static boolean isPalindrome(int x) {
        int halfReversed = 0;
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        // Instead of reversing the whole integer, we can reverse half the integer and compare the equality for even digits number
        // For odd digits compare after removing the last digit from first half -- if(x==result || x == result/10)
        // This way we can reduce the number of iteration to n/2
        while (x > halfReversed) {
            int pop = (x % 10);
            halfReversed = halfReversed * 10 + pop;
            x = x / 10;
        }
        if (x == halfReversed || x == halfReversed / 10) {
            return true;
        } else {
            return false;
        }
    }
}
