from utils.LogUtil import LogUtil;

class MakeParenthesisValid:

    # Write your code here
    #
    # Remove the minimum number of parentheses so that the resulting parenthesis string is valid 
    # (See README for details) 
    # @param s - input string containing ASCII characters
    # @return - ***any*** valid string. There may be more than 1 solution.
    def make_parenthesis_valid(self, s: str) -> str:
            return s;

    def test(self):
        # Change these values to manually test your program
        str_input = "y(e(e(h))a)w)";
        accepted_responses = set(["y(e(e(h))a)w", "y(e(e(h)a)w)", "y(e(e(h))aw)"])
        actual_response = self.make_parenthesis_valid(str_input);

        LogUtil().log_results_set("1: Make Parenthesis Valid", accepted_responses, actual_response);