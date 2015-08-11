import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by HARISH on 8/3/2015.
 */
public class HEStairCaseNit {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt  = Integer.parseInt(kb.readLine());
        long no;
        String ip[];
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            if( (Math.min(Integer.parseInt(ip[2]),Integer.parseInt(ip[3]))<= Math.min(Integer.parseInt(ip[0]),Integer.parseInt(ip[1]))) && (Math.max(Integer.parseInt(ip[2]), Integer.parseInt(ip[3]))<= Math.max(Integer.parseInt(ip[0]), Integer.parseInt(ip[1])))  ){
                System.out.println("Possible");
            }else{
                System.out.println("Not Possible");
            }

        }

    }
}
