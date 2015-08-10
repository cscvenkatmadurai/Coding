/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class NumberListHR {
    int x,y;

    public NumberListHR(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean flag = true;
        int val = kb.nextInt(),i =0,max;
        
        Queue <NumberListHR>q = new LinkedList<NumberListHR>();
        Queue <NumberListHR>q1 = new LinkedList<NumberListHR>();
        q.add(new NumberListHR(1,1));
        NumberListHR temp,maximum;
        while(flag){
            q1 = new LinkedList<NumberListHR>();
            i++;
            max = 0;
            maximum = new NumberListHR(0, 0);
            while(q.size()>0 && flag){
                temp = q.remove();
                if((2*temp.x+temp.y) > (temp.x+2*temp.y)){
                    maximum = new NumberListHR(temp.x,temp.x+temp.y);
                    
                    
                }else{
                    maximum = new NumberListHR(temp.x+temp.y, temp.y);
                }
                if(val == maximum.x+maximum.y){
                    flag = false;
                }
               
            }
            System.out.println(maximum.x +" "+maximum.y);
            q1.add(maximum);
            q = q1;
        }
        System.out.println(i);
    }
    
    
}
