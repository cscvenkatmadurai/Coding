import java.io.*;
import java.util.Arrays;

/**
 * Created by HARISH on 6/28/2015.
 */
public class UvaLotto {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int arr[];
        String ip[];
        boolean fstTime = true;
        while( true ){
            ip = kb.readLine().split(" ");
            if(Integer.parseInt(ip[0]) == 0){
                break;
            }
            if(!fstTime){
                System.out.println();

            }
            arr = new int[Integer.parseInt(ip[0])];
            for (int i = 1; i < ip.length ; i++) {
                arr[i-1] = Integer.parseInt(ip[i]);
            }
            Arrays.sort(arr);
            printArray(arr);
            fstTime = false;
        }


    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    for (int l = k+1; l < arr.length; l++) {
                        for (int m = l+1; m < arr.length; m++) {
                            for (int n = m+1; n < arr.length; n++) {
                                System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]+" "+arr[m]+" "+arr[n]);

                            }
                        }
                    }
                }
            }
        }
    }
}
