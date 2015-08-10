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
 
public class HECricketField {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine()),x,y,i;
        boolean flag;
        String temp[];
        while(tt-- > 0){
            temp = kb.readLine().split(" ");
            x = Integer.parseInt(temp[0]);
            y = Integer.parseInt(temp[1]);
            flag = true;
            if(x == 1){
                flag = false;
            }
            for(i = 2 ; i <= (int)Math.ceil(Math.sqrt(x));i++){
                if(x%i == 0){
                    flag = false;
                }
            }
            if( (flag && (x+1 == y) ) ){
                System.out.println("YES");
                
            }else{
                System.out.println("NO");
            }
                
                
        }
            
            
        
        
    }
    
}
