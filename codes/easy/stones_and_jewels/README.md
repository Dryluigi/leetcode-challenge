# Stones and Jewels

## Information

- LeetCode URL: https://leetcode.com/problems/jewels-and-stones/
- Level: **Easy**

## Analysis

How my algorithm solve the problem,

| Metrics | Value | Description |
| --- |:---:|----|
| Time Complexity | O(n*m) | Since there are 2 string input and my algorithm iterate over those two of them stacking each other (inner iteration), the complexity should be the stones (n) times jewels (m). |
| Space Complexity | O(n+m) | There are 2 dynamic sized variable (2 inputs) and several constant variables (can be omitted). |

## Result

Runtime: **2 ms**, faster than **44.21%** of Go online submissions for Jewels and Stones.

Memory Usage: **1.9 MB**, less than **93.80%** of Go online submissions for Jewels and Stones.