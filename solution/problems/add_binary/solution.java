import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger  aI=new BigInteger(a,2);
        BigInteger  bI=new BigInteger(b,2);
        BigInteger  sum=aI.add(bI);
        return sum.toString(2);
    }
}