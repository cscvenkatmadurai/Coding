import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 7/10/2015.
 */
public class HETwBadString {
    public static void main(String[] args) throws IOException{

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        boolean isValid,isValidtt = true;
        int tt = 0,noOflowerCase = 0,noOfUpperCase = 0,noOfSpecialChar = 0;
        try{
            tt = Integer.parseInt(kb.readLine());
        }catch (Exception e){
            isValidtt = false;
        }

        final int ttLowerLimit =1 ,ttUpperLimit = 10,ipUpperLimit = 100,ipLowerLimit = 1,lowerCaseLowerLimit = 97 ,lowerCaseUpperLimit = 122,upperCaseLowerLimit = 65 , upperCaseUpperLimit = 90;
        final char space= ' ';
        String ip;



        if(  tt > ttUpperLimit || tt<ttLowerLimit || isValidtt){
            System.out.println("Invalid Test");
        }else{
            while(tt-- > 0){

                ip = kb.readLine();


                if(ip == null || ip.length() < ipLowerLimit || ip.length() > ipUpperLimit  ){
                    isValid = false;
                }else{
                    isValid = true;
                    noOflowerCase = noOfUpperCase = noOfSpecialChar = 0;
                    for (int i = 0; i < ip.length() && isValid ; i++) {
                        if(ip.charAt(i) == space){
                            isValid = false;
                        }else if( ip.charAt(i) >= upperCaseLowerLimit && ip.charAt(i) <= upperCaseUpperLimit){
                            noOfUpperCase++;
                        }else if( ip.charAt(i) >= lowerCaseLowerLimit && ip.charAt(i) <= lowerCaseUpperLimit){
                            noOflowerCase++;
                        }else {
                            noOfSpecialChar++;
                        }
                    }
                    if(noOflowerCase == 0 && noOfUpperCase == 0){
                        isValid = false;
                    }

                }
                if(!isValid ){
                    System.out.println("Invalid Input");
                }else{
                    System.out.println(Math.min(ip.length()- (noOflowerCase+noOfSpecialChar),ip.length()-(noOfUpperCase+noOfSpecialChar)));
                }
            }
        }

    }
}
