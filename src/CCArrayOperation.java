/**
 * Created by HARISH on 4/19/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
class CCArrayOperation {
    public static void main(String arg[]) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        ArrayList <Integer> arr;
        String temp[];
        int n,m,ar[],i,count;
        temp = kb.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        temp = kb.readLine().split(" ");
        ar = new int[n];
        for(i = 0 ; i< n;i++){
            ar[i] = Integer.parseInt(temp[i]);
        }
        for(i = 0; i < m;i++){
            n = Integer.parseInt(kb.readLine()) -1;
            arr = new ArrayList<>();
            count = 0;
            for(;n < ar.length;n++){
                if( arr.lastIndexOf(ar[n]  ) == -1){
                    count++;
                    arr.add(ar[n]);
                }
            }
            System.out.println(count);
        }

    }
}
