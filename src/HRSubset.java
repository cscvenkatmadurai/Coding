import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 8/2/2015.
 */
public class HRSubset {
    public static void main(String[] args) throws IOException{
        int maxValue = 65536;
        long arr[] = new long[maxValue];
        long ans;
        String add = "add",del="del",cnt = "cnt";
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(kb.readLine());
        String ip [];
        while(q-- > 0){
            ip = kb.readLine().split(" ");
            if(ip[0].equals(add)){
                arr[Integer.parseInt(ip[1])]++;

            }else if(ip[0].equals(del)){
                arr[Integer.parseInt(ip[1])]--;

            }else {
                ans = 0;
                int no = Integer.parseInt(ip[1]);


                for (int i = 0; i < maxValue && i <=no ; i++) {
                    if(arr[i] > 0 &&  (i&no) == i   ){
                        ans += (long)arr[i];
                    }

                }

                System.out.println(ans);

            }


        }
    }
}
