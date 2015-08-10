/**
 * Created by HARISH on 5/30/2015.
 */
import java.io.*;
 class CCXor {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() ),zero,one,no;
        String arr[];
        while(tt-- > 0){
            no = Integer.parseInt(kb.readLine());
            arr = kb.readLine().split(" ");

            zero = one = 0;
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i].equals("1")) {

                    one++;
                }else{
                    zero++;
                }

            }
            if(one%2 == 0 ){
                System.out.println(zero);

            }else{
                System.out.println(one);
            }

        }
    }
}
