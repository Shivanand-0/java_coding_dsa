class Solution {
    public int bestClosingTime(String customers) {
        int[] weight=new int[customers.length()];
        
        if(customers.charAt(customers.length()-1)=='Y') weight[customers.length()-1]=1;
        else weight[customers.length()-1]=-1;
        for(int i=(customers.length()-2);i>=0;i--){
            if(customers.charAt(i)=='Y'){
                weight[i]=weight[i+1]+1;
            }
            else{
                weight[i]=weight[i+1]-1;
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < customers.length(); i++) {
            min = Math.min(min, weight[i]);
        }
        if(min<=0){
        for (int i = 0; i < customers.length(); i++) {
            if(weight[i]==min) return i;
        }
        }
        return customers.length();

    }
}