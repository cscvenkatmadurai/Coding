/**
 * Created by HARISH on 4/21/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HEUnderTaker21 {
    public static boolean noContatin21(String no){
        boolean flag  = false;
        for (int i = 0; i < no.length()-1 && !flag ; i++) {
            if(Character.getNumericValue(no.charAt(i)) == 2  && Character.getNumericValue(no.charAt(i+1)) ==1) flag = true;

        }

        return flag;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in));
        int tt = Integer.parseInt( kb.readLine() );
        String no;
        while (tt-- > 0){
            no = kb.readLine();
            if(Integer.parseInt(no)%21 == 0 ||  noContatin21(no)){
                System.out.println("The streak is broken!");
            }else{
                System.out.println("The streak lives still in our heart!");
            }
        }


    }
}
