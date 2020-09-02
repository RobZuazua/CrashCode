from utils.LogUtil import LogUtil;

class FindFirstSubstring:
    # Write your code here 
    #
    # Determine the position of the first occurence of s in t.  
    # See README for details
    # @param s - any ASCII characters. Represents the search string
    # @param t - any ASCII characters. Represents a block of text
    # @return - position of the first occurence of s in t.
    def find_first_substring(self, s: str, t: str) -> int:
            return 10;

    def test(self):
        # Change these values to manually test your program
        str_input1 = "dog";
        str_input2 = "a cat and dog ran through the yard chasing a dog";
        accepted_response = 10;
        actual_response = self.find_first_substring(str_input1, str_input2);
        LogUtil().log_results_int("7: Find First Substring", accepted_response, actual_response);