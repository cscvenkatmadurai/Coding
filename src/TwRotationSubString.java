import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 7/10/2015.
 */

public class TwRotationSubString {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in ));
        String s1 = kb.readLine();
        String s2 = kb.readLine();
        boolean flag = false;
        String rotatedString;
        for (int i = 1; i <= s1.length() ; i++) {

            rotatedString = s1.substring(i) + s1.substring(0,i);
            System.out.println(rotatedString);
            if(rotatedString.equals(s2)){
                System.out.println("Success");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Failure");
        }
    }
}
