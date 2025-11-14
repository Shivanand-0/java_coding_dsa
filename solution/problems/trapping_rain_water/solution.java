class Solution {
    public int trap(int[] height) {
      int lMax[]=new int[height.length];
    int rMax[]=new int[height.length];

    int water=0;
    int wHeight=0;
    int sameLevel=1;
    for(int i=0;i<height.length;i++){
        if(height[0]!=height[i]){
            sameLevel=0;
            break;
        }
    }
    if(sameLevel==1) return 0;
    lMax[0]=height[0];
    for(int j=1;j<height.length;j++) {
        lMax[j]=Math.max(lMax[j-1], height[j]);
    }
    rMax[height.length-1]=height[height.length-1];
    for(int j=height.length-2;j>=0;j--) {
        rMax[j]=Math.max(rMax[j+1], height[j]);
    }

    for(int i=0;i<height.length;i++) {
        wHeight=Math.min(lMax[i],rMax[i]);
        water+=wHeight-height[i];
    }
    return water;
    }
}