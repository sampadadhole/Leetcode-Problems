class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        int dp[]=new int[arr.length+1];
        
        for(int i=arr.length-1;i>=0;i--){
           int max=0;
            int len=0;
           int maxSum=0;
            for(int index=i;index<Math.min(i+k,arr.length);index++){
              len++;
               max= Math.max(max,arr[index]);
               maxSum=Math.max(maxSum,(max*len)+dp[index+1]);
            
        }
            dp[i]=maxSum;
        }
        return dp[0];
    }
}