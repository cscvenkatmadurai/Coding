/**
 * Created by HARISH on 5/11/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class DIvisionOfNlogicia {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
      /*  int x,y,no;
        String temp[];
        while((no = Integer.parseInt(kb.readLine()))!=0){
            temp = kb.readLine().split(" ");
            x = Integer.parseInt(temp[0]);
            y = Integer.parseInt(temp[1]);
            for (int i = 0; i < no ; i++) {
                temp = kb.readLine().split(" ");
                if( x == Integer.parseInt(temp[0]) ||  Integer.parseInt(temp[1]) == y){
                    System.out.println("divisa");
                }else if( Integer.parseInt(temp[0]) > x  &&   Integer.parseInt(temp[1]) > y    ){
                    System.out.println("NE");
                }else if(  Integer.parseInt(temp[0]) < x &&  Integer.parseInt(temp[1]) > y ){
                    System.out.println("NO");
                }else if( x < Integer.parseInt(temp[0]) &&  y > Integer.parseInt(temp[1])  ){
                    System.out.println("SE");
                }else {
                    System.out.println("SO");
                }

            }
        }*/
    //    System.out.println(-124%10);
        int tt = Integer.parseInt( kb.readLine( ) ),no;
        while(tt-- > 0){
            no = Integer.parseInt( kb.readLine( ) );
            System.out.println( Math.abs ( (  ( ( ( ( ( (567*no)/9 )+7492 )*235 )/47 ) -498 )%100 ) /10   )         );
        }
    }
}
