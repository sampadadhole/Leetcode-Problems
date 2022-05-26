class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int middle = (left+right)/2;
            int curr = nums[middle];
            if(target<curr){
                right = middle -1;
            }
            else if (target>curr){
                left = middle +1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}