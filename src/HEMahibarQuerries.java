/**
 * Created by HARISH on 4/19/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HEMahibarQuerries {
    public static void main(String arg[]) throws  IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int arr[][],n,m,ang;
        String temp[]  = kb.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        arr  = new int[Integer.parseInt(temp[0])][Integer.parseInt(temp[0])];
        for (int j = 0; j <n ; j++) {
            temp = kb.readLine().split(" ");
            for (int k = 0; k <n ; k++) {
                arr[j][k] = Integer.parseInt(temp[k]);

            }
        }
        while(m-- > 0){
            ang = Integer.parseInt(kb.readLine());
            if(ang == 0 || ( (ang/90)%4 == 4)){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n ; j++) {
                        System.out.print(arr[i][j]+" ");

                    }
                    System.out.println();
                }
                System.out.println();
            }else if( (ang/4)%90   == 3){
                for (int i = n-1; i >=0 ; i--) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[j][i] + " ");
                    }
                    System.out.println();
                }
            }else if( (ang/90)%4 == 2){
                for (int i = n-1; i >=0; i--) {
                    for (int j = n-1; j >=0 ; j--) {
                        System.out.print(arr[i][j] + " ");

                    }
                    System.out.println();
                }
            }
            else if(ang%90 == 0){
                for (int i = 0; i < n; i++) {
                    for (int j = n-1; j >=0 ; j--) {
                        System.out.print(arr[j][i] + " ");

                    }
                    System.out.println();

                }
            }
            System.out.println();

        }



    }
}
