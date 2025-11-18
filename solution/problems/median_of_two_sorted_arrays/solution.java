class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int d1 = 0;
        int d2 = 0;
        int in1 = 0, in2 = 0;
        int l = (nums1.length + nums2.length);
        int c = (l / 2) + 1;
        if (nums2.length == 0 || nums1.length == 0) {
            if(nums2.length == 0){
                if(l%2==0) d1=nums1[c-2];
                d2=nums1[c-1];
            }else{
                if(l%2==0) d1=nums2[c-2];
                d2=nums2[c-1];
            }
        }
        else{
        for (int i = 0; i < c; i++) {
            if (in2 >= nums2.length && in1 < nums1.length) {
                if (i + 1 == c - 1)
                    d1 = nums1[in1];
                if (i + 1 == c)
                    d2 = nums1[in1];
                in1++;
            } else if (in2 < nums2.length && in1 >= nums1.length) {
                if (i + 1 == c - 1)
                    d1 = nums2[in2];
                if (i + 1 == c)
                    d2 = nums2[in2];
                in2++;
            } else if (in1 < nums1.length && nums1[in1] < nums2[in2]) {
                if (i + 1 == c - 1)
                    d1 = nums1[in1];
                if (i + 1 == c)
                    d2 = nums1[in1];
                in1++;
            } else if (in2 < nums2.length && (nums1[in1] >= nums2[in2])) {
                if (i + 1 == c - 1)
                    d1 = nums2[in2];
                if (i + 1 == c)
                    d2 = nums2[in2];
                in2++;
            }
        }}
        if (l % 2 != 0)
            return (double) d2;
        else
            return (((double) d1 + (double) d2) / 2);
    }
}
