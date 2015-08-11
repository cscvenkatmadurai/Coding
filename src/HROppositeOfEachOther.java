/**
 * Created by HARISH on 5/8/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HROppositeOfEachOther {


    public static void main(String[] args)  throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in    )   );
        int tt = Integer.parseInt( kb.readLine() );
        String ip[],data;
        long val;
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            data = kb.readLine();
            val  = Long.parseLong( ip[1] ) ;
            for (int i = 0; i < data.length() ; i++) {
                if(data.charAt(i) == 'B'){
                    val*=-1;
                }
            }
            System.out.println(val);
        }
    }
}