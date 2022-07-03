class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            n = checkHappy(n);
        }
        return n==1;
    }
    
    public int checkHappy(int n){
        int sum =0;
        while(n>0){
            int d = n%10;
            n = n/10;
            sum+= d*d ;
        
        }
        return sum;
    }
}