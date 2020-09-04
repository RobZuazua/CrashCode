const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine the position of the first occurence of s in t.  
 * See README for details
 * @param {string} s - ny ASCII characters. Represents the search string
 * @param {string} t - any ASCII characters. Represents a block of text
 * @return {int} position of the first occurence of s in t.
 */
var findFirstSubstring = function(s, t) {
    // Write your code here
    return 10;
}

var test = function() {
    // Change these values to manually test your program
    let strInput1 = "dog";
    let strInput2 = "a cat and dog ran through the yard chasing a dog";
    let acceptedResponse = 10;
    let actualResponse = findFirstSubstring(strInput1, strInput2);
    new LogUtil().logResultsInt("7: Find First Substring", acceptedResponse, actualResponse);
}

module.exports = test;