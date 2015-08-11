/**
 * Created by HARISH on 6/26/2015.
 */
import java.io.*;
public class HEFriendship {
    public static void main(String[] args) throws  IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine()),n,r,arr[][],res[],max;
        String ip[],ans ;
        boolean isPresent;
        while(tt-- > 0){
            n = Integer.parseInt( kb.readLine() );
            r = Integer.parseInt( kb.readLine() );
            arr = new int[r][2];
            res = new int[n];
            for (int i = 0; i < r; i++) {
                ip = kb.readLine().split(" ");
                if (!checkPresence(arr, ip, i)) {
                    res[Integer.parseInt(ip[0]) - 1]++;
                    res[Integer.parseInt(ip[1]) - 1]++;
                }
                if( Integer.parseInt(ip[0]) < Integer.parseInt(ip[1]) ){
                    arr[i][0] = Integer.parseInt(ip[0]);
                    arr[i][1] = Integer.parseInt(ip[1]);
                }else{
                    arr[i][0] = Integer.parseInt(ip[1]);
                    arr[i][1] = Integer.parseInt(ip[0]);
                }
            }
            max = findMin(res);
            boolean firstTime = false;
            ans = "";
            for (int i = 0; i < res.length; i++) {
                if(max == res[i]){
                    if(firstTime){
                       ans += ",";
                    }
                    ans +=(i+1);
                    firstTime = true;
                }
            }
            System.out.println(ans);



        }


    }

    public static int findMin(int[] res) {
        int max = 0;
        for (int i = 0; i < res.length; i++) {
            if(res[i] > max){
                max = res[i];
            }
        }
        return max;
    }

    public static boolean checkPresence(int[][] arr, String[] ip, int i) {
        int min,max;
        if(Integer.parseInt(ip[0]) < Integer.parseInt(ip[1])){
            min = Integer.parseInt(ip[0]);
            max = Integer.parseInt(ip[1]);
        }else{
            min = Integer.parseInt(ip[1]);
            max = Integer.parseInt(ip[0]);
        }
      //  System.out.println(i);
        for (int j = 0; j < i ; j++) {
            if( arr[j][0] == min && arr[j][1] == max ){

                return  true;
            }
         //   System.out.println(arr[j][0]+" "+arr[j][1] +ip[0]+" "+ip[1]);
        }
      //  System.out.println();
        return false;
    }
}
