import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HARISH on 7/21/2015.
 */
public class FCRomeo {
    public static void main(String[] args) throws Exception{


    //   Scanner kb = new Scanner(new File("test.txt"));
       Scanner kb = new Scanner(System.in );

        int tt = kb.nextInt(),n,arr[],ans;
        while(tt-- > 0){
            ans = 0;
            n = kb.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n ; ) {
                ans++;
                int temp = arr[i];
                while (i <n && temp == arr[i]){
                    i++;
                }

            }
            System.out.println(ans);
        }



    }
}
