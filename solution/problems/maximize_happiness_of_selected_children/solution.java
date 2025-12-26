class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int index=happiness.length-1;
        long sum=0;
        Arrays.sort(happiness);
        for(int i=0;i<k;i++){
            sum+=happiness[index]-i>0?happiness[index]-i:0;
            index--;
        }
        return sum;
        
    }
}