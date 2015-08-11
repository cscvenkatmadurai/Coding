/**
 * Created by HARISH on 4/23/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;


public class HETreeCity {
    public static void main(String[] args) throws  IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt =Integer.parseInt(kb.readLine() );
        long small,big,ans,untilCommonNode,afterCommonNode;
        String temp[];
        ArrayList <Long>a,b;
        boolean flag;
        while (tt-- > 0){
            temp = kb.readLine().split(" ");
            a = new ArrayList<>();
            b = new ArrayList<>();
            flag = true;
            if(Long.parseLong(temp[0]) < Long.parseLong(temp[1])){
                small = Long.parseLong(temp[0]);
                big = Long.parseLong(temp[1]);
            }else {
                small = Long.parseLong( temp[1]);
                big = Long.parseLong(temp[0]);
            }
            while(small>0){
                a.add(small);
                small/=2;
            }
            while (big > 0){
                b.add(big);
                big/=2;

            }
            /*for (int i = 0; i < a.size(); i++) {
                System.out.println(a.get(a.size()-1-i));
            }
            System.out.println();
            for (int i = 0; i < b.size(); i++) {
                System.out.println(a.get(a.size()-1-i));
            }*/
            untilCommonNode = afterCommonNode =0;
            for (int i = 0; i < a.size() && flag ; i++) {
                if (b.indexOf(a.get(i)) != -1)  {
                    flag = false;
                    untilCommonNode = i;
                    afterCommonNode = b.indexOf(a.get(i));
                }
            }
            System.out.println(2* (untilCommonNode+afterCommonNode) );






         /*   ans  = 0;
            untilCommonNode = 0;
            afterCommonNode = 0;
            if(Long.parseLong(temp[0]) < Long.parseLong(temp[1])){
               small = Long.parseLong(temp[0]);
                big = Long.parseLong(temp[1]);
            }else {
                small = Long.parseLong( temp[1]);
                big = Long.parseLong(temp[0]);
            }
            while(big >= small ){
                big/=2;
                untilCommonNode++;

            }
           while (small!=big){
                small/=2;
                big/=2;
                afterCommonNode++;

            }
          //  afterCommonNode*=2;
            System.out.println( untilCommonNode+" "+afterCommonNode);*/
        }


    }
}
