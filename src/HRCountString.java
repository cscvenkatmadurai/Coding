import java.io.IOException;

/**
 * Created by HARISH on 6/6/2015.
 */
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class HRCountString implements Comparable<HRCountString>{
    char ch;
    int count;

    public HRCountString(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
    public int compareTo(HRCountString ob){
        if(this.count == ob.count ){
            if(this.ch < ob.ch){
                return -1;
            }else{
                return 1;
            }
        }else{
            if(this.count < ob.count){
                return 1;
            }else{
                return -1;
            }
        }

    }

    public static void main(String[] args) throws IOException{
    //    BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        Scanner kb = new Scanner(System.in );
        int tt = kb.nextInt(),count,arr[],length;
        String ip;
        final int arrSize = 26;
        HRCountString ob[];
    //    String temp[];
        boolean flag;

        while(tt-- > 0){
            //temp = kb.readLine().split(" ");
            //length = Integer.parseInt(temp[0]);
            length = kb.nextInt();
            //count = Integer.parseInt(temp[1] );
            count = kb.nextInt();
            kb.nextLine();
            ip = kb.nextLine();
            arr = new int[arrSize];
            for (int i = 0; i < ip.length() ; i++) {
                arr[ip.charAt(i)-97]++;
            }
            ob = new HRCountString[arrSize];
            for (int i = 0; i < ob.length ; i++) {
                ob[i] = new HRCountString( (char) (i+97),arr[i]);
            }
            Arrays.sort(ob);
            flag = true;
            for (int i = 0; i < ob.length && ob[i].count > count; i++) {
                System.out.print(ob[i].ch);
                flag = false;
            }
            if(flag){
                System.out.print("NONE");
            }
            System.out.println();

        }

    }
}
