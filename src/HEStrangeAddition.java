/**
 * Created by HARISH on 5/29/2015.
 */
import  java.io.*;
public class HEStrangeAddition {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() ),carry = 0,sum = 0,i = 0;
        boolean tillFirstNonZero ;

        String arr[];
        while (tt-- > 0){
            arr = kb.readLine().split(" ");
            carry = 0;
            sum = 0;
            tillFirstNonZero = true;

            for ( i = 0 ; i < arr[0].length() && i < arr[1].length()   ; i++) {
               sum = Character.getNumericValue(arr[0].charAt(i)) + Character.getNumericValue(arr[1].charAt(i)) + carry;

                carry = sum/10;
              //  System.out.println("sum is "+sum+" carry is "+carry+" "+arr[0].charAt(i)+arr[1].charAt(i));
                if(sum%10!=0){
                    tillFirstNonZero = false;
                }
                if (!tillFirstNonZero) {
                    System.out.print(sum%10);

                }
            }

            for (int j = 0; j < 2 ; j++) {
                if(checkIlessthanLength(i,arr[j].length())){
                carry =          printArray(i,arr[j],carry,tillFirstNonZero);
                }
            }

            if(carry!=0){
                System.out.print(carry);
            }



            System.out.println();

        }

    }
    public static boolean checkIlessthanLength(int i , int length){

        if(i < length){
            return  true ;
        }else{
            return false;
        }
    }
    public static int printArray(int i,String arr,int carry,boolean tillFirstNonZero){
        int sum;

        while(i < arr.length()){
            sum = Character.getNumericValue(arr.charAt(i))+carry;

            carry = sum/10;
            if(sum%10!=0){
                tillFirstNonZero = false;
            }
            if (!tillFirstNonZero) {
                System.out.print(sum%10);

            }
            i++;

        }
      //  System.out.println(carry);
        return carry;
    }
}
