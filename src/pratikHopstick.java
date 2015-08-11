/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author admin
 */
class pratikHopstick {

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(), n, k, res, x;
        while (t-- > 0) {
            n = s.nextInt();
            k = s.nextInt();
            if (k % 2 != 0) {
                if (n % 2 != 0) {
                    res = (((n / 2) + 1) * ((n / 2) + 1)) - ((k / 2) * (k / 2));
                } else {
                    res = ((n / 2) * (n / 2)) - ((k / 2) * (k / 2));
                }
            } else {
                res = ((n / 2) * ((n / 2) + 1)) - ((k / 2) * ((k / 2) + 1)) + k;

            }
            System.out.println(res);
        }
    }
}
