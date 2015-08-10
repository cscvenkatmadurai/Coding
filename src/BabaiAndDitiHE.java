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
public class BabaiAndDitiHE {
    public static void main(String[] args) throws IOException{
        boolean arr[];
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) ) ;
        int tt = Integer.parseInt( kb.readLine() ),no,s[],e[],i,max;
        String temp[];
        
        while(tt-- > 0){
            no = Integer.parseInt(kb.readLine() );
            s = new int[10];
            e = new int[10];
            arr= new boolean[10];
            temp = kb.readLine().split(" ");
            max = 1;
            
            for(i = 0;i < temp.length;i++){
                if(!arr[ Integer.parseInt(temp[i]) ]){
                    s[Integer.parseInt(temp[i])] = i;
                    e[ Integer.parseInt(temp[i])] = i;
                    arr[ Integer.parseInt(temp[i]) ]=  true;
                    
                    
                }else{
                    e[ Integer.parseInt(temp[i])] = i;
                 //   System.out.println(i+" "+e[i]);
                }
            }
            for(i = 0; i < s.length;i++ ){
                //System.out.println(e[i]-s[i]+" "+max+" "+i);
                if( (e[i]-s[i]) >= max){
                    //System.out.println("hiii"+i);
                    max = (e[i] - s[i])+1;
                }
            }
            System.out.println(max);
            
            
        }
        
    }
    
}
