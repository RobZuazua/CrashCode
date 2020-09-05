package category_strings.q6_reverse_word_ordering;
import utils.*;

public class ReverseWordOrdering {

    /**
     * Reverse all the words such that the words appear in reverse order. Trim Whitespace. (See README for details) 
     * @param s - input string containing either alphnumeric characters and/or whitespace
     * @return the words in reverse order
     */
    public static String reverseWordOrdering(String s) {
        // Write your code here
        return s;
    }
    
    public static void test() {
        // Change these values to manually test your program
        final String input = "rob likes code";
        final String expectedResponse = "code likes rob";
        final String actualResponse = reverseWordOrdering(input);

        LogUtil.logResults("6: Reverse Word Ordering", expectedResponse, actualResponse);
    }
}