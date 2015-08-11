/**
 * Created by HARISH on 4/23/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class HRSachiAndAngles {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine());
        double sum, n;
        boolean flag;
        String temp[];
        while (tt-- > 0) {
            n = Double.parseDouble(kb.readLine());
            temp = kb.readLine().split(" ");
            sum = 0;
            flag = true;
            for (int i = 0; i < n; i++) {
                sum += Double.parseDouble(temp[i]);
                if(Double.parseDouble(temp[i]) <1){
                    flag = false;
                }

            }


            if (sum == (180 * (n - 2) )  && flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }
}
