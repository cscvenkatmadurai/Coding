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
public class GajadarWeakMemoryHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),n,i,arr[],ans;
        String city;
        while(tt-- > 0){
            n = Integer.parseInt(kb.readLine() );
            arr = new int[26];
            ans = 0;
            while(n-- > 0){
                city = kb.readLine();
                arr[city.charAt(0)-65]++;
                
            }
        //     ans = ceil( log10(2*3.141592653589793*n)/2 + n*log10(n/2.7182818284590452353) );
            for(i = 0;i < 26;i++){
                if(arr[i] == 1){
                    ans++;
                }
            }
            System.out.println(ans);
            
        }
    }
}
