//from utils.LogUtil import LogUtil;
const LogUtil = require('../../utils/LogUtil.js');

/**
 * Remove the minimum number of parentheses so that the resulting parenthesis string is valid 
 * @param {string} s - input string containing ASCII characters
 * @return {string} ***any*** valid string. There may be more than 1 solution.
 */
var makeParenthesisValid = function(s) {
    // Write your code here
    return s;
}

var test = function() {
    // Change these values to manually test your program
    let str_input = "y(e(e(h))a)w)";
    let accepted_responses = ["y(e(e(h))a)w", "y(e(e(h)a)w)", "y(e(e(h))aw)"]
    let actual_response = makeParenthesisValid(str_input);
    new LogUtil().logResultsSet("1: Make Parenthesis Valid", accepted_responses, actual_response);
}

module.exports = test;