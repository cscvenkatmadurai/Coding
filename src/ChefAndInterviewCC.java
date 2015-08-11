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
 class ChefAndInterviewCC {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() );
        long no,i,j,ans;
        boolean flag,primeFlag;
        while(tt-- > 0){
            no = Long.parseLong( kb.readLine() );
            flag = primeFlag = true;
            ans = 0;
            for(i = 2;i <= no/2 && primeFlag;i++ ){
                if(no%i == 0){
                    ans+=i;
                    flag = false;
                    
                }
                if(i == Math.sqrt(no) && flag){
                         primeFlag = false;
                }
                
            }
            if(no == 1){
                ans+=1;
            }else{
                ans+=1;
                ans+=no;
            }
            System.out.println(ans);
            
            
        }
        
    }
}
