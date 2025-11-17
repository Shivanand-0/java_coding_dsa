class Solution {
    public int removeDuplicates(int[] nums) {
        int indexEmpty=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                nums[indexEmpty]=nums[i];
                indexEmpty++;
            }
        }
        return indexEmpty;
    }
}