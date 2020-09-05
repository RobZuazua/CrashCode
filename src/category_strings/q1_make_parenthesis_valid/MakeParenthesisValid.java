package category_strings.q1_make_parenthesis_valid;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import utils.*;

public class MakeParenthesisValid {
     /**
     * Remove the minimum number of parentheses so that the resulting parenthesis string is valid
     * (See README for details) 
     * @param s - input string containing ASCII characters
     * @return - ***any*** valid string. There may be more than 1 solution.
     */
    public static String makeParenthesisValid(String s) {
    	// Write your code here	
        return s;
    }
	
	public static void test() {
        // Change these values to manually test your program
	    final String input = "y(e(e(h))a)w)";
	    final Set<String> acceptedResponses = Stream.of("y(e(e(h))a)w", "y(e(e(h)a)w)", "y(e(e(h))aw)")
		    .collect(Collectors.toCollection(HashSet::new));
        final String actualResponse = makeParenthesisValid(input);
        LogUtil.logResults("1: Make Parenthesis Valid", acceptedResponses, actualResponse);
    }
}