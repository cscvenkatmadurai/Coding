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
import java.math.BigInteger;
 class ChefAndInterviewCC1 {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() );
        long i,ans,j,k,no,f,p,temp;
        boolean pFlag;
        BigInteger a;
        
        while(tt-- > 0){
            no = Long.parseLong( kb.readLine() );
            ans = 1;
            a = BigInteger.ONE;
            if(no == 1){
                ans = 1;
                a = a.multiply(new BigInteger( Long.toString(ans) ) );
            }else{
                temp = no;
                pFlag = true;
                for(i = 2; i <= Math.ceil (Math.sqrt(   no  ) );i++){
                    if(temp%i == 0){
                        p =0;
                        f = i;
                        pFlag = false;
                        while(temp%i == 0){
                            p++;
                            temp/=i;
                        }
                       // System.out.println("factor"+f+"pow"+p);
                        ans= (long) ( ( Math.pow(f, p+1)-1 )/(f-1) );
                        a = a.multiply( new BigInteger(    Long.toString(ans) ) );
                        
                     //   System.out.println( "("+Math.pow(f, p+1)+"-1"+"S)/"+(f-1) );
                     //   System.out.println("i"+i+"ans"+ans);
                    }
                    
                }
                 if(temp>1 ){
                    ans= (long)( ( Math.pow(temp, 1+1)-1 )/(temp-1) );
                    a = a.multiply( new BigInteger(    Long.toString(ans) ) );
                }
                
              
               
            }
             System.out.println(a);
        }
    }
}
