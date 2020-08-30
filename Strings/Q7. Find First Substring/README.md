# Find first substring in a block of text

## Input

Given two strings s (search string) and t (block of text) containing:

- any ASCII characters

## Your task

Determine the position of the first occurence of s in t.

## Output

Return an integer representing the position of the first occurence of the substring s in t.

## Example 1

1. Input: s = `"dog"` t = `"a cat and dog ran through the yard chasing a dog"`
2. Output: `10`
3. Explanation: `10` is the position of the first occurence of the search string in the block of text.

## Example 2

1. Input: s = `"yes"` t = `"yes and no"`
2. Output: `0`
3. Explanation: `0` is the position of the first occurence of the search string in the block of text.

## Constraints

1. 1 <= s.length <= t.length <= 10^5
2. s[i] and t[i] may contain any ASCII character.
