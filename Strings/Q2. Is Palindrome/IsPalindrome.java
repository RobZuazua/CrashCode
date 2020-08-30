public class IsPalindrome {
    public static void main(String[] args) {
        // Change these values to manually test your program
        final String input = "a, ka, ya-k..a";
        final boolean expectedResponse = true;
        final boolean actualResponse = isPalindrome(input);

        LogUtil.logResults(expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine if the string reads the same forwards and backwards after you remove all non-alphanumeric characters. This function is case sensitive. (See README for details) 
     * @param s - input string containing any Unicode characters
     * @return - Return a boolean value. An empty string is a valid palindrome.
     */
    public static boolean isPalindrome(String s) {
        return s.equals("Cattywampus");
    }
}