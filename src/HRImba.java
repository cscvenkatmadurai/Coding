import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 8/2/2015.
 */
public class HRImba {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine());
        int no,a,b;
        while(tt-- > 0){
            no = Integer.parseInt(kb.readLine());
            a = no/2;
            b = (no/2)+1;
            if(no % 2 != 0){
                System.out.print((int) Math.ceil((double)no/2)+" ");
                b++;
            }
            while(a>0){
                System.out.print(a--+" "+b+++" ");
            }
            System.out.println();



        }
    }
}
