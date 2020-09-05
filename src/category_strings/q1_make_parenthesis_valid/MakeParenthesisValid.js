const LogUtil = require('../../utils/LogUtil.js');

/**
 * Remove the minimum number of parentheses so that the resulting parenthesis string is valid 
 * See README for Details
 * @param {string} s - input string containing ASCII characters
 * @return {string} ***any*** valid string. There may be more than 1 solution.
 */
var makeParenthesisValid = function(s) {
    // Write your code here
    return s;
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "y(e(e(h))a)w)";
    let acceptedResponses = ["y(e(e(h))a)w", "y(e(e(h)a)w)", "y(e(e(h))aw)"]
    let actualResponse = makeParenthesisValid(strInput);
    new LogUtil().logResultsSet("1: Make Parenthesis Valid", acceptedResponses, actualResponse);
}

module.exports = test;