class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] roman={'I','V','X','L','C','D','M'};
        int[] value={1,5,10,50,100,500,1000};
        for(int i=0;i<roman.length;i++){
            map.put(roman[i],value[i]);
        };

        int sum=0;
        int prev=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-1;i>=0;i--){
            if(prev>map.get(s.charAt(i))) sum-=map.get(s.charAt(i));
            else sum+=map.get(s.charAt(i));
            prev=map.get(s.charAt(i));
        }
        return sum;
    }
}