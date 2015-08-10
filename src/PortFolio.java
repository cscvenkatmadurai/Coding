import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by HARISH on 8/8/2015.
 */
public class PortFolio {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> item = new HashMap<>();
        final int noOfSecurity = 5,noOfWorkingDay = 30;
        final String buy="B",sell="S",eof="-1";
        String names[] = new String[noOfSecurity];
        int price[][] = new int[noOfSecurity][noOfWorkingDay],noOfShare[] = new int[noOfSecurity],amount = 0,brought[] = new int[noOfSecurity],sold[] = new int[noOfSecurity];
        String ip[];
        for (int i = 0; i < noOfSecurity ; i++) {
            ip = kb.readLine().split(" ");
            item.put(ip[0],i);
            names[i] = ip[0];
            for (int j = 0,k = 0; j < noOfWorkingDay; j++) {
                if(j==5 || j==6 || j==12 || j==13 || j==19 || j==20 || j==26 || j==27){
                    price[i][j] = 0;
                }else {
                    price[i]
                            [j] =
                            Integer.parseInt(ip[k + 1]);
                    k++;
                }
            }


        }
        String temp;
        while(!(temp=kb.readLine()).equals(eof)){
            ip = temp.split(" ");
            if(ip[1].equals(buy)){
                noOfShare[item.get(ip[2])] += Integer.parseInt(ip[3]);
                System.out.println(price[item.get(ip[2])][Integer.parseInt(ip[0])-1]+" "+(price[item.get(ip[2])][Integer.parseInt(ip[0])-1]*Integer.parseInt(ip[3])));
                amount -= (price[item.get(ip[2])][Integer.parseInt(ip[0])-1]*Integer.parseInt(ip[3]));
            }else if(ip[1].equals(sell)){
                noOfShare[item.get(ip[2])] -= Integer.parseInt(ip[3]);
                System.out.println(price[item.get(ip[2])][Integer.parseInt(ip[0])-1]+" "+(price[item.get(ip[2])][Integer.parseInt(ip[0])-1]*Integer.parseInt(ip[3])));
                amount += (price[item.get(ip[2])][Integer.parseInt(ip[0])-1]*Integer.parseInt(ip[3]));

            }
            //System.out.println(amount);
        }
        for (int i = 0; i < noOfShare.length ; i++) {
            if(noOfShare[i] > 0){
                System.out.println(names[i]+" "+noOfShare[i]);
            }

        }
        if(amount > 0){
            System.out.println("Profit = "+amount);
        }else{
            System.out.println("Loss = "+Math.abs(amount));
        }


    }
}
