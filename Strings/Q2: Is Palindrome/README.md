# Is Palindrome

## Input

Given a string s containing:

- Unicode characters

## Your task

Determine if the string reads the same forwards and backwards after you remove all non-alphanumeric characters. This function should be case sensitive.

## Output

Return a boolean value.

## Example 1

1. Input: s = `"civic"`
2. Output: `true`
3. Explanation: `"civic"` reads the same forwards and backwards.

## Example 2

1. Input: s = `"Hannah"`
2. Output: `false`
3. Explanation: This function should be case sensitive. `"Hannah"` != `"hannaH"`

## Example 3

1. Input: s = `"a, ka, ya-k..a"`
2. Output: `true`
3. Explanation: When you remove all non-alphanumeric characters, `"akayaka"` reads the same forwards and backwards.

## Constraints

1. 1 <= s.length <= 100
2. s[i] may contain any Unicode character.
