/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */

import java.util.Scanner;
public class PositiveNoHE {
    public static void main(String[] args) {
           Scanner ip = new Scanner(System.in);
        int tt = ip.nextInt(),n,ans,i,value,j;
        String val,arr[];
     
        while(tt-- > 0){
            n = ip.nextInt();
            ans = 0;
                       
            for(i = 0;i < n;i++){
                value = ip.nextInt();
                if(value > 0){
                    ans++;
                }
            }
            System.out.println(ans);
        }
            
        
        
    }
    
}
