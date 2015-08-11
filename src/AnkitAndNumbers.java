/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.math.BigInteger;
public class AnkitAndNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),ipNo;
        BigInteger power,no;
        String two = "2",one = "1";
        while(tt-- > 0){
            ipNo = Integer.parseInt(kb.readLine());
            power = new BigInteger("2");
            power = power.pow(ipNo);
            power = power.divide(new BigInteger(two));
            no = new BigInteger(Integer.toString(ipNo));
            no = no.multiply( no.add(new BigInteger(one) ) ) ;
            no = no.divide(new BigInteger(two));
            no = no.multiply(power);
            System.out.println(no);
        }
        
        
    }
}
