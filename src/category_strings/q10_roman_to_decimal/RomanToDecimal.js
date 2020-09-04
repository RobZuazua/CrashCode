const LogUtil = require('../../utils/LogUtil.js');

/**
 * Convert a Roman Numeral to an Integer 
 * See README for details
 * @param {string} s -represents a Roman Numeral 
 * @return {int} the int number represented by the Roman Numeral
 */
var romanToDecimal = function(s) {
    // Write your code here
    return 2;
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "II";
    let acceptedResponse = 2;
    let actualResponse = romanToDecimal(strInput);
    new LogUtil().logResultsInt("10: Roman to Decimal", acceptedResponse, actualResponse);
}

module.exports = test;