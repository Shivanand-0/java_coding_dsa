class Solution {
    // public int searchInsert(int[] nums, int target) {
    //     return helper(nums,target,0,nums.length-1);
    // }
    // public static int helper(int[] num, int target, int l,int r){
    //     if(l>r) return l;
    //     int mid=(l+r)/2;
    //     if(num[mid]==target) return mid;
    //     else if(num[mid]>target) return helper(num,target,l,mid);
    //     else if(num[mid]<target) return helper(num,target,mid,r);
    // 
    public int searchInsert(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    public static int helper(int[] nums, int target, int l, int r) {
        if (l > r) {
            // if not found, return the insertion position
            return l;
        }

        int mid = l + (r - l) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return helper(nums, target, l, mid - 1);
        } else {
            return helper(nums, target, mid + 1, r);
        }
    }
}
