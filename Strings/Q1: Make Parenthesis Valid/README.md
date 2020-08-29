# Remove Minimum Number of Parenthesis to Make Valid

## Input

Given a string s containing:

- `'('`
- `')'`
- other ASCII characters

## Your task

Remove the minimum number of parentheses so that the resulting parenthesis string is valid

## Output

Return ***any*** valid string. There may be more than 1 solution.

A parentheses string is valid if:

- It is the empty string
- It contains only lowercase characters
- Every open parenthesis `'('` has a closing parentheis `')'` after it AND every closing parenthesis `')'` has an opening parenthesis `'('` before it

## Example 1

1. Input: s = "y(e(e(h))a)w)"
2. Output: "y(e(e(h))a)w"
3. Explanation: "y(e(e(h)a)w)" , "y(e(e(h))aw)" would also be accepted.

## Example 2

1. Input: s = ")ca(5)h"
2. Output: "ca(5)h"

## Example 3

1. Input: s = ")))))(("
2. Output: ""
3. Explanation: An empty string is valid.

## Example 4

1. Input: s = "(c(o(D)3)"
2. Output: "c(o(D)3)"
3. Explanation: "(co(D)3)" , ""(c(oD)3)" would also be accepted.

## Constraints

1. 1 <= s.length <= 100
2. s[i] may contain  '(' , ')' or any other ASCII character.
