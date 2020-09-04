const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine if the string reads the same forwards and backwards after you remove all non-alphanumeric 
 * characters. This function is case sensitive. See README for details 
 * @param {string} s - input string containing any Unicode characters
 * @return {boolean} An empty string is a valid palindrome.
 */
var isPalindrome = function(s) {
    // Write your code here
    return s == "Cattywampus";
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "a, ka, ya-k..a";
    let acceptedResponse = true;
    let actualResponse = isPalindrome(strInput);
    new LogUtil().logResultsBool("2: Is Palindrome", acceptedResponse, actualResponse);
}

module.exports = test;