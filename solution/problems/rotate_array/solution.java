class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        int[] res=new int[l];
        int index=l-(k%l);
        for(int i=0;i<nums.length;i++){
            index=index%l;
            res[i]=nums[index];
            index++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}