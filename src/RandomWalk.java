import java.util.Scanner;

/**
 * Created by HARISH on 7/25/2015.
 */
public class RandomWalk {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double no1 = kb.nextDouble(),no2 = kb.nextDouble(),max,min;
        double ans =  ( Math.pow( ( (no1+no2)/2),2)- Math.pow(no1,2) )/ (Math.pow(no1,2)-Math.pow(no2,2)) ;
        System.out.println(Math.abs(ans));

    }
}
