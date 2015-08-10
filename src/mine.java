/**
 * Created by HARISH on 6/23/2015.
 */

import java.io.*;
import java.util.*;

public class mine {
    public static void main(String args[]) {
        int n = 20;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");

            }
            for (int k = 0; k < n - 2 * i; k++) {
                System.out.print(" ");

            }
            for (int m = 0; m < i; m++) {
                System.out.print("#");

            }

            System.out.println();
        }

    }
}