class Solution {
    public int findJudge(int n, int[][] trust) {
      int[] indegree = new int[n+1];
        int[] outdegree = new int[n+1];
        if(trust.length<n-1) return -1;
        for(int[] rel : trust){
            outdegree[rel[0]]++;
            indegree[rel[1]]++;
        }
        
        for(int i=1;i<=n;i++){
            if(outdegree[i]==0 && indegree[i] == n-1){
                return i;
            }
          
        }
          return -1;
        
    }
}