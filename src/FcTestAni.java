/**
 * Created by HARISH on 7/21/2015.
 */
import com.sun.deploy.util.ArrayUtil;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FcTestAni {
    public static void main(String[] args) throws Exception{
      //  Scanner kb = new Scanner(new File("test.txt"));
        Scanner kb = new Scanner(System.in);
        int tt = kb.nextInt(),n = 0;
        long evenNo = 0,oddNo = 0,no;
        long stime = System.currentTimeMillis();
        while (tt-- > 0){
            n = kb.nextInt();
            evenNo = oddNo = 0;
           /*for (int i = 0; i < n ; i++) {

                no = kb.nextLong();
              if(no%2 == 0){
                   evenNo++;
               }else{
                   oddNo++;
               }
            }

        /*    for (int i = 0; i < 100000; i++) {
                int x= 2;
            }
           for (int i = 0; i < 100000 ; i++) {
                for (int j = i+1; j < 100000; j++) {
                        if( (i^j) %2 == 0);
                }
            }


            System.out.println( (evenNo*(evenNo-1)/2)+(oddNo*(oddNo-1)/2) );*/
               int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i ] = kb.nextInt();
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
             //   System.out.println("in loop");
                for (int j = i+1; j < n; j++) {
                    if( (arr[i]^arr[j])%2 ==0){
                        ans++;
                    }
                }
            }
            System.out.println(ans);


        }

        long etime = System.currentTimeMillis();
      //  System.out.println(etime-stime);
    }
}
