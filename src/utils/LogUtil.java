package utils;

import java.util.Set;

public class LogUtil {
    /**
     * A helper method to log test results
     * @param question - identifier to log current question
     * @param expectedResponse - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(String question, final int expectedResponse, final int actualResponse) {
        System.out.println("Question " + question);
        if (actualResponse == expectedResponse) {
            System.out.println("✅ PASS! Integer Value = " + actualResponse);
        } else {
            System.out.println("🔥 Try Again! Expected Integer Value: " + expectedResponse + "\n" + "But your code returned Integer Value: " + actualResponse);
        }
        System.out.println();
    }

    /**
     * A helper method to log test results
     * @param question - identifier to log current question
     * @param expectedResponse - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(String question, final String expectedResponse, final String actualResponse) {
        System.out.println("Question " + question);
        if (expectedResponse.equals(actualResponse)) {
            System.out.println("✅ PASS! String Value = " + actualResponse);
        } else {
            System.out.println("🔥 Try Again! Expected String Value: " + expectedResponse + "\n" + "But your code returned String Value: " + actualResponse);
        }
        System.out.println();
    }

    /**
     * A helper method to log test results
     * @param question - identifier to log current question
     * @param expectedResponse - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(String question, final boolean expectedResponse, final boolean actualResponse) {
        System.out.println("Question " + question);
        if (expectedResponse == actualResponse) {
            System.out.println("✅ PASS! Boolean Value = " + actualResponse);
        } else {
            System.out.println("🔥 Try Again! Expected Boolean Value: " + expectedResponse + "\n" + "But your code returned Boolean Value: " + actualResponse);
        }
        System.out.println();
    }

    /**
     * A helper method to log test results     
     * @param question - identifier to log current question
     * @param acceptedResponses - response expected by your program
     * @param actualResponse - response returned by your program
     */
    public static void logResults(String question, final Set<String> acceptedResponses, final String actualResponse) {
        System.out.println("Question " + question);
        if (acceptedResponses.contains(actualResponse)) {
            System.out.println("✅ PASS! String Value = " + actualResponse);
        } else {
            System.out.println("🔥 Try Again! Expected String Value in: " + acceptedResponses.toString() + "\n" + "But your code returned String Value: " + actualResponse);
        }
        System.out.println();
    }

    
}