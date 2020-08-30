# Is One String a Permutation of Another

## Input

Given two strings s and t containing:

- any ASCII characters

## Your task

Determine if one string is a permutation of the other. Not case sensitive.

## Output

Return a boolean value.

## Example 1

1. Input: s = `"Avery likes Shaun"` t = `"shaun likes avery"`
2. Output: `true`
3. Explanation: `"Avery likes Shaun"` is a permutation of `"shaun likes avery"`.

## Example 2

1. Input: s = `"tea"` t = `"tea party"`
2. Output: `false`
3. Explanation: Strings of different lengths cannot be permutations of each other.

## Constraints

1. 1 <= s.length <= 10^5
2. 1 <= t.length <= 10^5
3. s[i] and t[i] may contain any ASCII character.
