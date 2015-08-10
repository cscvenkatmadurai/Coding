/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.util.Scanner;
public class KitKatHR {
    public static void main(String[] args) {
        Scanner kb = new Scanner( System.in);
        int tt = kb.nextInt();
        long n,m,ans,i,r,b;
        while(tt-- > 0){
            m = kb.nextLong();
            n = kb.nextLong();
            b = r = 0;
            
            for(i = 0; i < m &&(n>1);i++){
                if(n%2==0){
                    n/=2;
                    b++;
                }else{
                    r++;
                    n=(n/2)+1;
                }
            }
            if(n == 1){
                r +=(m-i);
            }
            System.out.println(r+" "+b);
        }
    }
    
}
