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
public class PowerHouseHE {
    public static long findFactor(BigInteger number) {
        BigInteger x = new BigInteger("2");
        long totalFactors = 1;
        while (x.multiply(x).compareTo(number) <= 0) {
            int power = 0;
            while (number.mod(x).equals(BigInteger.ZERO)) {
                power++;
                number = number.divide(x);
            }
            totalFactors *= (power + 1);
            x = x.add(BigInteger.ONE);
        }
        if (!number.equals(BigInteger.ONE)) {
            totalFactors *= 2;
        }
        return totalFactors;
        

    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in) );
        int tt = Integer.parseInt( kb.readLine() ),i,j,no[] = new int[tt],max = 0;
        boolean arr[] = new boolean[tt];
        long fac;
        for(i = 0;i < tt;i++){
           no[i] = Integer.parseInt( kb.readLine() );
           if(no[i]> max){
               max = no[i];
           }
        }
         arr = new boolean[max];
        
        for(i = 0;i < max;i++){
            fac = findFactor( new BigInteger(Integer.toString(i+1)));
            arr[i] = fac%2 != 0;
        }
        for( i = 0;i < tt;i++){
            for(j = 0; j < no[i];j++){
                if(arr[j]){
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
                
    }
    
}
