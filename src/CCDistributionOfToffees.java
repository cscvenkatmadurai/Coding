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
 class CCDistributionOfToffees {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine( )),arr[],n,i,min;
        String temp[];
        while( tt-- > 0){
            n = Integer.parseInt( kb.readLine() );
            temp = kb.readLine().split(" ");
            arr = new int[n];
            min = Integer.MIN_VALUE;
            for(i = 0; i < n;i++){
                arr[i] = Integer.parseInt(temp[i]);
                if(arr[i] < min){
                    min  = arr[i];
                }
            }
            //Arrays.sort(arr);
            for(i = 0; i < n && Math.abs(arr[i]-min) <2;i++);
            if(i == n){
                System.out.println("GOOD");
            }else{
                System.out.println("BAD");
            }
                
            
        }
        
    }
    
}
