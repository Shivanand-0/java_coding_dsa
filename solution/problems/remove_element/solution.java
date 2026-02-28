class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>j) break;
            if(nums[i]==val){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                count++;
                j--;
                i--;
            }
        }  
        return nums.length-count;
    }
    // int j=nums.length-1;
    //     int temp=0;
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(j<=i&&nums.length>1) return nums.length-count;
    //         if(nums[i]==val){
    //             while(nums[j]==val){
    //                 if(j==0) break;
    //                 j--;
    //                 count++;
    //             }
    //            temp=nums[j];
    //            nums[j]=nums[i];
    //            nums[i]=temp;
    //            count++;
    //            j--;
    //         }
    //     }
    //     return nums.length-count;
}