const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine if the input string is or could be turned into a palindrome by reordering characters. 
 * Not case sensitive.  See README for details
 * @param {string} s - input string containing alphnumeric characters
 * @return {boolean} true if string can be turned into palidrone by reordering
 */
var IsPalindromePermutation = function(s) {
    // Write your code here
    return s == "Car e car";
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "Car e car";
    let acceptedResponse = true;
    let actualResponse = IsPalindromePermutation(strInput);
    new LogUtil().logResultsBool("4: Is Palindrome Permutation", acceptedResponse, actualResponse);
}

module.exports = test;