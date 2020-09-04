const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine if the string contains all unique characters. This function is case sensitive.
 * See README for details 
 * @param {string} s - input string containing any ASCII characters
 * @return {boolean} An empty string should return `true`.
 */
var IsOnlyUniqueCharacters = function(s) {
    // Write your code here
    return s == "Cattywampus";
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "Cattywampus";
    let acceptedResponse = false;
    let actualResponse = IsOnlyUniqueCharacters(strInput);
    new LogUtil().logResultsBool("3: Is Only Unique Characters", acceptedResponse, actualResponse);
}

module.exports = test;