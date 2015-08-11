/**
 * Created by HARISH on 5/8/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HRAndAnd {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() ),i;
        long l,r;
        String lBvalue,rBValue,ans;
        String ip[];
        long lLength,rLength;
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            l = Long.parseLong(ip[0]);
            r = Long.parseLong(ip[1]);

            lBvalue = Long.toBinaryString(l);
            rBValue = Long.toBinaryString(r);
            lLength = lBvalue.length();
            rLength = rBValue.length();
            if(l == r  ){
                System.out.println(l);
            }else if( lLength == rLength ) {
                ans = "";
                for( i = 0 ; i <lLength && lBvalue.charAt(i)== rBValue.charAt(i)  ;i++    ){

                        ans += rBValue.charAt(i);

                }
                for(;i <lLength;i++){
                    ans += '0';
                }
                System.out.println(Long.parseLong(ans,2));



            }else{
                System.out.println(0);
            }
        /*    for(; l <=r && ans > 0;l++){
                ans&=l;
            }*/

        }
    }
}
