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
public class HowToMinimizeString {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in) );
        int tt = Integer.parseInt(kb.readLine()),len,i,j,k,pos;
        boolean flag;
        char temp[],min,swap;
        String ip;
        while(tt-- >0){
            len  = Integer.parseInt(kb.readLine());
            ip = kb.readLine();
            temp = ip.toCharArray();
            flag = true;
            for(i = 0;i<temp.length && flag;i++){
               min = Character.MAX_VALUE;
               pos = Integer.MAX_VALUE;
                for(j = i;j < temp.length;j++){
                    if(min> temp[j]){
                        min = temp[j];
                        pos = j;
                    }
                }
                if(temp[i]!=min){
                    swap = temp[i];
                    temp[i] = temp[pos];
                    temp[pos] = swap;
                    flag = false;
                }
            }
            System.out.println(new String(temp));
            
        }
        
    }
}
