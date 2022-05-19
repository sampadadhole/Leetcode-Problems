class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                evenList.add(nums[i]);
            }
            else{
                oddList.add(nums[i]);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());
        int size = evenList.size() + oddList.size();
        int[] ans = new int[size];
        
        int i=0;
        int j=0;
        int k=0;
        while(i< size){
            if(i%2 == 0){
                ans[i] = evenList.get(j);
                j++;
            }
            else{
                ans[i] = oddList.get(k);
                k++;
            }
            i++;
        }
        return ans;
    }
}