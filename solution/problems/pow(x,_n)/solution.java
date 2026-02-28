class Solution {
    public double myPow(double x, int N) {
        long n=N;
        if (n < 0) {
            n=-n;
            x=1/x;
        }
        return helper(x,n);
    }
    private double helper(double x, long n) {
        if(n==0) return 1;
        if (n == 1) return x;
        double temp=helper(x, n/2);
        if(n%2==0){
            return (temp*temp);
        }else{
            return (x*temp*temp);
        }
    }
}