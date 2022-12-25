# Stones and Jewels

## Information

- LeetCode URL: https://leetcode.com/problems/missing-number/
- Level: **Easy**

## Analysis

How my algorithm solve the problem,

| Metrics | Value | Description |
| --- |:---:|----|
| Time Complexity | O(n) | No inner loop involved, only two loops are used. The first loop is mapping all input to hashmap as a key. And then the second is finding the missing number. |
| Space Complexity | O(n) | Since I use hash map data structure for storing the input, the space complexity is O(n) because hashmap space is growing linearly with input provided. |

## Result

Runtime: **74 ms**, faster than **90.52%** of JavaScript online submissions for Missing Number.

Memory Usage: **45.5 MB**, less than **20.16%** of JavaScript online submissions for Missing Number.