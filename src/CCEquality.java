/**
 * Created by HARISH on 4/20/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 class CCEquality {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt(kb.readLine()),n;
        long arr[],sum;
        String temp[];
        while(tt-- >0  ){
            n = Integer.parseInt(kb.readLine());
            temp = kb.readLine().split(" ");
            arr = new long[n];
            sum = 0;
            for (int i = 0; i <n ; i++) {
                arr[i] = Long.parseLong(temp[i]);
                sum+=arr[i];

            }
            sum/=(n-1);
            for (int i = 0; i < n ; i++) {
                System.out.print( (sum-arr[i]) +" ");

            }
            System.out.println();
        }
    }
}
