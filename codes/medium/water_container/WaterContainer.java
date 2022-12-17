class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = Integer.MIN_VALUE;
        
        while (low < high) {
            int lowestHeight = height[low] >= height[high] ? height[high] : height[low];
            int area = (high - low) * lowestHeight;
            
            if (max < area) {
                max = area;
            }
            
            if (height[low] >= height[high]) {
                high--;
            } else {
                low++;
            } 
        }
        
        return max;
    }
}