/**
 * Created by HARISH on 6/20/2015.
 */
import java.io.*;

public class HRProjWork {
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in )) ;
        long input1[],input2[],ans = 0,temp,ans2 = 0;
        String ipp1[] = scan.readLine().split(" "),ipp2[] = scan.readLine().split(" ");
        input1 = new long[ipp1.length];
        for (int i = 0; i < ipp1.length ; i++) {
            input1[i] = Long.parseLong(ipp1[i]);
        }
        input2 = new long[ipp2.length];
        for (int i = 0; i < ipp2.length ; i++) {
            input2[i] = Long.parseLong(ipp2[i]);
        }
        for (int i = 0; i < input2.length ; i++) {
            temp = input2[i]*input1[1];
            input1[1] -= input1[2];
            //System.out.println(temp+" "+(i+1));
            if(temp > ans){
                ans = temp;
                ans2 = (i+1);
            }

        }
        System.out.println(ans2);
    }
}
