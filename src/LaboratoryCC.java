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
class LaboratoryCC {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt =Integer.parseInt( kb.readLine() ),i,count;
        String temp;
        args = new String[tt];
        for(i = 0; i < tt;i++){
            args[i] = kb.readLine();
            
        }
        Arrays.sort(args);
        for(i = 0 ;i < tt; ){
           // System.out.println(i);
            temp = args[i];
            count = 1;
            i++;
            while(i < tt && (temp.equals(args[i]))){
                count++;
                i++;
            }
            System.out.println(temp+" "+count);
        }
        
    }
}
