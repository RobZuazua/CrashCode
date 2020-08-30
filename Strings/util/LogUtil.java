import java.util.Set;

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
            System.out.println("Try Again! Expected Integer Value: " + expectedResponse + "\n" + "But your code returned Integer Value: " + actualResponse);
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
            System.out.println("Try Again! Expected String Value: " + expectedResponse + "\n" + "But your code returned String Value: " + actualResponse);
        }
    }

    /**
     * A helper method to log test results
     * @param expectedResponse - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(final boolean expectedResponse, final boolean actualResponse) {
        if (expectedResponse == actualResponse) {
            System.out.println("PASS! Boolean Value = " + actualResponse);
        } else {
            System.out.println("Try Again! Expected Boolean Value: " + expectedResponse + "\n" + "But your code returned Boolean Value: " + actualResponse);
        }
    }

    /**
     * A helper method to log test results
     * @param acceptedResponses - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(final Set<String> acceptedResponses, final String actualResponse) {
        if (acceptedResponses.contains(actualResponse)) {
            System.out.println("PASS! String Value = " + actualResponse);
        } else {
            System.out.println("Try Again! Expected String Value in: " + acceptedResponses.toString() + "\n" + "But your code returned String Value: " + actualResponse);
        }
    }

    
}