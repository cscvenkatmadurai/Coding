import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by HARISH on 8/2/2015.
 */
public class HRPoisonLL {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(kb.readLine()),ans = 0;
        long temp;
        LinkedList<Long> ll = new LinkedList<>();
        int firstDel;
        boolean flag = false;
        String ip[] = kb.readLine().split(" ");
        ll.add(Long.parseLong(ip[0]));
        for (int i = 1; i < n; i++) {
            temp = Long.parseLong(ip[i-1]);
            if(ll.get(ll.size()-1) < Long.parseLong(ip[i])){
                flag = true;
                if(temp >= Long.parseLong(ip[i])){
                    ans++;
                }
                            }else{
                ll.add(Long.parseLong(ip[i]));
            }

        }
        if(flag){
            ans++;
        }
        System.out.println(ans);




    }
}
