# Count the Number of Consistent Strings

## Information

- LeetCode URL: https://leetcode.com/problems/count-the-number-of-consistent-strings
- Level: **Easy**

## Analysis

How my algorithm solve the problem,

| Metrics | Value | Description |
| --- |:---:|----|
| Time Complexity | O(n<sup>3</sup>) | One loop with one inner loop is used in this algorithm which cost about O(n<sup>2</sup>). Then the `contains` method cost O(n) time. So it is O(nn<sup>3</sup>) in total. |
| Space Complexity | O(1) | No dynamic data structures involved. |

## Result

Runtime: **28 ms**, faster than **26.95%** of Java online submissions for Count the Number of Consistent Strings.

Memory Usage: **44.1 MB**, less than **17.33%** of Java online submissions for Count the Number of Consistent Strings.