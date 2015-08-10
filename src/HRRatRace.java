/**
 * Created by HARISH on 4/30/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class HRRatRace {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in));
        int n = Integer.parseInt( kb.readLine() );
        String speed[],distance[];
        speed = kb.readLine().split(" ");
        distance = kb.readLine().split(" ");
        ArrayList <Integer> winner = null;
                ;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < speed.length ; i++) {
            if( (Double.parseDouble(distance[i])/Double.parseDouble(speed[i]) ) < min ){
                winner = new ArrayList<>();
                winner.add((i+1));
                min = Double.parseDouble(distance[i])/Double.parseDouble(speed[i]);
            }else if( (Double.parseDouble(distance[i])/Double.parseDouble(speed[i]) ) == min  ){
                winner.add((i+1));
            }

        }
      //  System.out.println(winner.size());
        for (int i = 0; i < winner.size() ; i++) {
            System.out.println(winner.get(i));
        }

    }
}
