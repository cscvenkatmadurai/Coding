/**
 * Created by HARISH on 6/23/2015.
 */

import java.io.*;
public class HRSherlockAndWeiredSum {
    public static void main(String[] args) throws IOException{
        BufferedReader kb =new BufferedReader( new InputStreamReader( System. in ) ) ;
        int tt = Integer.parseInt( kb.readLine() ),max = 0,i;
        String a,b,ip[];
        while(tt-- > 0) {
            ip = kb.readLine().split(" ");
            if (ip[0].length() > ip[1].length()) {
                a = ip[0];
                b = ip[1];
            } else {
                a = ip[1];
                b = ip[0];
            }
            for (i = 0; i < a.length() - b.length(); i++) {
                System.out.print(a.charAt(i));
            }
            for (int p = 0; i < a.length(); i++, p++) {
                int aNo = Character.getNumericValue(a.charAt(i));
                int bNo = Character.getNumericValue(b.charAt(p));
                // System.out.println(aNo+" "+bNo);
                max = 0;
                for (int j = 0; j <= aNo; j++) {
                    for (int k = 0; k <= bNo; k++) {

                        if ((j + k) > max && (j + k) < 10) {
                            max = j + k;
                        }
                    }


                }
                System.out.print(max);

            }
            System.out.println();
        }

    }
}
