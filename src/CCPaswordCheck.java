/**
 * Created by HARISH on 4/19/2015.
 */


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

 class CCPaswordCheck {
    public static void main(String arg[]) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String ip = kb.readLine();
        int digit = 0,i;
        boolean dig = true;
        for(i = 0;i < ip.length() && dig;i++){
            if(ip.charAt(i)>=48 &&  ip.charAt(i) <=57){
                dig = false;
            }
        }
        if( !dig && ip.length()>4 && !ip.equals(ip.toLowerCase()) && !ip.equals(ip.toUpperCase())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
