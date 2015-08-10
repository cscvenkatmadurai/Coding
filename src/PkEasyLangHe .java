/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author harish
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
 class PkEasyLangHe {
    static final int size = 26;
    static int arr[][] = new int[size][size],q,s;
    static Scanner kb = new Scanner(System.in);
    static Queue<Integer> q1;
    static Queue<Integer> tq;
    static String ip,temp[];
    static long ans;
    
    static void logic(int charr, int len) {
      q1 = new LinkedList<>();
      tq = new LinkedList();
      ans = 0;
      s = 1;
      int curr,i,j;
      q1.add(charr);
      while(s <= len){
          s++;
          while(q1.size()!= 0){
              curr = q1.remove();
              for(i = 0; i <size;i++){
                  if(arr[i][curr]!=0){
                      
                      tq.add(i);
                      if(s == len){
                          ans = (ans+1)%1000000007;
                      }
                }
              }
          }
          q1 = tq;
          tq = new LinkedList<>();
          
      }
        System.out.println(ans);
      
    }
    
    static void getIp(){
        int i,j;
        for(i = 0;i < size;i++){
            for(j = 0;j < size;j++){
                arr[i][j] = kb.nextInt();
            }
        }
        q = kb.nextInt();
        kb.nextLine();
        for(i = 0;i < q;i++){
            ip = kb.nextLine();
            temp = ip.split(" ");
            logic(temp[0].charAt(0)-97,Integer.parseInt(temp[1]));
        }
    }
    public static void main(String arg[]){
        getIp();
    }
}