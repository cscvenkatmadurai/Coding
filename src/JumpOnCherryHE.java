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
        
public class JumpOnCherryHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine()),x,y;
        long i,xAns,yAns;
        boolean flag;
        String temp,t1[];
        while(tt-- > 0){
            temp = kb.readLine();
            t1 = temp.split(" ");
            flag = true;
            x = Integer.parseInt(t1[0]);
            y = Integer.parseInt(t1[1]);
            for(i = 1;flag;i++){
                xAns = x*i;
                yAns = y*( (i*(i+1))/2);
                if(xAns == yAns){
                    System.out.println(i);
                    flag = false;
                    
                }
                
            }
        }
    }
}
