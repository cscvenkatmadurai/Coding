import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by HARISH on 7/24/2015.
 */
public class JohnAndBags implements Comparable<JohnAndBags>{
    int x,y;

    public JohnAndBags(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(JohnAndBags ob){
        if(this.x == ob.x){
            if(this.y < ob.y){
                return -1;
            }else if(this.y > ob.y){
                return 1;
            }else{
                return 0;
            }

        }else{
            if(this.x < ob.x){
                return -1;
            }else if(this.x > ob.x){
                return 1;
            }else{
                return 0;
            }
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),no;
        String ip[];
        boolean ans;
        JohnAndBags arr[];
        while(tt-- > 0){
            no  = Integer.parseInt(kb.readLine());
            arr = new JohnAndBags[no];
            for (int i = 0; i < arr.length ; i++) {
                ip = kb.readLine().split(" ");
                arr[i] = new JohnAndBags(Integer.parseInt(ip[0]),Integer.parseInt(ip[1]));

            }
            ans = true;
            Arrays.sort(arr);
            for (int i = 1; i < arr.length && ans; i++) {
                if(arr[i].x <= arr[i-1].y){
                    ans = false;
                }
            }
            if(ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }



       }

}


}
