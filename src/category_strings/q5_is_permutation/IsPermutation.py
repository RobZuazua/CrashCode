from utils.LogUtil import LogUtil;

class IsPermutation:
    # Write your code here 
    #
    # Determine if one string is a permutation of the other. Not case sensitive. 
    # Not case sensitive.  See README for details
    # @param s - any ASCII characters. 
    # @param t - any ASCII characters. 
    # @return - true if one string is a permutation of the other.
    def is_permutation(self, s: str, t: str) -> bool:
            return s == t;

    def test(self):
        # Change these values to manually test your program
        str_input1 = "Avery likes Shaun";
        str_input2 = "shaun likes avery";
        accepted_response = True;
        actual_response = self.is_permutation(str_input1, str_input2);
        LogUtil().log_results_bool("5: Is Permutation", accepted_response, actual_response);