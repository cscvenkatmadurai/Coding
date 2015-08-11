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
public class BargavAndGreHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        String word = kb.readLine(),ref;
        int tt = Integer.parseInt(kb.readLine()),syn = 0,ant = 0;
        while(tt -- > 0){
            ref = kb.readLine();
           if(ref.length() == word.length()){
               if(ref.charAt(0) == word.charAt(0)){
                   syn++;
               }else if(ref.charAt(0)-3 >=97){
                   if(ref.charAt(0)-3 == word.charAt(0)){
                       ant++;
                   }else if( (ref.charAt(0)-3+26) == word.charAt(0)){
                       ant++;
                   }
               }
           }
        }
        System.out.println(syn+" "+ant);
    }
}
