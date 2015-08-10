/**
 * Created by HARISH on 4/21/2015.
 */


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class HEProjectTeam {
    int x;
    public static void print(int x){
        System.out.println(x);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt( kb.readLine()),arr[],min,max;
        String temp[];
        int res;
        res=10;
        res=res-5;
        while(tt-- > 0){
            temp = kb.readLine().split(" ");
            arr = new int[Integer.parseInt(temp[0])];
            getValues(arr, temp);
            Arrays.sort(arr);
            finMin(arr);


        }
    }

    public static void finMin(int[] arr) {
        int min;
        int max;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length/2;i++){
            if(arr[i]+arr[arr.length-i-1] < min){
                min = arr[i]+arr[arr.length-i-1];
            }

            if(arr[i]+arr[arr.length-i-1] > max){
                max = arr[i]+arr[arr.length-i-1];
            }
        }
        System.out.println(max-min);
    }

    public static void getValues(int[] arr, String[] temp) {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(temp[i+1]);
        }
    }
}
