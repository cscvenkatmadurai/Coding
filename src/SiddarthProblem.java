import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by HARISH on 6/15/2015.
 */
public class SiddarthProblem {
    public static int[] generateLine(int prevLine[]){
        Arrays.sort(prevLine);
        ArrayList<Integer> newLine = new ArrayList<>();
        int retNewLine[];
        int no,count,i;
        for ( i = 0; i < prevLine.length; ) {
            no = prevLine[i];
            count = 0;
            while(i < prevLine.length && no==prevLine[i]){
                count++;
                i++;

            }
            newLine.add(no);
            newLine.add(count);
//            System.out.println(no+" "+count);

        }
        retNewLine = new int[newLine.size()];
        for ( i = 0; i < newLine.size(); i++) {
            retNewLine[i] = newLine.get(i);
        }
        return retNewLine;
    }
    public static void printLine(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader kb  = new BufferedReader(new InputStreamReader( System.in ) ) ;
        int noOfLines = Integer.parseInt(kb.readLine()),arr[];
        arr = new int[1];
        arr[0] = 1;
        printLine(arr);
        for (int i = 2; i <= noOfLines ; i++) {
            arr = generateLine(arr);
            printLine(arr);
        }

    }
}
