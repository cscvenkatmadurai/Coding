/**
 * Created by HARISH on 6/16/2015.
 */
import java.io.*;
import java.util.*;
public class HEMonkLoveForFood {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() );
        ArrayList <Integer> stack = new ArrayList<>();
        String ip[];
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            if(ip.length == 1){
                if(stack.size()==0){
                    System.out.println("No Food");
                }else{
                    System.out.println(stack.remove(stack.size()-1));
                }
            }else{
                stack.add(Integer.parseInt(ip[1]));
            }
        }
    }
}
