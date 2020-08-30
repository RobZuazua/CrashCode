public class FindFirstSubstring {
    public static void main(String[] args) {
        // Change these values to manually test your program
        final String input1 = "dog";
        final String input2 = "a cat and dog ran through the yard chasing a dog";
        final int expectedResponse = 10;
        final int actualResponse = findFirstSubstring(input1, input2);

        LogUtil.logResults(expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine the position of the first occurence of s in t. (See README for details) 
     * @param s - any ASCII characters. Represents the search string
     * @param t - any ASCII characters. Represents a block of text
     * @return position of the first occurence of s in t.
     */
    public static int findFirstSubstring(String s, String t) {
        return s.length() + t.length();
    }
}