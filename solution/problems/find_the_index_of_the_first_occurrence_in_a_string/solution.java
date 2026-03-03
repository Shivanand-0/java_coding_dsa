class Solution {
    public int strStr(String haystack, String needle) {
        int l=0, index=0;
        boolean flag=false;
        if(haystack.length()>=needle.length()){
            for(int i=0;i<haystack.length();i++){
                if(haystack.charAt(i)==needle.charAt(0)){
                    while(l!=needle.length() && (i+l)<haystack.length()){
                        if(haystack.charAt(i+l)!=needle.charAt(l)){
                            flag=false;
                            break;
                        }
                        flag=true;
                        l++;
                    }
                    if(flag==true && l==needle.length()){
                        index=i;
                        break;
                    }else {
                        flag=false;
                        l=0;
                    }
                }
            }
            
        }else flag=false;
        return flag?index:-1;
    }
}