class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        int index;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                index=(i+nums[i])%nums.length;
            }
            else if(nums[i]<0){
                if((i-Math.abs(nums[i]))>0){
                    index=(i-Math.abs(nums[i]))%nums.length;
                }else{
                    index=Math.abs(nums.length-Math.abs(i-Math.abs(nums[i]))%nums.length)%nums.length;
                }
            }
            else{
                index=i;
            }
            result[i]=nums[index];
        }
        return result;
    }
}