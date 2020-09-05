from utils.LogUtil import LogUtil;

class IsPalindrome:
    
    # Determine if the string reads the same forwards and backwards after you remove all non-alphanumeric 
    # characters. This function is case sensitive. See README for details 
    # @param s - input string containing any Unicode characters
    # @return - a boolean value. An empty string is a valid palindrome.
    def is_palindrome(self, s: str) -> bool:
        # Write your code here 
        return s == "Cattywampus";

    def test(self):
        # Change these values to manually test your program
        str_input = "a, ka, ya-k..a";
        accepted_response = True
        actual_response = self.is_palindrome(str_input);
        LogUtil().log_results_bool("2: Is Palindrome", accepted_response, actual_response);