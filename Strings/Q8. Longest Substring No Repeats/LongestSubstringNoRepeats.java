public class LongestSubstringNoRepeats {
    public static void main(String[] args) {
        // Change these values to manually test your program
        final String input = "aabcc";
        final int expectedResponse = 3;
        final int actualResponse = longestSubstringNoRepeats(input);

        LogUtil.logResults(expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine the length of the longest substring without any repeating characters. (See README for details) 
     * @param s - input string with any ASCII characters 
     * @return length of longest substring without any repeating characters
     */
    public static int longestSubstringNoRepeats(String s) {
        return s.length();
    }
}