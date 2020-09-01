package category_strings.q9_minimum_substring_Window;
import utils.*;

public class MinimumSubstringWindow {
    public static void test() {
        // Change these values to manually test your program
        final String input1 = "readingrocks";
        final String input2 = "dog";
        final int expectedResponse = 6;
        final int actualResponse = minimumSubstringWindow(input1, input2);

        LogUtil.logResults("9: Minimum Substring Window", expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine the smallest "window" of characters in s which contains all the characters in t. (See README for details) 
     * @param s - any ASCII characters. Represents a larger block of text that will be searched.
     * @param t - any ASCII characters. Represents a smaller block of text that we will search to find in s.
     * @return Return the size of the smallest window. There may be more than 1 window with the same size. If there is no such window, return 0.
     */
    public static int minimumSubstringWindow(String s, String t) {
        return s.length() + t.length();
    }
}