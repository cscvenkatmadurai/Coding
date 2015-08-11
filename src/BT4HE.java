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
import java.math.BigInteger;
public class BT4HE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),ip[],no[],i,j,k;
        String t1,t11[],t2,t22[];
        BigInteger ans;
        while(tt-- >0){
            ans = new BigInteger("1");
            t1 = kb.readLine();
            t11 = t1.split(" ");
            ip = new int[4];
            for(i = 0;i < 4;i++){
                ip[i] = Integer.parseInt(t11[i]);
            }
            t2 = kb.readLine();
            t22 = t2.split(" ");
            no = new int[ip[0]];
            for(i = 0;i < ip[0];i++){
                no[i] = Integer.parseInt(t22[i]);
               
            }
            for(i = 0; i < ip[0];i++){
                
                if(i%ip[1] == 0){
                    ans = ans.mod(new BigInteger(t11[3]));
                    ans = ans.pow(ip[2]);
                    ans = ans.mod(new BigInteger(t11[3]));
                    
                }
                ans = ans.multiply(new BigInteger( t22[i]));
                
            }
            System.out.println(ans.mod(new BigInteger(t11[3])) );
        }
    }
}
