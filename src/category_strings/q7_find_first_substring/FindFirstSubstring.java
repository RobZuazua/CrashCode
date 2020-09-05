package category_strings.q7_find_first_substring;
import utils.*;

public class FindFirstSubstring {

    /**
     * Determine the position of the first occurence of s in t. (See README for details) 
     * @param s - any ASCII characters. Represents the search string
     * @param t - any ASCII characters. Represents a block of text
     * @return position of the first occurence of s in t.
     */
    public static int findFirstSubstring(String s, String t) {
        // Write your code here
        return s.length() + t.length();
    }

    public static void test() {
        final String input1 = "dog";
        final String input2 = "a cat and dog ran through the yard chasing a dog";
        final int expectedResponse = 10;
        final int actualResponse = findFirstSubstring(input1, input2);

        LogUtil.logResults("7: Find First Substring", expectedResponse, actualResponse);
    }
}