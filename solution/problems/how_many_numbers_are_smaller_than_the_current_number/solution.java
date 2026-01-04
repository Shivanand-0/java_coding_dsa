class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] cnt=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[j]<nums[i]) count++;
            }
            cnt[i]= count;
        }
        return cnt;
    }
}