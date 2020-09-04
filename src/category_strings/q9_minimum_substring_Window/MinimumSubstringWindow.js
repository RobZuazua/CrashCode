const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine the smallest "window" of characters in s which contains all the characters in t.
 * See README for details
 * @param {string} s - any ASCII characters. Represents a larger block of text that will be searched.
 * @param {string} t - any ASCII characters. Represents a smaller block of text that we will search to find in s.
 * @return {int} - the size of the smallest window. There may be more than 1 window with the same size. 
 * If there is no such window, return 0.
 */
var minimumSubstringWindow = function(s, t) {
    // Write your code here
    return 10;
}

var test = function() {
    // Change these values to manually test your program
    let strInput1 = "readingrocks";
    let strInput2 = "dog";
    let acceptedResponse = 6;
    let actualResponse = minimumSubstringWindow(strInput1, strInput2);
    new LogUtil().logResultsInt("9: Minimum Substring Window", acceptedResponse, actualResponse);
}

module.exports = test;