/**
 * Created by HARISH on 5/27/2015.
 */
import java.io.*;
public class UvaMachine {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        String ip,arr[];
        int ans = 0,maxX = 0;
        while(Integer.parseInt( ip = kb.readLine() ) !=0){
            arr = new String[Integer.parseInt(ip)];
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = kb.readLine();
            }
            ans = 0;
            maxX = findMaxX(arr);
            for (int i = 0; i < arr.length; i++) {
                ans+=(maxX-countX(arr[i]));
            }
            System.out.println(ans);

            
            
        }
    }
    public static int countX(String line){
        int count = 0;
        for (int i = 0; i < line.length() ; i++) {
            if(line.charAt(i)=='X'){
                count++;
            }
        }
        return count;
    }
    
    public static int   findMaxX(String arr[]){
        int maxX,rowX;
        maxX = rowX = 0;
        for (int i = 0; i < arr.length; i++) {
            rowX = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j)=='X'){
                    rowX++;
                }
            }
            if(rowX > maxX ){
                maxX = rowX;
            }
        }
        return maxX;
    }
}

