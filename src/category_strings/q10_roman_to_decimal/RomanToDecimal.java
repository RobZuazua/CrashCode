package category_strings.q10_roman_to_decimal;
import utils.*;

public class RomanToDecimal {
    public static void test() {
        // Change these values to manually test your program
        final String input = "II";
        final int expectedResponse = 2;
        final int actualResponse = romanToInt(input);

        LogUtil.logResults("10: Roman to Decimal", expectedResponse, actualResponse);
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