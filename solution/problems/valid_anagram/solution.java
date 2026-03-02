class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cArr1=s.toCharArray();
        char[] cArr2=t.toCharArray();
        Arrays.sort(cArr1);
        Arrays.sort(cArr2);
        if((Arrays.equals(cArr1,cArr2)))return true;
        return false;
    }
}