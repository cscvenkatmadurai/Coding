/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BattleOfWordsHE {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt( kb.readLine() ),arrAlice[],arrBob[],i,min, cAlice,cBob;
        String alice,bob;
	final int alpha = 26,aValue = 97;
        
        while(tt-- > 0){
            alice = kb.readLine();
            bob = kb.readLine();
            cBob = cAlice =0;
                
            arrAlice = new int[alpha];
            arrBob = new int[alpha];
            for(i = 0;i< alice.length() ; i++){
                if(Character.isLetter(alice.charAt(i))){
                    arrAlice[alice.charAt(i)-aValue]++;
                }
            }
            for(i = 0;i< bob.length() ; i++){
                if(Character.isLetter(bob.charAt(i))){
                    arrBob[bob.charAt(i)-aValue]++;
                }
            }
            for(i = 0;i < alpha;i++){
                if(arrAlice[i]<arrBob[i]){
                    min = arrAlice[i];
                }else{
                    min = arrBob[i];
                }
                //arrAlice[i]-=min;
                //arrBob[i]-=min;
                cBob+=(arrBob[i]-min);
                cAlice+=(arrAlice[i]-min);
            }
            if( (cAlice>0) && (cBob == 0) ){
                System.out.println("You win some.");
            }else if( (cBob>0) && (cAlice==0) ){
                System.out.println("You lose some.");
            }else{
                System.out.println("You draw some.");
            }
            
        }
    }
    
}
