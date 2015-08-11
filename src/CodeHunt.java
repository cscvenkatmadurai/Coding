
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praveen
 */
class CodeHunt
{
    public static void main(String args[])throws Exception
    {
        Scanner kb = new Scanner(System.in);
        int tt = kb.nextInt() , i , l1 , l2 , count , j;
        String a,b;
        kb.nextLine();
        while(tt-- > 0){
            a = kb.nextLine().trim();
            b = kb.nextLine().trim();
            count  = 0;
            for (int k = 0; k < a.length() && k < b.length() ; k++) {
                if(a.charAt(k) == b.charAt(k)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
