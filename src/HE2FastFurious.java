/**
 * Created by HARISH on 5/26/2015.
 */
import java.io.*;
public class HE2FastFurious {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt( kb.readLine() );
        String arr[];
        long domMax =0,brianMax = 0;
        arr = kb.readLine().split(" ");
        domMax = findMAx(arr);
        arr = kb.readLine().split(" ");
        brianMax = findMAx(arr);
        if(domMax > brianMax){
            System.out.println("Dom");
            System.out.println(domMax);
        }else if(brianMax > domMax){
            System.out.println("Brian");
            System.out.println(brianMax);
        }else{
            System.out.println("Tie");
        }
    }

    public static long findMAx(String[] arr) {
        long max = 0;
        for (int i = 1; i < arr.length; i++) {
             if ( Math.abs(Long.parseLong(arr[i]  )  -Long.parseLong(arr[i-1]  ) ) > max ){
                 max = Math.abs(Long.parseLong(arr[i]  )  - Long.parseLong(arr[i-1]  ) );
             }
        }
        return max;
    }
}
