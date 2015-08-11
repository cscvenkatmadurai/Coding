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
import java.util.Arrays;
 class CCViratAndNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader kb;
        int no;
        String temp[];
        long arr[],noOfNegNo = 0,ans = 1,np;
        int i;
        
        kb = new BufferedReader( new InputStreamReader( System.in ) );
        no = Integer.parseInt(kb.readLine());
        temp = kb.readLine().split(" ");
        arr = new long[temp.length];
        for(i = 0;i < temp.length;i++){
           arr[i] = Long.parseLong(temp[i]);
            if(arr[i]<0){
                noOfNegNo++;
            }
        }
        
        Arrays.sort(arr);
        //System.out.println(noOfNegNo);
        if(noOfNegNo == 0){
            ans = arr[0];
        }else{
            if(noOfNegNo%2 == 0){
                noOfNegNo--;
            }
            for(i = 0;i < noOfNegNo;i++){
                ans*=arr[i];
                
            }
            for(i = arr.length-1;arr[i]>0;i--){
                ans*=arr[i];
            }
           
        }
        System.out.println(ans);
        
        
        
    }
}
