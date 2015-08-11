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
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
public class MinScalarProductCJ {
    public static void main(String[] args) throws IOException{
        //BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedReader kb = new BufferedReader( new FileReader("MinProdLar.in") ) ;
        PrintWriter out = new PrintWriter( new File("MinScalarProdCJOp.txt") );
        long arr1[],arr2[],k = 0;
        int n,tt = Integer.parseInt(kb.readLine()),i;
        String a1[],a2[];
        long ans;
        while(tt-- > 0){
            n = Integer.parseInt( kb.readLine() );
            k++;
            a1 = kb.readLine().split(" ");
            a2 = kb.readLine().split(" ");
            arr1 = new long[n];
            arr2 = new long[n];
            for(i = 0;i < n;i++){
                arr1[i] = Long.parseLong(a1[i]);
                arr2[i] = -Integer.parseInt(a2[i]);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(i = 0;i < n;i++){
                arr2[i] = -arr2[i];
            }
            ans = 0;
            for(i = 0;i<n;i++){
                ans+=(arr1[i]*arr2[i]);
            }
            System.out.println("Case #"+k+": "+ans);
            out.println("Case #"+k+": "+ans);
            
            
            
        }
        out.close();
    }
}
