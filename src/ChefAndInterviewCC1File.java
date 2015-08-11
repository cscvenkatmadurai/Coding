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
import java.io.File;
import java.io.PrintWriter;
 class ChefAndInterviewCC1File {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        //int tt = Integer.parseInt( kb.readLine() );
        PrintWriter out = new PrintWriter( new File("ChefANdInterviewCC1File.txt") );
        long i,ans,j,k,no,f,p,temp;
        boolean pFlag;
        
        //while(tt-- > 0){
        for(k = 1;k<=1000000000;k++){
            //no = Long.parseLong( kb.readLine() );
            no = k;
            ans = 1;
            if(no == 1){
                ans = 1;
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
                    //    System.out.println("factor"+f+"pow"+p);
                        ans*= ( ( Math.pow(f, p+1)-1 )/(f-1) );
                    //    System.out.println( "("+Math.pow(f, p+1)+"-1"+")/"+(f-1) );
                    //    System.out.println("i"+i+"ans"+ans);
                    }
                    
                }
                 if(temp>1 && !pFlag){
                    ans*=( ( Math.pow(temp, 1+1)-1 )/(temp-1) );
                }
                
                if(pFlag){
                    ans*=( ( Math.pow(no, 1+1)-1 )/(no-1) );
                }
               
            }
             System.out.println(ans);
             out.println(ans);
        }
        out.close();
    }
}
