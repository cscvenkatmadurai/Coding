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

public class ArchithAndParityHE {

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()), no;
        String binrep;
        while (tt-- > 0) {
            if (Integer.bitCount(Integer.parseInt(kb.readLine())) % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }

}
