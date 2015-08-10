/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class NotFiboHE {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine() );
        long n,count,i,t1,t2,a,b,c,t,val;
        ArrayList <Long> arr;
              
        boolean flag;
        while( tt-- > 0){
            n = Long.parseLong(kb.readLine());
           
            a = 2;
            b = 3;
            count = 0;
            val = 0;
            while(count<n){
                c = a+b;
                for(t = b+1;t<c && count<n ;t++){
                    count++;
                    val = t;
                }
                a = b;
                b = c;
            }
            System.out.println(val);
                    
        }
    }
}
