/**
 * Created by HARISH on 4/25/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HEXAndString {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt( kb.readLine() ),arr[];
        String temp;
        while(tt -- > 0){
            arr = new int[26];
            temp = kb.readLine();
            CountSort(arr, temp);
            if (logic(arr)) {
               System.out.println("Yes");
           }else {
               System.out.println("No");
           }

        }

    }
    public static boolean logic(int arr[]){
        for (int i = 0; i < 26; i++) {
            if(arr[i]>1){
                return  true;
            }
        }
        return false;

    }

    public static void CountSort(int[] arr, String temp) {
        for (int i = 0; i < temp.length(); i++) {
            arr[temp.charAt(i)-97]++;
        }
    }
}
