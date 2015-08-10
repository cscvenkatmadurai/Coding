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
public class KaranAndStringHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine()),i;
        char ch;
        String temp;
        while(tt-- > 0){
            temp = kb.readLine();
            i = 0;
            while(i < temp.length()){
                System.out.print(temp.charAt(i));
                ch = temp.charAt(i);
                while((++i < temp.length()) && ch == temp.charAt(i));
                
                
            }
            System.out.println();
            
        }
    }
}
