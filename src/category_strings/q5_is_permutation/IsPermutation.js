const LogUtil = require('../../utils/LogUtil.js');

/**
 * Determine if one string is a permutation of the other. Not case sensitive. 
 * Not case sensitive.  See README for details
 * @param {string} s - any ASCII characters. 
 * @param {string} t - any ASCII characters. 
 * @return {boolean} if one string is a permutation of the other.
 */
var IsPermutation = function(s, t) {
    // Write your code here
    return s == t;
}

var test = function() {
    // Change these values to manually test your program
    let strInput1 = "Avery likes Shaun";
    let strInput2 = "shaun likes avery";
    let acceptedResponse = true;
    let actualResponse = IsPermutation(strInput1, strInput2);
    new LogUtil().logResultsBool("5: Is Permutation", acceptedResponse, actualResponse);
}

module.exports = test;