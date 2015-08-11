import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by HARISH on 8/5/2015.
 */
public class HEGameOfRiches {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine());
        int arr[];
        ArrayList<Integer> group[];
        int personWealth,playerGroup = 0,ans = 0;
        while(tt-- > 0){
            playerGroup = ans = personWealth = 0;
            String ip[] = kb.readLine().split(" ");
            group = new ArrayList[Integer.parseInt(ip[1])];
            ip = kb.readLine().split(" ");
            arr = new int[ip.length];
            personWealth = Integer.parseInt(ip[0]);
            for (int i = 0; i < ip.length; i++) {
                arr[i] = -Integer.parseInt(ip[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < group.length ; i++) {
                group[i] = new ArrayList<>();
            }
            for (int i = 0,g = 0; i < arr.length; i++,g++) {
                if(g==group.length){
                    g = 0;
                }
                if(-arr[i]== personWealth
                        && playerGroup == 0

                        ){
                    playerGroup = g;

                }
                group[g].add(-arr[i]);
            }
            for(int i = 0; i < group[playerGroup].size();i++){
                if(group[playerGroup].get(i) > personWealth){
                    ans++;
                }

            }
            System.out.println(ans);

        }
    }
}
