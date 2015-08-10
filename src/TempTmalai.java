/**
 * Created by HARISH on 6/21/2015.
 */
import java.util.*;
public class TempTmalai {
    public static void main(String[] args) {
        int i;
        long num1 = 1 , num2 = 2 , num3;
        for ( i = 0 ; i <= 2*100000 ; i++)
        {
            num3 = num1 * num2;
            System.out.print(num3 + ",");
            num1++;
            num2++;
        }


    }
}
