/**
 * Created by HARISH on 7/18/2015.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class TestFuncode {
    public static boolean prime(long n){

        boolean flag =  true;
        if(n == 1){
            flag = false;
        }else if(n ==2){
            flag = true;
        }else {
            for (long i = 2; i <=
                    //Math.ceil(Math.sqrt(n) )
                    n/2
                    && flag; i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args)  throws IOException{
      //  long ans = 0L;
       // Scanner kb = new Scanner(System.in);
       // int tt = kb.nextInt();

    /*    for (int i = 0; i <= 20 ; i++) {
            ans += Math.pow(3,i);
        }
        System.out.println(ans<<1);*/
       /* for (int i = 0; i < tt ; i++) {
            long n = kb.nextLong();
            ans =(long) Math.pow(3, n-1) <<1L;
            System.out.println(ans);
        }*/

        /*
        long stime = System.currentTimeMillis();


        //System.out.println(1<<25);
        long etime = System.currentTimeMillis();
        System.out.println(etime-stime +"ms ");
         stime = System.currentTimeMillis();
        System.out.println( (one/3+one/5)-one/15 );

         etime = System.currentTimeMillis();
        System.out.println(etime - stime);*/
        /*long ans = 0;
        long stime = System.currentTimeMillis();
        for (long i = 2 ; i <= 10

                ;i++){
            if(prime(i)) {ans++;
                System.out.println(i);}
        }
        System.out.println();
        System.out.println(ans);*/

        //for (long i = 0 ; i < Math.sqrt( (long)Math.pow(10,17) )  ;i++);

        long stime = System.currentTimeMillis(),ans =0;
        for (int k = 0; k < 100; k++) {


            for (int i = 1; i <= 1000; i++) {
                for (int j = 0; j < 1000; j++) {

                }


            }
        }



            long etime = System.currentTimeMillis();
        System.out.println(etime-stime +"ms ");

    }
}
