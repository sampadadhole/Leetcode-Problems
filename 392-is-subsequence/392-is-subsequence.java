class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = s.length();
        int right = t.length();
        int sleft = 0;
        int pright =0;
        while(sleft<left && pright<right){
            if(s.charAt(sleft)==t.charAt(pright)){
                sleft+=1;
            }
            pright+=1;
        }
        return sleft == left;
    }
}