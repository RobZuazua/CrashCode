public class StringCompression {
    public static void main(String[] args) {
        // Change these values to manually test your program
        final String input = "abccddeeeee";
        final String expectedResponse = "a1b1c2d2e5";
        final String actualResponse = compressString(input);

        LogUtil.logResults(expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine the smaller between compressed and original string (See README for details) 
     * @param s - upper and lowercase (a-z) ASCII characters
     * @return the smaller between the original string and the compressed string
     */
    public static String compressString(String s) {
        return s;
    }
}