/**
 * Created by HARISH on 6/10/2015.
 */
import java.io.*;
 class CCFlipflop {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in));
        int tt = Integer.parseInt( kb.readLine() ),ans;
        String ip;
        char ch;

        while(tt-- >0 ){
            ip = kb.readLine();
            ans = 0;
            for (int i = 0; i < ip.length() ;) {
                ch = ip.charAt(i);
                i++;
                while(i < ip.length() && ch == ip.charAt(i)){
                    ans++;
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}
