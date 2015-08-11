/**
 * Created by HARISH on 4/30/2015.
 */



import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.regex.*;
public class HECodeMaya {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ));
        char s[] = kb.readLine().toCharArray();
        for(int i = 0; i < s.length; i++) {
            System.out.print( ( s[i] ^ (0xf0ff00f0 | (0xffffffff & 0x0f00ff0f)) ));
            System.out.print(" ");
        }

    }
}
