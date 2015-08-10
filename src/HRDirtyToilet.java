import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 8/2/2015.
 */
public class HRDirtyToilet {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),n,m;
        String ip[];
        while (tt-- > 0){
            ip = kb.readLine().split(" ");
            m = Integer.parseInt(ip[0]);
            n = Integer.parseInt(ip[1]);

            if( ((n-1)/m)%2 != 0 && m%2!=0 ){
                if(n%m == 0 ){
                    System.out.print(m / 2 + 1);
                }else if( (n%m)%2 == 0 ){

                    System.out.print((int)Math.ceil( (n%m)/2) );
                }else {
                    System.out.print(m-((n%m)/2));
                }

            }else {
                if(n%m == 0){
                    System.out.print(m / 2 + 1);
                }
                else if((n%m)%2 != 0){
                    System.out.print((int)Math.ceil((double)(n%m)/2));
                }else{
                    System.out.print((m+1)-(n%m)/2);
                }
            }
            System.out.println(" "+(n-1)/m);
        }

    }
}
