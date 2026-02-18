package pro1;

public class NumericUtils
{
    /// @param a greater than 0
    /// @param b greater than 0
    public static long gcd(long a, long b){
        long p = a;
        long q = b;
        while (true){
            if(q==0)
                return p;
            long oldQ = q;
            q = p % q;
            p = oldQ;
        }
// Alternativní rekurzivní řešení:
//        if(b>0)
//            return gcd(b,a%b);
//        else
//            return a;
    }
}
