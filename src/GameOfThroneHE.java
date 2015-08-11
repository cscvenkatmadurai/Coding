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
public class GameOfThroneHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt(kb.readLine() ),no,root;
        final int a = 1;
        while(tt-- > 0){
            no = -2 * Integer.parseInt( kb.readLine() );
            root = (int)Math.ceil( ( -a + Math.sqrt( a-( 4*a*no ) )  )/2 );
            if(root%3==0){
                System.out.println("SL");
            }else if(root%3 ==1 ){
                System.out.println("LB");
            }else{
                System.out.println("BS");
            }
                  
        }
    }
}
