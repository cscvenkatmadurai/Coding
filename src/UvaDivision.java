/**
 * Created by HARISH on 6/28/2015.
 */

import java.io.*;

public class UvaDivision {
    public static void main(String[] args) throws IOException {
        int no, denom, num, used, temp;
        boolean noAns;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        while ((no = Integer.parseInt(kb.readLine())) != 0) {
            noAns = true;
            for (denom = 1234; denom <= 98765 / no; denom++) {
                num = denom * no;

                int arr[] = new int[10];
                if (denom < 10000) {
                    arr[0] = 1;
                }
                temp = num;
                checkUniqueDigit(temp, arr);
                temp = denom;
                checkUniqueDigit(temp, arr);
                boolean flag = true;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != 1) {
                        flag = false;
                    }
                }

                //  System.out.println(num+" "+denom);
                if (flag) {
                    System.out.printf("%05d / %05d = %d\n", num, denom,no);
                    noAns = false;
                }


            }
            if (noAns) {
                System.out.println("There are no solutions for " + no + ".");
            }
            System.out.println();
        }

    }

    public static void checkUniqueDigit(int temp, int[] arr) {
        while (temp > 0) {
            arr[temp % 10]++;
            temp /= 10;
        }
    }
}
