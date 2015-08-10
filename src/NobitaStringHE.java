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
public class NobitaStringHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) ) ;
        int tt = Integer.parseInt( kb.readLine() ),i;
        while(tt-- > 0){
             args = kb.readLine().split(" ");
           
            for(i = args.length-1;i>=0;i--){
                System.out.print(args[i]+" ");
            }
           
             
        }
        
    }
}
