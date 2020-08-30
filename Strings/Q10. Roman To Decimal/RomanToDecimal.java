public class RomanToDecimal {
    public static void main(String[] args) {
        // Change these values to manually test your program
        final String input = "II";
        final int expectedResponse = 2;
        final int actualResponse = romanToInt(input);

        LogUtil.logResults(expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Convert a Roman Numeral to an Integer (See README for details) 
     * @param s - represents a Roman Numeral 
     * @return the int number represented by the Roman Numeral
     */
    public static int romanToInt(String s) {
        return s.length();
    }
}