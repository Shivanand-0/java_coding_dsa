class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int diff=high-low;
        if(diff%2==0){
            if(low%2==0) count=diff/2;
            else count=(diff/2)+1;
        }else count=(diff/2)+1;
        return count;
        
    }
}