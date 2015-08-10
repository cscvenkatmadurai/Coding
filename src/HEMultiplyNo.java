import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 7/10/2015.
 */
public class HEMultiplyNo {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),x,y,z,count = 0,min,max;
        String arr[];
        while(tt-- > 0){
            count = 0;
            arr = kb.readLine().split(" ");
            z = Integer.parseInt(arr[0]);
            x = Integer.parseInt(arr[1]);
            y = Integer.parseInt(arr[2]);
            if(x < y){
                min = x;
                max = y;
            }else{
                min =y;
                max = x;
            }
            for (int i = 1; i <= min  ; i++) {

                if(z%i == 0 && (z/i <= max )){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
