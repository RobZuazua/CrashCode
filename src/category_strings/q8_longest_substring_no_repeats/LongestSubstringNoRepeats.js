const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine the length of the longest substring without any repeating characters.
 * See README for details
 * @param {string} s -input string with any ASCII characters 
 * @return {int} length of longest substring without any repeating characters
 */
var longestStringNoRepeats = function(s) {
    // Write your code here
    return 10;
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "aabcc";
    let acceptedResponse = 3;
    let actualResponse = longestStringNoRepeats(strInput);
    new LogUtil().logResultsInt("8: Longest Substring No Repeats", acceptedResponse, actualResponse);
}

module.exports = test;