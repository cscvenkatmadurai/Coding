import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 6/26/2015.
 */
public class HEMinisetPalindrome {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in) );
        int tt = Integer.parseInt(kb.readLine());
        String str;
        int cs[],count;
        boolean firstOdd;
        while (tt-- > 0){
            int no = Integer.parseInt( kb.readLine() );
            str = kb.readLine();
            cs = new int[26];
            for (int i = 0; i < str.length() ; i++) {
                cs[str.charAt(i)-97]++;
            }
            firstOdd = true;
            count = 0;
            for (int i = 0; i < cs.length ; i++) {

                if(cs[i]%2 !=0){
                    if(!firstOdd){
                        count++;
                    }
                    firstOdd = false;

                }
            }
            System.out.println(count);

        }

    }
}
