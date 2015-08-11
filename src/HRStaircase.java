/**
 * Created by HARISH on 6/29/2015.
 */
import java.io.*;
import java.util.Arrays;

public class HRStaircase {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System. in )) ;
        int n = Integer.parseInt( kb.readLine( ));
        char arr[] = new char[n];
        Arrays.fill(arr,' ');
        for(int i = n-1; i >= 0 ; i--){
            arr[i] = '#';
            for (int j = 0; j < n ; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }


    }
}
