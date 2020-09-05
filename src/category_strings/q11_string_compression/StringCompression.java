package category_strings.q11_string_compression;
import utils.*;

public class StringCompression {
    /**
     * Determine the smaller between compressed and original string (See README for details) 
     * @param s - upper and lowercase (a-z) ASCII characters
     * @return the smaller between the original string and the compressed string
     */
    public static String compressString(String s) {
        // Write your code here 
        return s;
    }

    public static void test() {
        // Change these values to manually test your program
        final String input = "abccddeeeee";
        final String expectedResponse = "a1b1c2d2e5";
        final String actualResponse = compressString(input);

        LogUtil.logResults("11: String Compression", expectedResponse, actualResponse);
    }
}