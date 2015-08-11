/**
 * Created by HARISH on 5/26/2015.
 */
import java.io.*;
public class HEChandruPlayArea {
    public static void main(String[] args)  throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in));
        int tt = Integer.parseInt( kb.readLine() );
        long no;
        while(tt-- > 0){
            no = Long.parseLong(kb.readLine());
            System.out.println((no/4) *( (no/2)-(no/4) ));
        }


    }
}
