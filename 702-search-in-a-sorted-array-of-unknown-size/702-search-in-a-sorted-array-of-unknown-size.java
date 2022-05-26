/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        int left =0;
        int right = Integer.MAX_VALUE;
        while(left<=right){
            int middle = (left+right)/2;
            int curr = reader.get(middle);
            if(curr == Integer.MAX_VALUE){
                right = middle -1;
            }
            else if(curr == target){
                return middle;
            }
            else if(curr>target){
                right = middle -1;
            }
            else{
                 left = middle +1;
            }
        }
        return -1;
    }
}