/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package javaapplication2;

/**
 *
 * @author thiru_000
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
	 static int count;
    static boolean flag=false;
    static void func(int a)
    {
        
    
        int b;
        if(a==3 && flag == false)
        {
            count++;
            flag=true;
        }
        if(a>3)
        {
            if(a%2==0)
            {
                a=a/2;
                count++;
                func(a);
                func(a);
            }
            else
            {
                b=a-(a/2);
                a=a/2;
                count++;
                func(a);
                func(b);
                
            }
        }
    }
    public static void main(String[] args)throws Exception {
        Scanner s = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
        int t = s.nextInt();
        
        for(int i=1;i<=t;i++)
        {
            int d = s.nextInt();
            int sum = 0;
           
            int a;
            count=0;
            flag=false;
			int max= 0;
            for(int j=0;j<d;j++)
            {
                a=s.nextInt();
                func(a);
				if(a > max){
					max = a;
				}
                    
                
            }
            count+=2;
			int min = Integer.min(count,max);
            out.println("Case #"+i+": "+min);
        
		}
		out.close();
}
}