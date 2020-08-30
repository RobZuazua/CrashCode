public class LogUtil {
    /**
     * A helper method to log test results
     * @param expectedResponse - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(final int expectedResponse, final int actualResponse) {
        if (actualResponse == expectedResponse) {
            System.out.println("PASS! Integer Value = " + actualResponse);
        } else {
            System.out.println("Try Again! Expected: " + expectedResponse + "\n" + "But your code returned: " + actualResponse);
        }
    }

    /**
     * A helper method to log test results
     * @param expectedResponse - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(final String expectedResponse, final String actualResponse) {
        if (expectedResponse.equals(actualResponse)) {
            System.out.println("PASS! String Value = " + actualResponse);
        } else {
            System.out.println("Try Again! Expected: " + expectedResponse + "\n" + "But your code returned: " + actualResponse);
        }
    }

    
}