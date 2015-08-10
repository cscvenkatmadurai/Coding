/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class GirlFriendDemandsHE {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String ip = kb.readLine(), temp[];
        int tt = Integer.parseInt(kb.readLine());
        long a, b;
        int a1, b1;
        while (tt-- > 0) {
            temp = kb.readLine().split(" ");
            a = Long.parseLong(temp[0]) % ip.length();
            b = Long.parseLong(temp[1]) % ip.length();
            a1 = (int) a;
            b1 = (int) b;

            if (a1 == 0) {
                a1 = ip.length() ;
            }
            if (b1 == 0) {
                b1 = ip.length() ;
            }

            if (ip.charAt(a1 - 1) == ip.charAt(b1 - 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
