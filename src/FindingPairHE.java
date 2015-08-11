/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARISH
 */
import java.util.Scanner;
import java.util.Arrays;
 class FindingPairHE {
    public static void main(String arg[]){
        Scanner kb = new Scanner(System.in);
        int tt = kb.nextInt(),n,arr[],temp,i,j,k,temp1;
        long ans;
        while(tt-- > 0){
            n = kb.nextInt();
            arr = new int[n];
            ans = 0;
            for(i = 0;i < n;i++){
                arr[i] =  kb.nextInt();
            }
            Arrays.sort(arr);
           for(i = 0;i<n;){
               //System.out.println(i);
               temp = i;
               temp1 = 0;
               while(i<n && arr[i]==arr[temp]){
                   temp1++;
                   i++;
               }
               ans+= ( (temp1*(temp1+1) )/2);
           }
           System.out.println(ans);
           
        }
    }
}
