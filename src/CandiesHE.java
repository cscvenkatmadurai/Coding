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

public class CandiesHE {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int tt = kb.nextInt(),no,i;
        long val,x;
        while(tt-- > 0){
            no = kb.nextInt();
            val = 0;
            for(i = 0;i < no;i++){
                x = kb.nextLong();
                val+=x;
            }
            if(val%no==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            
            }
            System.out.println(val/no+" "+val%no);
            //kb.nextLine();
        }
       
        
    }
}
