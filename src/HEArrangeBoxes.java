/**
 * Created by HARISH on 5/27/2015.
 */
import java.io.*;
import java.util.*;
public class HEArrangeBoxes {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ) );
        Scanner kb1 = new Scanner(System.in);
        int tt = kb1.nextInt();
        int no,j,k;
        long arrip[], arrreq[];
        long swap = 0;
        String ip[];
        kb1.nextLine();
        while(tt-- > 0){
         //   no = Integer.parseInt(kb.readLine());
          //  ip = kb.readLine().split(" ");
            no = kb1.nextInt();
            arrip = new long[no];
            arrreq = new long[no];
            for (int i = 0; i < no; i++) {
                arrip[i] = kb1.nextLong();
            }
            for (int i = 0; i < no; i++) {
                arrreq[i] = kb1.nextLong();
            }
        //    getIp(arrip, ip);
          //  ip = kb.readLine().split(" ");
          //  getIp(arrreq, ip);
            boolean flag = true;
            swap = 0;

                for (int i = 0; i < arrreq.length && flag ; i++){
                    if(arrip[i] == arrreq[i]){
                        for ( j = i+1; j < arrreq.length && arrip[j] == arrreq[j]; j++);
                        if(j== arrreq.length){
                            flag = false;
                        }


                    }else{
                        for ( k = i+1; arrreq[i]!=arrip[k]; k++) ;
                  //      System.out.println(i+" "+k);


                        for(;k>i;k--){
                       //     System.out.println("l+1 "+(l+1));
                            long temp = arrip[k];
                            arrip[k] = arrip[k-1];
                            arrip[k-1]=temp;
                            swap++;


                        }
                 /*       for (int m = 0; m < arrip.length; m++) {
                            System.out.print(arrip[m] + " ");
                        }*/



                    }
                }
            System.out.println(swap);




        }
    }

    public static void getIp(long[] arrip, String[] ip) {
        for (int i = 0; i < ip.length  ; i++) {
            arrip[i] = Long.parseLong(ip[i]);

        }
    }
}
