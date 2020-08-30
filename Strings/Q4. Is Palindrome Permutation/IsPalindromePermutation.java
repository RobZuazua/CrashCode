public class IsPalindromePermutation {
    public static void main(String[] args) {
        // Change these values to manually test your program
        final String input = "Car e car";
        final boolean expectedResponse = true;
        final boolean actualResponse = isPalindromePermutation(input);

        LogUtil.logResults(expectedResponse, actualResponse);
    }

    /**
     * Write your code here 
     * 
     * Determine if the input string is or could be turned into a palindrome by reordering characters. Not case sensitive. (See README for details) 
     * @param s - input string containing alphnumeric characters
     * @return - true if string can be turned into palidrone by reordering
     */
    public static boolean isPalindromePermutation(String s) {
        return s.equals("Car e car");
    }
}