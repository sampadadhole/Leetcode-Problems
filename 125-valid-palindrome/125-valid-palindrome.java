class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        rev = str.reverse();
        String original = str.toString();
        String reversed = str.reverse().toString();
        return original.equals(reversed);
        
    }
}