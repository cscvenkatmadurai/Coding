/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;
class laboratries {    
    public static void main(String arr[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //String[] arr;
        String temp;
        int n=Integer.parseInt(br.readLine()),i,c;
        arr=new String[n];
        for(i=0;i<n;i++)
            arr[i]=br.readLine();
        Arrays.sort(arr);
        for(i=0;i<n;){
            temp=arr[i];
            i++;
            c=1;
            while((i<n)&&(temp.equals(arr[i]))){
                c++;i++;
            }
            System.out.println(temp+" "+c);
        }
    }
}
