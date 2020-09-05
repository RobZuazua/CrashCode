package category_strings.q8_longest_substring_no_repeats;
import utils.*;

public class LongestSubstringNoRepeats {

    /**
     * Determine the length of the longest substring without any repeating characters. (See README for details) 
     * @param s - input string with any ASCII characters 
     * @return length of longest substring without any repeating characters
     */
    public static int longestSubstringNoRepeats(String s) {
        // Write your code here
        return s.length();
    }

    public static void test() {
        // Change these values to manually test your program
        final String input = "aabcc";
        final int expectedResponse = 3;
        final int actualResponse = longestSubstringNoRepeats(input);

        LogUtil.logResults("8: Longest Substring No Repeats", expectedResponse, actualResponse);
    }
}