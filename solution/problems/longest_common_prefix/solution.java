class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs[0].length()==0) return "";
        String prefix="";
        char fpre=strs[0].charAt(0);
        int minlength=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minlength) minlength=strs[i].length();
        }
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0|| strs[i].charAt(0)!=fpre) return "";

        }
        prefix=prefix+fpre;
        for(int i=1;i<minlength;i++){
            fpre=strs[0].charAt(i);
            for(String st: strs){
                if(st.charAt(i)!=fpre) return prefix;
            }
            prefix=prefix+fpre;
        }
        return prefix;

    }
}