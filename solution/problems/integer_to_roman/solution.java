class Solution {
    public String intToRoman(int num) {
    
        char[] roman={'I','V','X','L','C','D','M'};
        int[] value={1,5,10,50,100,500,1000};
        StringBuilder res = new StringBuilder("");


        int index=value.length-1;
        while(num!=0 && index>=0){
            char check=Integer.toString(num).charAt(0);;
            if(check=='4'||check=='9'){
                if(check=='4'){
                    if(num>=value[index]){
                        int diff=value[index+1]-value[index];
                        num-=diff;
                        res.append(roman[index]);
                        res.append(roman[index+1]);
                    }else index--;
                }
                else{
                    if(num>=value[index]){
                        int diff=value[index+1]-value[index-1];
                        num-=diff;
                        res.append(roman[index-1]);
                        res.append(roman[index+1]);
                    }else index--;
                }
            }else{
                if(num>=value[index]){
                    num-=value[index];
                    res.append(roman[index]);
                }else index--;
            }
        }
        return res.toString();
    }
}