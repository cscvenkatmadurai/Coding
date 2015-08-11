/**
 * Created by HARISH on 4/23/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HRPrime {

    public static boolean prime(long n){

        boolean flag =  true;
        if(n == 1){
            flag = false;
        }else if(n ==2){
            flag = true;
        }else {
            for (long i = 2; i <= Math.ceil(Math.sqrt(n)) && flag; i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }
    public static long sum(long n ){
        long sum = 0;
        while(n>0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt(kb.readLine());
        long count = 0;
        String temp[];
        while (tt-- > 0){
            temp = kb.readLine().split(" ");
            count =0;
            for (long i = Long.parseLong(temp[0]); i <= Long.parseLong(temp[1])  ; i++) {
                if(prime(i)  && prime(sum(i)) ) {
                    count++;
               //     System.out.println(i+" "+prime(i));
                }
            //    System.out.println(Math.ceil(Math.sqrt(2)));


            }
            System.out.println(count);
        }

    }
}
