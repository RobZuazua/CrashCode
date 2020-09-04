const LogUtil = require('../../utils/LogUtil.js');

/**
 * Reverse all the words such that the words appear in reverse order. Trim Whitespace.
 * See README for details
 * @param {string} s - input string containing either alphnumeric characters and/or whitespace
 * @return {string} the words in reverse order
 */
var reverseWordOrdering = function(s) {
    // Write your code here
    return s;
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "rob likes code";
    let acceptedResponse = "code likes rob";
    let actualResponse = reverseWordOrdering(strInput);
    new LogUtil().logResultsString("6: Reverse Word Ordering", acceptedResponse, actualResponse);
}

module.exports = test;