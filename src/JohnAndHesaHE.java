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
public class JohnAndHesaHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in) );
        int tt = Integer.parseInt(kb.readLine() ),x,p,ans;
        String temp,t1[];
        while(tt-- > 0){
            temp =  kb.readLine();
            t1 = temp.split(" ");
            x = Integer.parseInt( t1[0] );
            p = Integer.parseInt( t1[1] );
            ans = 0;
            while(x%p==0 ){
                x/=p;
                ans++;
            }
            if(x ==1 ){
                x = 0;
            }
            System.out.println(ans+" "+x);
        }
    }
}
