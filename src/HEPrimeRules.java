/**
 * Created by HARISH on 5/23/2015.
 */
import java.util.*;
public class HEPrimeRules {
    public static void main(String args[])
    {
        int tc,n,i,j,k;
        Scanner kbd = new Scanner(System.in);
        boolean flag;
        tc = kbd.nextInt();
        for(i=0;i<tc;i++)
        {
            flag=true;
            n = kbd.nextInt();
            for(j=n+1;flag;j++){
                for( k =2 ; (k <= Math.ceil(Math.sqrt(j))) &&(j%k!=0) ;k++);
                    if(k >  Math.ceil(Math.sqrt(j)) ){
                    System.out.println(j);
                        flag = false;
                }


            }
        }

    }
}
