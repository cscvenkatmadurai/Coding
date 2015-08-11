import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 8/1/2015.
 */
public class HECollatz {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        long no,evenSum,oddSum,noOfSteps;
        int tt = Integer.parseInt(kb.readLine());
        while(tt-- > 0){
            no = Long.parseLong(kb.readLine());
             evenSum = noOfSteps = 0;
            oddSum = 1;
            while(no != 1){
                noOfSteps++;
                if((no%2==0)){
                    evenSum += no;
                    no /= 2;
                }else {
                    oddSum += no;
                    no = 3*no+1;
                }
            }
            if( (evenSum%noOfSteps) > (oddSum%noOfSteps)){
                System.out.println("Even Rules");
            }else if( (evenSum%noOfSteps) < (oddSum%noOfSteps)){
                System.out.println("Odd Rules");
            }else{
                System.out.println("Tie");
            }
        }


    }
}
