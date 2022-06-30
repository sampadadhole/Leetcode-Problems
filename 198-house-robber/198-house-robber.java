class Solution {
    public int rob(int[] nums) {
        int[] maxRobbed = new int[nums.length+1];
        int len = nums.length;
        maxRobbed[len] = 0;
        maxRobbed[len-1] = nums[len-1];
        for(int i = len-2;i>=0;i--){
            maxRobbed[i] = Math.max(maxRobbed[i+1], maxRobbed[i+2]+nums[i]);
        }
        return maxRobbed[0];
    }
}