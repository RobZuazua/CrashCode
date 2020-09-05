from utils.LogUtil import LogUtil;

class StringCompression:

    # Determine the smaller between compressed and original string
    # See README for details
    # @param s - upper and lowercase (a-z) ASCII characters
    # @return - the smaller between the original string and the compressed string
    def string_compression(self, s: str) -> str:
        # Write your code here
        return s;

    def test(self):
        # Change these values to manually test your program
        str_input = "abccddeeeee";
        accepted_response = "a1b1c2d2e5"
        actual_response = self.string_compression(str_input);
        LogUtil().log_results_int("11: String Compression", accepted_response, actual_response);