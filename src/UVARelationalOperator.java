/**
 * Created by HARISH on 5/11/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UVARelationalOperator {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine());
        String temp[];
        while (tt-- > 0){
            temp = kb.readLine().split(" ");
            if(Long.parseLong(temp[0]) > Long.parseLong(temp[1]) ){
                System.out.println(">");
            }
            else if ((Long.parseLong(temp[0]) < Long.parseLong(temp[1]) )) {
                System.out.println("<");
            }else{
                System.out.println("=");
            }
        }
    }
}
