class Solution {
    public int[] shuffle(int[] nums, int n) {
        // T:O(n2) and S:O(1)
        int temp;
        int yIndex=n;
        for(int i=1;i<2*n;i++){
            if(i%2!=0 ){
                temp=nums[yIndex];
                for(int j=yIndex;j>i;j--){
                    nums[j]=nums[j-1];
                }
                nums[i]=temp;
                yIndex++;
            }
        }
        return nums;
    }
}