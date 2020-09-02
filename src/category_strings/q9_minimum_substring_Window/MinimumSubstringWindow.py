from utils.LogUtil import LogUtil;

class MinimumSubstringWindow:
    # Write your code here 
    #
    # Determine the smallest "window" of characters in s which contains all the characters in t.
    # See README for details
    # @param s - any ASCII characters. Represents a larger block of text that will be searched.
    # @param t - any ASCII characters. Represents a smaller block of text that we will search to find in s.
    # @return - the size of the smallest window. There may be more than 1 window with the same size. 
    # If there is no such window, return 0.
    def minimum_substring_window(self, s: str, t: str) -> int:
            return 10;

    def test(self):
        # Change these values to manually test your program
        str_input1 = "readingrocks";
        str_input2 = "dog";
        accepted_response = 6;
        actual_response = self.minimum_substring_window(str_input1, str_input2);
        LogUtil().log_results_int("9: Minimum Substring Window", accepted_response, actual_response);