class Solution {
    public String reverseWords(String s) {
        String[] words= s.split(" ");
        int[] counter= new int[words.length];
        for(int j=0;j<words.length;j++){
        for(int i=0;i<words[j].length();i++){
            if(words[j].charAt(i)=='a'||words[j].charAt(i)=='e'||words[j].charAt(i)=='i'||words[j].charAt(i)=='o'||words[j].charAt(i)=='u'){
                counter[j]++;
            }
        }
        }
        StringBuilder sb=new StringBuilder(words[0]);
        for(int i=1;i<counter.length;i++){
            sb.append(" ");
            if(counter[i]==counter[0]){
                for(int j=words[i].length()-1;j>=0;j--){
                    sb.append(words[i].charAt(j));
                }
            }else sb.append(words[i]);
        }
        return sb.toString();
    }
}