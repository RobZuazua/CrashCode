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
- It can be written as (A), where A is a valid string
 
## Example 1:
1. Input: s = "lee(t(c)o)de)"
2. Output: "lee(t(c)o)de"
3. Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.


## Example 2:
1. Input: s = "a)b(c)d"
2. Output: "ab(c)d"

## Example 3:
1. Input: s = "))(("
2. Output: ""
3. Explanation: An empty string is also valid.

## Example 4:
1. Input: s = "(a(b(c)d)"
2. Output: "a(b(c)d)"
 

## Constraints:

1. 1 <= s.length <= 100
2. s[i] may contain  '(' , ')' or any other ASCII character.