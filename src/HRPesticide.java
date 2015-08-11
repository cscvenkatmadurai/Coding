import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 8/2/2015.
 */
public class HRPesticide {
    static int loopVariable,ans = 0,noOfDays,arr[],arrSize,comparingVariable;

    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int  arrSize = Integer.parseInt(kb.readLine());
        arr = new int[arrSize];
        String ip[] = kb.readLine().split(" ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(ip[i]);
        }
        for (loopVariable = 0;loopVariable < arrSize-1;){
            noOfDays = 0;
            comparingVariable = arr[loopVariable];
            while (loopVariable+1 < arrSize && comparingVariable < arr[loopVariable+1]){
                noOfDays++;

                loopVariable++;
                while (loopVariable+1 < arrSize && arr[loopVariable] < arr[loopVariable+1]){
                    loopVariable++;

                }

            }
            loopVariable++;


            if(noOfDays > ans){
                ans = noOfDays;
            }
        }
        System.out.println(ans);



    }
}
