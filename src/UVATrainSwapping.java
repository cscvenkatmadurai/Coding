/**
 * Created by HARISH on 5/11/2015.
 */
import java.io.*;
public class UVATrainSwapping {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() ),arr[],ans,no,j;
        String temp[];
        while(tt-- > 0){
            no = Integer.parseInt( kb.readLine() );
            arr = new int[no];
            temp = kb.readLine().split(" ");
            for (int i = 0; i < no; i++) {
                arr[i] = Integer.parseInt( temp[i]) ;

            }
            ans = 0;
            for (int i = 0; i < no; i++) {
                if(arr[i]!=(i+1)) {


                    for (j = i; (i + 1) != arr[j]; j++) ;
                    for (; j > i; j--) {
                        swap(arr, j);
                        ans++;
                    }

                }


            }
            System.out.println("Optimal train swapping takes "+ans+" swaps.");

        }

    }

    public static void swap(int[] arr, int j) {
        int tempVal = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = tempVal;
    }
}
