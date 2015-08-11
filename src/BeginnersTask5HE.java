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
public class BeginnersTask5HE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int x,y,z;
        x = Integer.parseInt(kb.readLine() );
        y = Integer.parseInt(kb.readLine() );
        z = Integer.parseInt(kb.readLine() );
        if( (x!=1) &&(y!=1 ) && (z!=1) ){
            System.out.println(x*y*z);
        }else if((x==1) && (y==1) && (z==1)){
            System.out.println(x+y+z);
        }else if(x==1){
            System.out.println((x+y)*z);
        }else if(z == 1){
            System.out.println(x*(y+z));
        }else{
            if(x<z){
                System.out.println((x+y)*z);
            }else{
                System.out.println(x*(y+z));
            }
        }
    }
}
