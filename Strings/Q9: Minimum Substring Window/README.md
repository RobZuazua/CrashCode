# Minimum Substring Window

## Input

Given two strings s and t containing:

- any ASCII characters

## Your task

Determine the smallest "window" of characters in s which contains all the characters in t.

## Output

Return the size of the smallest window. There may be more than 1 window with the same size. If there is no such window, return 0.

## Example 1

1. Input: s = `"readingrocks"` t = `"dog"`
2. Output: `6`
3. Explanation: `"dingro"` is the smallest window of characters in s that contains all the characters in t.

## Example 2

1. Input: s = `"tea"` t = `"party"`
2. Output: `0`
3. Explanation: There is no window.

## Constraints

1. 1 <= s.length <= 100
2. 1 <= t.length <= 100
3. s[i] and t[i] may contain any ASCII character.
