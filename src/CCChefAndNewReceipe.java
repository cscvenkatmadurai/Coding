/**
 * Created by HARISH on 5/8/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 class CCChefAndNewReceipe {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt( kb.readLine() ),minvalue = 2,i;
        long sum,min,no;
        String arr[];
        while(tt-- >0 ){
            no = Long.parseLong( kb.readLine() );
            arr = kb.readLine().split(" ");
            min = Long.MAX_VALUE;
            sum = 0;
            for ( i = 0; i < arr.length && Long.parseLong(arr[i]) >= 2; i++) {
                sum += Long.parseLong(arr[i]);
                if( min > Long.parseLong(arr[i] ) ){
                    min = Long.parseLong(arr[i] );

                }
            }
            if(i != arr.length){
                System.out.println("-1");
            }else{
                System.out.println(sum-(min-2));
            }
        }
        
    }
}
