class Solution {
    public boolean checkPossibility(int[] nums) {
        int violations = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]> nums[i]){
                if(violations==1){
                    return false;
                }
                violations++;
                if(i<2 || nums[i-2] <=nums[i]){
                    nums[i-1] = nums[i];
                }
                else{
                    nums[i] = nums[i-1];
                }
            }
        }
        return true;
    }
}