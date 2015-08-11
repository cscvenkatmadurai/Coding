import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Modullus {
    public static long sum(long n){
        return (  ( n*(n+1) )/2 );
    }
    public static void main(String arg[]) throws IOException{

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine() ),i,j,k,arr[][] = new int[tt][2];
        long div,ans,sum,tS,temp;
        String temp1[];
        for(i = 0;i<tt;i++){
            temp1 = kb.readLine().split(" ");
            arr[i][0] = Integer.parseInt(temp1[0]);

            arr[i][1] = Integer.parseInt(temp1[1]);
        }
        for(i = 0;i < tt;i++ ){
            if(arr[i][1] == 1){
                System.out.println(0);
            }else{
                sum = sum(arr[i][1] -1 );
                ans = sum*(arr[i][0]/arr[i][1]);
                if(arr[i][0]%arr[i][1] == 0){

                    System.out.println(ans);
                }else{
                    temp = arr[i][0]-( (arr[i][0]/arr[i][1])*arr[i][1]   );
                    temp = sum(temp);
                    System.out.println(ans+temp);
                }

            }

        }

    }
}