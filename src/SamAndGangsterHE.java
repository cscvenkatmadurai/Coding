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
public class SamAndGangsterHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader ( System.in ));
        int tt = Integer.parseInt( kb.readLine() ),n,sP,i,ans;
        ArrayList <Integer>arr ;
        String pow,power[],l1,l11[];
        while( tt-- > 0){
            l1 = kb.readLine();
            l11 = l1.split(" ");
            pow  = kb.readLine();
            power = pow.split(" ");
            ans = 0;
            arr = new ArrayList<>();
            for( i = 0; i < power.length;i++){
                arr.add(Integer.parseInt( power[i] )) ;
                
            }
            if( arr.indexOf(Integer.parseInt( l11[1]) ) == -1 ){
                System.out.println("NO "+ans);
            }else{
                for(i = 0;i < arr.size();i++){
                    if(Integer.parseInt( l11[1]) < arr.get(i)){
                        ans++;
                    }
                }
                System.out.println("YES "+ans);
            }
            
        }
        
    }
}
