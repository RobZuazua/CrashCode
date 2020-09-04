from utils.LogUtil import LogUtil;

class LongestSubstringNoRepeats:
    # Write your code here 
    #
    # Determine the length of the longest substring without any repeating characters.
    # See README for details
    # @param s - input string with any ASCII characters 
    # @return - length of longest substring without any repeating characters
    def longest_substring_no_repeats(self, s: str) -> str:
            return 10;

    def test(self):
        # Change these values to manually test your program
        str_input = "aabcc";
        accepted_response = 3
        actual_response = self.longest_substring_no_repeats(str_input);
        LogUtil().log_results_int("8: Longest Substring No Repeats", accepted_response, actual_response);