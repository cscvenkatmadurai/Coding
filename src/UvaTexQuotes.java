/**
 * Created by HARISH on 5/8/2015.
 */
import java.util.*;
class UvaTexQuotes {
    public static void main(String[] args) //throws IOException
     {
    //    BufferedReader kb = new BufferedReader( new InputStreamReader( System.in) );
         Scanner kb = new Scanner(System.in);
        String ip ,leftQuote = "``",righgtQuote = "''" ;
        int count = 0;
         boolean flag;
        while( kb.hasNextLine()) {
            ip = kb.nextLine();
            flag = true;
            for (int i = 0; i < ip.length(); i++) {
                if (ip.charAt(i) == '\"') {
                    if (flag) {
                        System.out.print("``");
                    } else {
                        System.out.print("''");
                    }
                    flag= !flag;
                } else {
                    System.out.print(ip.charAt(i));
                }


            }
            System.out.println();
        }
    }
}
