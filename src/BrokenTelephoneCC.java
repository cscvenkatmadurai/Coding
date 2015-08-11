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
 class BrokenTelephoneCC {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine()),n,i;
        long arr[],ans;
        while(tt -- > 0){
            n = Integer.parseInt( kb.readLine() );
            args = kb.readLine().split(" ");
            arr = new long[n];
            ans = 0;
            for(i = 0;i < n;i++){
                arr[i] = Long.parseLong( args[i] );
                
            }
            if(arr[0]!=arr[1]){
                ans=2;
            }
            for(i = 1 ; i<arr.length-1;i++){
                if(arr[i]!=arr[i+1]){
                    if(arr[i]!=arr[i-1]){
                        ans+=1;
                    }else{
                        ans+=2;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    
    
}
