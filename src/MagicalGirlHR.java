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
public class MagicalGirlHR {
    public static void main(String[] args) {
        Scanner kb = new Scanner( System.in );
        int tt = kb.nextInt(),arr[],n,i,max,j = 0;
        long pow,tPow,tPowMax = 0;
        boolean p,flag;
        while(tt-- > 0){
            n = kb.nextInt();
            arr = new int[n];
            flag = p = true;
            pow = 0;
            max = 0;
            tPowMax = 0;
            
            for(i = 0;i < n ;i++){
                arr[i] = kb.nextInt();
            }
            for(i = 0; i < n && pow>= 0 ;i++){
                if(arr[i] >= 0){
                    pow+=arr[i];
                }else{
                   if((pow+arr[i])>=0){
                       
                       if(p){
                           j = i;
                           tPow = pow+(-arr[j]);
                           j++;
                           System.out.println(tPow);
                           for(;j <n && tPow>0;j++){
                               tPow = tPow+arr[j];
                               //System.out.println(pow +" "+tPow);
                           }
                           if(j>max){
                               max = j;
                               tPowMax = tPow;
                           }
                           
                       }
                       pow+=arr[i];
                   }else{
                       if(p){
                           pow+=(-arr[i]);
                           p = false;
                       }else{
                           pow+=arr[i];
                       }
                   }
                }
              
            }
          //  System.out.println(pow +" "+tPowMax);
              if( (pow>=0) || (tPowMax>=0 && max>0) ){
                    System.out.println("She did it!");
                }else{
                    if(i>j){
                        max = i;
                    }else{
                        max = j;
                    }
                    System.out.println(max);
                }
            
            
        }
        
    }
    
    
}

