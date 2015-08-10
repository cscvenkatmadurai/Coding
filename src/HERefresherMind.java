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
import java.util.Arrays;
public class HERefresherMind {
    public static void main(String[] args) throws Exception{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int n = Integer.parseInt( kb.readLine() ),i;
        long ans;
        String temp[ ] = kb.readLine().split(" ");
        ans = Long.parseLong( temp[0] );
        for(i = 1; i < temp.length;i++){
            ans+=(1+(  ( Long.parseLong(temp[i])-1)*(i+1) ) );
        }
        System.out.println(ans);
        
        
        
    }
    
    
}
