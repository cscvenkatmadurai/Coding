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
 class PrathickAndHopScotchCC {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine());
        long n,k,ans;
        while(tt-- > 0){
            args = kb.readLine().split(" ");
            n = Long.parseLong(args[0]);
            k = Long.parseLong( args[1] );
            if( (k&1) == 0){
                if( (n&1) == 0 ){
                
                    if(k == 0){
                        ans = (n/2)* ( (n/2)+1);
                    }else{
                        ans = ( (n/2)* ( (n/2)+1) )-( ( ( k-2) /2 ) * ( ((k-2)/2)+1 )     );
                    }
                }else{
                    if(k == 0){
                         ans = ( ( (n-1) /2)* ( ( (n-1) /2)+1) );
                    }else{
                        ans = ( ( (n-1) /2)* ( ( (n-1) /2)+1) )-( ( ( k-2) /2 ) * ( ((k-2)/2)+1 )     );
                    }

                }
                
                
            }else{
                if( (n&1) == 1 ){
                    if(k!=1){
                        ans =   (long) (Math.pow(( (n/2)+1 ),2 ) )  - ( (long) Math.pow( ( (k-2)/2 )+1,2   )  ) ;
                    }else{
                        ans =   (long) (Math.pow(( (n/2)+1 ),2 ) );
                    }
                }else{
                    if(k!=1){
                        ans =   (long) (Math.pow(( ( (n-1) /2)+1 ),2 ) )  - ( (long) Math.pow( ( (k-2)/2 )+1,2   )  ) ;
                    }else{
                        ans =   (long) (Math.pow(( ( (n-1) /2)+1 ),2 ) );
                    }
                }    
                
                
            }
            System.out.println(ans);
        }
        
    }
}
