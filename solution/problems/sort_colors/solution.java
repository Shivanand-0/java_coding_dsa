class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
    }
}