# String Compression

## Input

Given a string s containing:

- upper and lowercase (a-z) ASCII characters

## Your task

Write a function that performs a "basic" spring compression using counts of repeated characters. If the compressed string is longer than the original string then you should return the original string.

## Output

Return the shorter between the compressed string or the original string.

## Example 1

1. Input: s = `"abccddeeeee"`
2. Output: `"a1b1c2d2e5"`
3. Explanation: `"a1b1c2d2e5"` is a shorter string than `"abccddeeeee"`. The compressed string is created by counting the number of repeated characters.

## Constraints

1. 1 <= s.length <= 10^5
2. s[i] may contain an upper or lowercase (a-z) ASCII character.
