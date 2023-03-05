class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];

        // Calculate Left Sum
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum[i] = sum;
            } else {
                sum += nums[i - 1];
                leftSum[i] = sum;
            }
        }

        // Calculate Right Sum
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightSum[i] = sum;
            } else {
                sum += nums[i + 1];
                rightSum[i] = sum;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sum = leftSum[i] - rightSum[i];
            result[i] = sum > 0 ? sum : -sum;
        }

        return result;
    }
}