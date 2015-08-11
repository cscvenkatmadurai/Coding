/**
 * Created by HARISH on 5/13/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class UvaEcologicalPemium {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt( kb.readLine() ),no;
        long ans;
        String arr[];
        while (tt-- > 0){
            no = Integer.parseInt(kb.readLine());

            ans = 0;
            for (int i = 0; i < no ; i++) {
                arr = kb.readLine().split(" ");
                ans+=(Long.parseLong(arr[0])*Long.parseLong(arr[2]));
            }
            System.out.println(ans);
        }

    }
}
