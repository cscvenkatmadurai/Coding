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

public class FindTheRingHE {
    public static void main(String[] args)  throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() ),s,m,ans;
        String temp,t[];
        while(tt-- > 0){
            temp = kb.readLine();
            t = temp.split(" ");
            if( Integer.parseInt(t[0]) == 0 ){
                 ans = Integer.parseInt(t[1])%2  ;
                  
            }else if(  Integer.parseInt(t[0]) == 1 ){
                if(Integer.parseInt(t[1])%2 == 0){
                    ans = 1;
                }else{
                    ans = 0;
                }
            }else{
                if(Integer.parseInt(t[1]) == 0){
                    ans = 2;
                }else{
                    ans = Integer.parseInt(t[1])%2;
                }
            }
            System.out.println(ans);
        }
    }
    
}
