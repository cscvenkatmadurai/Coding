/**
 * Created by HARISH on 4/25/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 class CCRobotTravel {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        long tt = Integer.parseInt( kb.readLine());
        long a,b,c;
        String temp[];
        while(tt-- > 0){
            temp = kb.readLine().split(" ");
            if( (Long.parseLong(temp[1])-Long.parseLong(temp[0]) )% Long.parseLong(temp[2]) == 0){
                System.out.println(( (Long.parseLong(temp[1])-Long.parseLong(temp[0]) )/Long.parseLong(temp[2])) );
            }else{
                System.out.println(  ( (Long.parseLong(temp[1])-Long.parseLong(temp[0]) )/Long.parseLong(temp[2]) ) +1);
            }

        }
    }
}
