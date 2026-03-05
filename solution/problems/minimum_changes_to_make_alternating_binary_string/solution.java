class Solution {
    public int minOperations(String s) {
        char curr;
        int count1=0;
        int count2=1;
        // 
        char prev=s.charAt(0);
        for(int i=1;i<s.length();i++){
            curr=s.charAt(i);
            if(curr==prev) {
                count1++;
                if(curr=='1') prev='0';
                else prev='1';
            }else prev=curr;
        }
        //  
        if(s.charAt(0)=='1') prev='0';
        else prev='1';
        for(int i=1;i<s.length();i++){
            curr=s.charAt(i);
            if(curr==prev) {
                count2++;
                if(curr=='1') prev='0';
                else prev='1';
            }else prev=curr;
        }
        return count1>count2?count2:count1;
    }
}