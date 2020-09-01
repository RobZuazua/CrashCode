# Roman to Decimal

## Input

You are given a string representing a roman numeral.

## Your task

Convert this roman numeral to an integer.

## Roman Numeral Context

There are seven different Roman numeral symbols: I, V, X, L, C, D and M. Each symbol represents an integer value.

```json
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

You can represent 2 in roman numerals like `II` which is basically `I` (1) + `I` (1).
You can represent 6 in roman numberal like `VI` which is basically + `V` (5) + `I` (1).

Roman numerals are written left to right with larger than smaller symbols. However, there are a few exceptions. When smaller symbols are placed before larger ones, you subtract the smaller number from the larger

- `I` (1) can be placed before `V` (5) and `X` (10) to make `IV` (4) and `IX` (9).
- `X` (10) can be placed before `L` (50) and `C` (100) to make `XL` (40) and `XC` (90).
- `C` (100) can be placed before `D` (500) and `M` (1000) to make `CD` (400) and `CM` (900).

Back to back exceptions are not allowed. Ex: `IXC` is invalid as is `CDM`

## Output

An integer represented by the roman numeral string.

## Example 1

1. Input: `II`
2. Output: 2

## Example 2

1. Input: `IV`
2. Output: 4
3. Explanation: Since we hit an exception, we subtract `I` from `V`.

## Example 3

1. Input: `CIX`
2. Output: 109
3. Explanation: `C` = 100, `IX` = 9

## Example 4

1. Input: `LVI`
2. Output: 56
3. Explanation: `L` = 50, `V`= 5, `I` = 3.

## Example 5

1. Input: `MCMXCIV`
2. Output: 1994
3. Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

## Constraints

Input is guaranteed to be within the range from 1 to 3999.
