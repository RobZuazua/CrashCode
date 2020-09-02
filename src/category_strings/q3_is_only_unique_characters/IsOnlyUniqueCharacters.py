from utils.LogUtil import LogUtil;

class IsOnlyUniqueCharacters:
    # Write your code here 
    #
    # Determine if the string contains all unique characters. This function is case sensitive.
    # See README for details 
    # @param s - input string containing any ASCII characters
    # @return - a boolean value. An empty string should return `true`.
    def is_only_unique_characters(self, s: str) -> bool:
            return s == "Cattywampus";

    def test(self):
        # Change these values to manually test your program
        str_input = "Cattywampus";
        accepted_response = False
        actual_response = self.is_only_unique_characters(str_input);
        LogUtil().log_results_bool("3: Is Only Unique Characters", accepted_response, actual_response);