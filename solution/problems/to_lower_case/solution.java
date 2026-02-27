class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase();
        // or
        StringBuilder sb =new StringBuilder();
        char c;
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);

            if(c>=65 && c<=90 ){
                sb.append((char)(c+32));
            }else sb.append(c);
        }
        return sb.toString();
    }
}