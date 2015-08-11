/**
 * Created by HARISH on 6/12/2015.
 */
import java.io.*;
public class CCTennis {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),z,o;
        boolean flag;
        String ip;
        while(tt-- > 0){
            z = o = 0;
            ip = kb.readLine();
            flag = true;
            for (int i = 0; i < ip.length() && flag; i++) {
                if(ip.charAt(i) == '0'){
                    z++;
                }else{
                    o++;
                }
                if(  ( (z>=11) || (o>=11) ) && (Math.abs(z-0)>1 ) ){
                    if(z>o){
                        System.out.println("LOSE");
                    }else{
                        System.out.println("WIN");
                    }
                    flag = false;
                }
            }
        }
    }
}
