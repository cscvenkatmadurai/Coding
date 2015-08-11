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
 class SaourabgMultiplicationCC {
     public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
        return reverse;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(  new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() ),i;
        long mul,carry,temp;
        String ans;
        while(tt-- > 0){
            ans = "";
            args = kb.readLine().split(" ");
            carry = 0;
            for(i = args[0].length()-1 ; i >= 0;i--){
                if( args[0].charAt(i)== args[1].charAt(0) ){
                    temp = Character.getNumericValue(args[0].charAt(i))+Character.getNumericValue(args[1].charAt(0))+carry;
                   
                }else{
                    temp = (  Character.getNumericValue(args[0].charAt(i))*Character.getNumericValue(args[1].charAt(0)) )+carry;
                }
                
                 carry = temp/10;
                 
                 ans +=(temp%10);
                // System.out.println("ans"+ans+"temp="+temp+"carry"+carry);
            }
            if(carry!=0){
                ans+=carry;
            }
            
            ans = reverse(ans);
            System.out.println(( Long.parseLong(args[0])*Long.parseLong(args[1]) )+Long.parseLong(ans));
        }
        
        
    }
}
