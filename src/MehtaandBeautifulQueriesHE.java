/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
public class MehtaandBeautifulQueriesHE {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
        //int n = kb.nextInt(),q = kb.nextInt();
        String input = ip.readLine(),input1[];
        input1 = input.split(" ");
        
        int n = Integer.parseInt(input1[0]),q = Integer.parseInt(input1[1]);
        int arr1[] = new int[n],arr2[] = new int[n],i,j,k,t1[],t2[],a,b;
        BigInteger ans,temp1;
        String s1 = ip.readLine(),s11[];
        String s2 = ip.readLine(),s22[],s33[],temp;
        s11 = s1.split(" ");
        s22 = s2.split(" ");
        for(i = 0;i < n;i++){
            arr1[i] = Integer.parseInt(s11[i]);
        }
        for(i = 0;i < n;i++){
            arr2[i] = Integer.parseInt(s22[i]);
        }
        while(q-- >0){
            temp = ip.readLine();
            s33 = temp.split(" ");
            //a = kb.nextInt();
            //b= kb.nextInt();
            a = Integer.parseInt(s33[0]);
            b = Integer.parseInt(s33[1]);
            ans = new BigInteger("0");
            t1 = new int[(b-a)+1];
            t2 = new int[(b-a)+1];
            for(i = a-1,j = 0;i < b;i++,j++){
                t1[j] = arr1[i];
            }
            for(i = a-1,j = 0;i < b;i++,j++){
                t2[j] = arr2[i];
            }
            Arrays.sort(t1);
            Arrays.sort(t2);
            
            for(i = t1.length-1;i >= 0;i--){
               temp1 = new BigInteger(Integer.toString(t1[i]));
               temp1 = temp1.multiply(new BigInteger(Integer.toString(t2[i])));
                ans  = ans.add(temp1);
                //answer+=(t1[i]*t2[i]);
            }
            System.out.println(ans);
            
        }
    }
}
