class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] result= new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(map.get(i)!=null && map.get(i)>1)  result[0]=i;
            if(!map.containsKey(i)) result[1]=i;
        }

        return result;
    }
}