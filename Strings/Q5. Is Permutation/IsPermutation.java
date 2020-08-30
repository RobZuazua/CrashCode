public class IsPermutation {
    public static void main(String[] args) {
        // Change these values to manually test your program
        final String input1 = "Avery likes Shaun";
        final String input2 = "shaun likes avery";
        final boolean expectedResponse = true;
        final boolean actualResponse = isPermutation(input1, input2);

        LogUtil.logResults(expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine if one string is a permutation of the other. Not case sensitive. (See README for details) 
     * @param s - any ASCII characters. 
     * @param t - any ASCII characters. 
     * @return Return true if one string is a permutation of the other.
     */
    public static boolean isPermutation(String s, String t) {
        return s.equals(t);
    }
}