class Solution {
    public boolean isIsomorphic(String s, String t) {
        // create hash map between s and t
        // now create t1 from s
        // compare t1 and t : if mathch->isomorphic
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            map2.put(t.charAt(i),s.charAt(i));
        }

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb1.append(map1.get(s.charAt(i)));
        }
        for(int i=0;i<s.length();i++){
            sb2.append(map2.get(t.charAt(i)));
        }
        String t1=sb1.toString();
        String s1=sb2.toString();
        if(t1.equals(t) && s1.equals(s)) return true;
        return false;
    }
}