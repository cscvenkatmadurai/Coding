/**
 * Created by HARISH on 5/13/2015.
 */


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class UvaAnaAnagram {
    public static String[] concat(String[] a, String[] b) {
        int aLen = a.length;
        int bLen = b.length;
        String[] c= new String[aLen+bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = new String[0],temp,t[],ip;
        while( ! (ip=kb.readLine() ).equals("#")){
            t = ip.trim().split(" +");
            arr =concat(arr,t);
        }
        Arrays.sort(arr);
        boolean ans[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char tempVar1[] = arr[i].toLowerCase().toCharArray();
            Arrays.sort(tempVar1);
            String tempVar11 = new String(tempVar1);
           // System.out.println(arr[i]+" "+tempVar11);

            if(!ans[i]) {
                for (int j = 0; j < arr.length; j++) {
                   // System.out.println(arr[i]+" "+arr[j]);
                    if ((i != j) && !ans[j]) {
                        char tempVar2[] = arr[j].toLowerCase().toCharArray();
                        Arrays.sort(tempVar2);
                        String tempVar22 = new String(tempVar2);
                        if(tempVar11.equals(tempVar22)){
                          //  System.out.println(tempVar11+" "+tempVar22);
                            ans[i] = ans[j] = true;
                        }


                    }

                }
            }



        }
        for (int i = 0; i < ans.length ; i++) {
            if(!ans[i]){
                System.out.println(arr[i]);
            }

        }

    }
}
