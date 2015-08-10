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
public class SmithNumberHR {
    static int primeFactorisation(int no){
        int i = 2,pFsum = 0;
        
        for(i = 2; i <= Math.ceil(Math.sqrt(no));i++){
            if(no%i == 0){
                while(no%i == 0){
                    pFsum+=i;
                    no/=i;
                }
            }
        }
        if(no>1){
            pFsum+=no;
        }
        return pFsum;
    }
    static int oneDigSum(int no){
        int temp = 0,ans;
        if(no<10){
            return no;
        }else{
            while(no>0){
                temp+=(no%10);
                no = no/10;
            }
            return(oneDigSum(temp));
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) ) ;
        int no = Integer.parseInt( kb.readLine() );
        if(oneDigSum(no) == oneDigSum(primeFactorisation(no))){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        
    }
}
