class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean flagS=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && flagS) break;
            if(s.charAt(i)==' ' && !flagS) continue;
            flagS=true;
            count++;
        }
        return count;
    }
}