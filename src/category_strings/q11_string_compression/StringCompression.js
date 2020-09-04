const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine the smaller between compressed and original string
 * See README for details
 * @param {string} s - upper and lowercase (a-z) ASCII characters
 * @return {string} the smaller between the original string and the compressed string
 */
var stringCompression = function(s) {
    // Write your code here
    return s;
}

var test = function() {
    // Change these values to manually test your program
    let strInput = "abccddeeeee";
    let acceptedResponse = "a1b1c2d2e5";
    let actualResponse = stringCompression(strInput);
    new LogUtil().logResultsString("11: String Compression", acceptedResponse, actualResponse);
}

module.exports = test;