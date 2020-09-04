from utils.LogUtil import LogUtil;

class RomanToDecimal:
    # Write your code here 
    #
    # Convert a Roman Numeral to an Integer 
    # See README for details
    # @param s - represents a Roman Numeral 
    # @return - the int number represented by the Roman Numeral
    def roman_to_decimal(self, s: str) -> int:
            return 2;

    def test(self):
        # Change these values to manually test your program
        str_input = "II";
        accepted_response = 2
        actual_response = self.roman_to_decimal(str_input);
        LogUtil().log_results_int("10: Roman to Decimal", accepted_response, actual_response);