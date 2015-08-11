/**
 * Created by HARISH on 4/19/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HEIndianCurr {
    public static void main(String arg[]) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),i,j;
        String amt,ans;
        while (tt-- > 0){
            amt = kb.readLine();
            if(amt.length() >3) {
                if (amt.length() % 2 == 0) {
                    System.out.print(amt.charAt(0));
                    System.out.print(",");
                    i = 1;

                } else {
                    System.out.print(amt.charAt(0));
                    System.out.print(amt.charAt(1));
                    System.out.print(",");
                    i = 2;
                }
                j = 0;
                for (; i < amt.length() - 3; i++) {
                    j++;
                    System.out.print(amt.charAt(i));
                    if (j % 2 == 0) {
                        System.out.print(",");
                    }
                }
                for (i = amt.length() - 3; i < amt.length(); i++) {
                    System.out.print(amt.charAt(i));
                }
                System.out.println();
            }else{
                System.out.println(amt);
            }
        }
    }
}

