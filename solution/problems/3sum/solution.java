class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int k;
        HashSet<List<Integer>> resultHash = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> elHash = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                k = -1 * (nums[i] + nums[j]);
                if (elHash.contains(k)) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);
                    newList.add(nums[j]);
                    newList.add(k);
                    Collections.sort(newList);
                    if (!resultHash.contains(newList)) {
                        resultList.add(newList);
                        resultHash.add(newList);
                    }
                } else {
                    elHash.add(nums[j]);
                }
            }
        }
        return resultList;
    }
}