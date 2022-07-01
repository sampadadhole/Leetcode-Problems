class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        for(int i=0;i<nums.length;i++){
            int acc = 1;
            for(int j =i;j<nums.length;j++){
                acc = acc * nums[j];
                result = Math.max(acc, result);
            }
        }
        return result;
    }
}