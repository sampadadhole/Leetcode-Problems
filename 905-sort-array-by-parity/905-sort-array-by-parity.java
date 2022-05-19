class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size];
        int i=0;
        int j=0;
        for(i=0;i<size;i++){
            if(nums[i]%2 ==0){
                arr[j] = nums[i];
                j++;
            }
        }
         for(i=0;i<size;i++){
            if(nums[i]%2 ==1){
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }
}