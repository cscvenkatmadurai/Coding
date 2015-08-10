/**
 * Created by HARISH on 5/14/2015.
 */



import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class CCPinacho {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine()),n,arr[],Totmax, days,max;
        String ip[];
        while(tt-- > 0){
            n = Integer.parseInt( kb.readLine() );
            ip = kb.readLine().split(" ");
            days =0;
            max = 0;
            Totmax = 0;
            for (int i = 1; i < n ; i++) {
                if(Integer.parseInt(ip[i-1] )!= Integer.parseInt(ip[i] ) ){
                    days++;
                    max = 0;
                }else{
                    max++;
                }
                if(max>Totmax){
                    Totmax = max;
                }

            }
            System.out.println(Totmax);
        }

    }
}
