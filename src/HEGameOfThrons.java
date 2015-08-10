/**
 * Created by HARISH on 6/23/2015.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class HEGameOfThrons {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in )) ;
        int arr[],i,j,count,noToRem,maxCountNo;

        ArrayList<Integer>  al= new ArrayList<Integer>();

        String ip;

            ip = kb.readLine();
            arr = new int[26];
            for (int k = 0; k < ip.length() ; k++) {
                arr[ip.charAt(k)-97]++;
            }
        for (int k = 0; k < arr.length; k++) {
            if(arr[k]!=0){
                al.add( arr[k] );
            }
        }
        Collections.sort(al);
        noToRem = 0;

        maxCountNo = 0;
        for (int k = 0; k < al.size(); ) {
            int no = al.get(k);
            count = 0;
            while(k < al.size() && al.get(k) == no){
                count++;
                k++;
            }
            if(count > maxCountNo){
                maxCountNo = no;
            }

        }
        for (int k = 0; k < al.size() ; k++) {

            noToRem += Math.abs(al.get(k) - maxCountNo);
        }



        if(noToRem < 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }










    }

}
