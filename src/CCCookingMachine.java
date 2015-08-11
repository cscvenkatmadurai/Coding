import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 8/8/2015.
 */
public class CCCookingMachine {
    public static long solveTestcase(int source,int target) {
        long ans = 0;
        while ( (source&(source-1))!=0){
                source = source>>1;//right by 1 divides by 2
                ans++;
            }
        return ans+(long) Math.abs((Math.log(source) / Math.log(2)) - (Math.log(target) / Math.log(2))); //if source and target are power
                //of two s = 16 t = 2   log2(16)=2^4=4 t = 2  log2(2)=1 4-1=3 is answer
    }
    public static void solve()throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine());
        int source,target;
        long ans;
        String ip[];
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            source = Integer.parseInt(ip[0]);
            target = Integer.parseInt(ip[1]);
            System.out.println(solveTestcase(source,target));

        }
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
