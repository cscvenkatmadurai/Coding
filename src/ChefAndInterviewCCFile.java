
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;

public class ChefAndInterviewCCFile {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        PrintWriter out = new PrintWriter(new File( "ChefAndInterviewCCFile.txt ") );
        long no,i,j,ans,k;
        boolean flag,primeFlag;
      //  while(tt-- > 0){
        for(k = 1;k <=1000000000;k++){
            no = k;
            flag = primeFlag = true;
            ans = 0;
            for(i = 2;i <= no/2 && primeFlag;i++ ){
                if(no%i == 0){
                    ans+=i;
                    flag = false;
                    
                }
                if(i == Math.sqrt(no) && flag){
                         primeFlag = false;
                }
                
            }
            if(no == 1){
                ans+=1;
            }else{
                ans+=1;
                ans+=no;
            }
            System.out.println(ans);
            out.println(ans);
            
            
        }
        out.close();
        
    }
}
