# Stones and Jewels

## Information

- LeetCode URL: https://leetcode.com/problems/reverse-integer
- Level: **Medium**

## Analysis

How my algorithm solve the problem,

| Metrics | Value | Description |
| --- |:---:|----|
| Time Complexity | O(log(n)) | The time complexity doesn't scale so steep when the input is increasing. Because the iteration always divides the input by 10. So the complexity should be log10(n) |
| Space Complexity | O(1) | No dynamic data structure / variable is used. Whatever the input, the declared variables are the same. |

## Result

Runtime: **41 ms**, faster than **57.20%** of C# online submissions for Reverse Integer.

Memory Usage: **25.1 MB**, less than **88.94%** of C# online submissions for Reverse Integer.