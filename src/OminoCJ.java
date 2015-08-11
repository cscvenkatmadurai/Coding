
import java.util.*;
import java.io.*;
public  class OminoCJ {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(new File("D-large (2).in"));
       // Scanner kb = new Scanner(System.in);
        PrintWriter out = new PrintWriter( new File("Ominio.txt"));
        int tt = kb.nextInt(),x,r,c,k = 0;
        for(int i = 0; i < tt;i++){
            k++;
            x = kb.nextInt();
             r = kb.nextInt();
              c = kb.nextInt();
              out.print("Case #"+k+": ");
              if( x == 1){
                  out.println("GABRIEL");
                  
              }else if( x == 2){
                  if( (r*c)%2 == 0 ){
                      out.println("GABRIEL");
                  }else{
                      out.println("RICHARD");
                  }
              }else if(x == 3 ){
                if( (r == 1 || c == 1)  ) {
                    out.println("RICHARD");    
                }else if(r*c % 3==0){
                    
                    out.println("GABRIEL");
                }else{
                    out.println("RICHARD");
                }    
              }else if(x == 4){
                  if( (r*c %4 == 0) && (r*c)>8 ){
                      out.println("GABRIEL");
                  }else{
                      out.println("RICHARD");
                  }
              }else if(x == 5 ){
                  if( (r*c %5 == 0) && (r*c)>5 ){
                      out.println("GABRIEL");
                  }else{ 
                      out.println("RICHARD");
                  }
              }else if(x == 6 ){
                  if( (r*c %6 == 0) && (r*c)>18 ){
                      out.println("GABRIEL");
                  }else{ 
                      out.println("RICHARD");
                  }
              }else{
                  out.println("RICHARD");
              }
              
        }
        out.close();
    }
}
