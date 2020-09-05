from utils.LogUtil import LogUtil;

class ReverseWordOrdering:

    # Reverse all the words such that the words appear in reverse order. Trim Whitespace.
    # See README for details
    # @param s - input string containing either alphnumeric characters and/or whitespace
    # @return - the words in reverse order
    def reverse_word_ordering(self, s: str) -> str:
        # Write your code here
        return s;

    def test(self):
        # Change these values to manually test your program
        str_input = "rob likes code";
        accepted_response = "code likes rob"
        actual_response = self.reverse_word_ordering(str_input);
        LogUtil().log_results("6: Reverse Word Ordering", accepted_response, actual_response);