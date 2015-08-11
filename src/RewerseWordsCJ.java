/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;

public class RewerseWordsCJ {
    public static void main(String[] args) throws IOException{
     //   BufferedReader kb = new BufferedReader( new InputStreamReader(System.in) ) ;
        BufferedReader kb = new BufferedReader( new FileReader("B-large-practice.in") ) ;
        PrintWriter out = new PrintWriter(new File("ReweseWordsCJSip.txt"));
        int tt = Integer.parseInt( kb.readLine() ),i,j,k=0;
        String t[];
        while(tt-- > 0){
            k++;
            t = kb.readLine().split(" ");
            System.out.print("Case #"+k+": ");
            out.print("Case #"+k+": ");
            for(i = t.length-1;i>=0;i--){
                System.out.print(t[i]+" ");
                out.print(t[i]+" ");
            }
            System.out.println();
            out.println();
        }
        out.close();
    }
}
