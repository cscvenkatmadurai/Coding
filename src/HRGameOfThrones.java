import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 7/30/2015.
 */
public class HRGameOfThrones {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String ip = kb.readLine();
        char arr[] = new char[26];
        for (int i = 0; i < ip.length(); i++) {
            arr[ip.charAt(i)-97]++;
        }
        boolean is1stOddOccured = true,isAnagramPalindrome = true;
        for (int i = 0; i < arr.length && isAnagramPalindrome; i++) {
            if(arr[i]%2 != 0){
                if(is1stOddOccured) {is1stOddOccured = false;}
                else{
                    isAnagramPalindrome = false;
                }

            }
        }
        if(isAnagramPalindrome){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
