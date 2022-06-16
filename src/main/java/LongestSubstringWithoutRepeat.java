/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
/*
Explanation
Approach sliding window
Sliding window has left nad right point
We expand the window by moving right pointer
We contract the window by moving left pointer
Initially left = right = 0
int[128] store the location of the char in the ascii location (index of array)
Constantly update the result with the count of the longest unrepeated sub string size

Important
1. Index is the location of the repeated char so move the left index to the next location after the repeated char, so left index can skip many unwanted checks down the lane
Integer index = chars[r];
 if( index!=null && index >= left && index < right){
                left = index +1;
            }
2. Now update the location of the right index to the chars

 */
public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        Integer[] chars = new Integer[128];
        int result = 0;
        int left=0;
        int right=0;


        while (right < s.length()) {
            char r = s.charAt(right);

            Integer index = chars[r];
            if( index!=null && index >= left && index < right){
                left = index +1;
            }
            result = Math.max(result, right - left +1);
            chars[r] = right;
            right++;
        }

        System.out.println(chars['s']);
        return result;
    }
}
