class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int MaxWater=0;
        int h=0;
        int water=0;
        while(left<=right){
            h=Math.min(height[left], height[right]);
            water= (h*(right-left));
            if(water>MaxWater) MaxWater=water;
            if(h==height[left]) left++;
            else right--;
        }
    return MaxWater;
    }
}