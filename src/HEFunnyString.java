/**
 * Created by HARISH on 6/23/2015.
 */
import java.io.*;
public class HEFunnyString {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ) );
        String ip;
        int tt = Integer.parseInt(kb.readLine()),i,j;
        while(tt-- > 0){
            ip = kb.readLine();
            for ( i = 0 , j = ip.length()-1; i <j &&  ( Math.abs( ip.charAt(i+1) - ip.charAt(i) ) == Math.abs( ip.charAt(j-1) - ip.charAt(j)  ))  ; i++,j--) ;
//            System.out.println(i+" "+j);
            if( i >= j){
                System.out.println("Funny");
            }else{
                System.out.println("Not Funny");
            }

        }
    }
}
