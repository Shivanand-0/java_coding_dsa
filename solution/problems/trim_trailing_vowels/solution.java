class Solution {
    public String trimTrailingVowels(String s) {
        boolean flag=false;
        HashSet<Character> set =new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        StringBuilder sb= new StringBuilder();
        char prev='a';
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(set.contains(s.charAt(i))){
                    count++;               
            }else break;  
        }
        for(int i=0;i<s.length()-count;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}


// if(set.contains(s.charAt(i))){
//                 if(!flag){
//                     flag=true;
//                     prev=s.charAt(i);
//                     count++;
//                 }else{
//                     flag=true;
//                     count++;
//                 }                
//             }else {
//                 if(count==1) sb.append(prev);

//                 count=0;
//                 flag= false;
//                 sb.append(s.charAt(i));
//             }  