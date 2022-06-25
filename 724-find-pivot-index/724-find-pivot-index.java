class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        int leftsum =0;
        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        for(int i =0;i<nums.length;i++){
            if(leftsum== sum-leftsum-nums[i]){
                return i;
               
            }
            else  leftsum +=nums[i];
            
        }
        return -1;
        
    }
}