class Solution {
    public boolean isPalindrome(int x) {
        String sx= Integer.toString(x);
        StringBuilder sb= new StringBuilder(sx);
        StringBuilder rsx =sb.reverse();
        byte s=(byte)sx.length();
        for(byte i=0;i<s/2;i++){
            if(rsx.charAt(i)!=sx.charAt(i)){
                return false;
            }
        }
        return true;
    }
}