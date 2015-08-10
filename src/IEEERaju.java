import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by HARISH on 7/30/2015.
 */
public class IEEERaju {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        String ip[] = kb.readLine().split(" ");
        int q = Integer.parseInt(ip[1]),n = Integer.parseInt(ip[0]);
        int a,b;
        int querry[][] = new int[q][2];
        for(int i = 0; i < q;i++){
            ip = kb.readLine().split(" ");
            querry[i][0] = Integer.parseInt(ip[0]);
            querry[i][1] = Integer.parseInt(ip[1]);
         }
        int ans[] = new int[n],position[] = new int[n];
        ip = kb.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            ans[i] = Integer.parseInt(ip[i]);
        }
        boolean isStudy = true;
        for (int i = 0; i < n ; i++) {
            position[ans[i]-1] = i;
        }
        for (int i = 0; i < q  && isStudy; i++) {
            if(!(position[querry[i][0]-1]  < position[querry[i][1]-1]   )){
                isStudy = false;
            }

        }

        if(isStudy){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
