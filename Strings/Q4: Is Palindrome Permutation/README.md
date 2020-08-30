# Is Palindrome Permutation

## Input

Given a string s containing:

- Alphanumeric ASCII characters

## Your task

Determine if the input string is or could be turned into a palindrome by reordering characters. This function only needs to take alphanumeric characters into account and case does not matter.

## Output

Return a boolean value.

A string is a palindrome if:

- It is the empty string
- The string reads the same forwards and backwards after you remove all non-alphanumeric characters.

## Example 1

1. Input: s = `"Car e car"`
2. Output: `true`
3. Explanation: `"racecar"` is a palindrome.

## Example 2

1. Input: s = `""`
2. Output: `true`
3. Explanation: The empty string is a palindrome.

## Example 3

1. Input: s = `"tacocats"`
2. Output: `false`
3. Explanation: There is no palindrome.

## Constraints

1. 1 <= s.length <= 10^5
2. s[i] may contain an alphanumeric ASCII character.
