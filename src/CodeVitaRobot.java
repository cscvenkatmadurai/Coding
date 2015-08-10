import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 8/7/2015.
 */
public class CodeVitaRobot {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine());
        int f,b,t,fa,ba,ans,temp,distance;//fa-forward abstracle ba-backward abstracle
        String ip[];
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            f = Integer.parseInt(ip[1]);
            b = Integer.parseInt(ip[0]);
            t = Integer.parseInt(ip[2]);
            fa = Integer.parseInt(ip[4]);
            ba = Integer.parseInt(ip[3]);
            if(f == b){
                if(fa <= f){
                    System.out.println(  (fa*t)+" B");
                }else{
                    System.out.println("Thank God");
                }
            }else{
                distance = 0;
                ans=0;
                if(f > b){
                    while(distance+f < fa){
                        distance += (f-b);
                        ans +=f+b;
                    }
                    ans +=(fa-distance);
                    System.out.println((ans*t)+" B");

                }else {
                    if(fa <= f){
                        System.out.println(fa*t+" B");
                    }else {


                        while (distance + (b - f) < ba) {
                            distance += (b - f);
                            ans += f + b;
                        }
                        ans += (ba - (distance - f)) + f;
                        System.out.println((ans * t) + " F");
                    }
                }
            }


        }

    }
}
