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
public class NumberGame1HE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in));
        int tt = Integer.parseInt( kb.readLine() ),no,count;
        while(tt-- > 0){
            no = Integer.parseInt(kb.readLine() );
            count = 0;
            while(no!=1){
                count++;
                if(no%3==0){
                    no/=3;
                    
                }else if(no%2 == 0){
                    no/=2;
                }else{
                    no--;
                }
                
            }
            System.out.println(count);
        }
        
        
    }
    
}
