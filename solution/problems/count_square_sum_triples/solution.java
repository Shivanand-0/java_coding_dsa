class Solution {
    public int countTriples(int n) {
        HashSet<Integer> set =new HashSet<Integer>();
    int count=0, x;
    for(int i=1;i<=n;i++){
        set.add(i*i);
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            x=(i*i)+(j*j);
            if(set.contains(x)){count++;}
        }
    }
    return count;
    }
}