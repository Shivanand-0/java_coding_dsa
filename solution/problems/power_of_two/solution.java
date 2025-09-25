class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        double x= Math.log(n)/Math.log(2);
        int ix= (int) x;
        double frac=x-ix;
        if(frac<1e-9) return true;
        else return false;
    }
}