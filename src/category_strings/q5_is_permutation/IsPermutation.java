package category_strings.q5_is_permutation;
import utils.*;

public class IsPermutation {
    /**
     * Determine if one string is a permutation of the other. Not case sensitive. (See README for details) 
     * @param s - any ASCII characters. 
     * @param t - any ASCII characters. 
     * @return Return true if one string is a permutation of the other.
     */
    public static boolean isPermutation(String s, String t) {
        // Write your code here 
        return s.equals(t);
    }
    public static void test() {
        // Change these values to manually test your program
        final String input1 = "Avery likes Shaun";
        final String input2 = "shaun likes avery";
        final boolean expectedResponse = true;
        final boolean actualResponse = isPermutation(input1, input2);

        LogUtil.logResults("5: Is Permutation", expectedResponse, actualResponse);
    }
}