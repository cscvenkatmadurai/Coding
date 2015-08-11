import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by HARISH on 6/21/2015.
 */
public class HRLineSegment implements Comparable<HRLineSegment> {
    int x,y;

    public HRLineSegment(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int compareTo(HRLineSegment ob){
        if(this.x == ob.x){
            if(this.y < ob.y){
                return -1;
            }else if(this.y > ob.y){
                return 1;
            }

        }else{
            if(this.x < ob.x){
                return -1;
            }else if(this.x> ob .x){
                return 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt( kb.readLine() ),count,ans = 0,maxY;
        String ip[];
        HRLineSegment arr[] = new HRLineSegment[tt];
        for (int i = 0; i < tt; i++) {
            ip = kb.readLine().split(" ");
            arr[i] = new HRLineSegment(Integer.parseInt(ip[0]),Integer.parseInt(ip[1]));
        }
        Arrays.sort(arr);
     /*   for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].x+" "+arr[i].y);
        }*/
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            maxY = arr[i].y;
            for (int j = i+1; j < arr.length ; j++) {
                if(maxY < arr[j].y){
                    count++;
                    maxY = arr[j].y;

                }
            }
            if(count > ans){
                ans = count;
            }
        }
        System.out.println(ans);
    }

}
