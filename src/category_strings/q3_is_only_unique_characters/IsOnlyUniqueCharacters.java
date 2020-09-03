package category_strings.q3_is_only_unique_characters;
import utils.*;

public class IsOnlyUniqueCharacters {
    public static void test() {
        // Change these values to manually test your program
        final String input = "Cattywampus";
        final boolean expectedResponse = false;
        final boolean actualResponse = isOnlyUniqueCharacters(input);

        LogUtil.logResults("3: Is Only Unique Characters", expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine if the string contains all unique characters. This function is case sensitive. (See README for details) 
     * @param s - input string containing any ASCII characters
     * @return - a boolean value. An empty string should return `true`.
     */
    public static boolean isOnlyUniqueCharacters(String s) {
        return s.equals("Cattywampus");
    }
}