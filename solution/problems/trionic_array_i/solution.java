class Solution {
    public boolean isTrionic(int[] nums) {
        int temp=nums[0];
        int index=0;
        boolean flag1=false;
        boolean flag2=false;
        boolean flag3=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>temp){
                temp=nums[i];
                index++;
                flag1=true;
            }else{
                if(flag1==false) return false;
                break;
            }
        }
        
        for(int i=index+1;i<nums.length;i++){
            if(nums[i]<temp){
                temp=nums[i];
                index++;
                flag2=true;
            }else{
                if(flag2==false) return false;
                break;
            }
        }
        for(int i=index+1;i<nums.length;i++){
            if(nums[i]>temp){
                temp=nums[i];
                index++;
                flag3=true;
            }else{
                return false;
            }
        }
        if(flag1 && flag2 && flag3) return true;
        return false;
    }
}