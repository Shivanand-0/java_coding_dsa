import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // [1,2,2,3,3,4,7,8]
        List<Integer> lst =new ArrayList<>();
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-count<=0){
                if(nums[i]-count==0) count++;
                continue;
            }else{
                while(nums[i]-count!=0){
                    lst.add(count);
                    count++;
                }
                count++;
            }

        }
        if(count< nums.length+1){
            while(count< nums.length+1){
                lst.add(count);
                count++;
            }
        }
        return lst;
    }
    // ----------------------------------------------------------------------
    // public List<Integer> findDisappearedNumbers(int[] nums) {
    //     int[] freq=new int[nums.length+1];
    //     List<Integer> lst =new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         freq[nums[i]]++;
    //     }
    //     for(int i=1;i<=nums.length;i++){
    //         if(freq[i]<1) lst.add(i);
    //     }
    //     return lst;
    // }
    // ---------------------------------------------------------------
    // public List<Integer> findDisappearedNumbers(int[] nums) {
    //     HashSet<Integer> set =new HashSet<>();
    //     List<Integer> lst =new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         set.add(nums[i]);
    //     }
    //     for(int i=1;i<=nums.length;i++){
    //         if(!set.contains(i)) lst.add(i);
    //     }
    //     return lst;
    // }
}