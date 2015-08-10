import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by HARISH on 8/8/2015.
 */
class CVGrandpaAndCandy {
    static long factorial[] = new long[1001],mod = 1000000007;
    public static void preComputeFactorial(){
        factorial[0]= 1;
        for (int i = 1; i < 1001; i++) {
            factorial[i] = ((factorial[i-1])*(long)i)%mod;
        }


    }
    public static long modular_pow(long base, long exponent, long modulus)
    {
        long result = 1;
        while (exponent > 0)
        {
            if (exponent % 2 == 1)
                result = (result * base) % modulus;
            exponent = exponent >> 1;
            base = (base * base) % modulus;
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int tt;
        int n,k;
        double ans = 0;
        tt = kb.nextInt();
        preComputeFactorial();

        while (tt-- > 0){
            n = kb.nextInt()/2;
            k = kb.nextInt()/2;
            ans = 0;
            if(n>=k) {
                ans += (factorial[n] * modular_pow((factorial[n - k] * factorial[k]) % mod, mod - 2, mod));
                // ans += factorial[n]/(factorial[n-k]*factorial[k]);
                ans %= mod;
                ans += (factorial[n] * modular_pow(factorial[n - k], mod - 2, mod));
                //   ans += factorial[n]/factorial[n-k];
                ans %= mod;
            }
            System.out.println((long)ans);
        }


    }

}
