import java.util.*;
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int largest=0,smallest=0;
        for(int i=0;i<k;i++){
            smallest+=nums[i];
            largest+=nums[nums.length-1-i];
        }
        return Math.abs(largest-smallest);
    }
}