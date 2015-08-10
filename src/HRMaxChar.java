import java.io.*;
public class HRMaxChar {
    public static int findMaxIndex(long arr1[],long arr2[]){
        int index = -1;
        long max = 0;
        for (int i = 0; i < arr2.length ; i++) {
            if(arr2[i] > max && arr1[i] < arr2[i]){
                max = arr2[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb =new BufferedReader( new InputStreamReader( System.in ));
        int no = Integer.parseInt( kb.readLine() ),len = 0,maxIndex;
        long arr1[] = new long[no],arr2[] = new long[no],sum1 = 0,sum2 =0 ;
        String ip[];
        ip = kb.readLine().split(" ");
        for (int i = 0; i < ip.length; i++) {
            arr1[i] = Long.parseLong(ip[i]);
            sum1+=arr1[i];
        }
        ip = kb.readLine().split(" ");
        for (int i = 0; i < ip.length; i++) {
            arr2[i] = Long.parseLong(ip[i]);
            sum2+=arr2[i];
        }
        len = arr1.length;
        if(sum1 >= sum2){
            System.out.println(arr1.length);
        }else{
            while(sum2 > sum1 && len >=1){

                maxIndex = findMaxIndex(arr1,arr2);
                if(maxIndex == -1){
                    len = 0;
                    break;
                }

                sum2 -= arr2[maxIndex];
                sum1 -= arr1[maxIndex];
                arr1[maxIndex] =  arr2[maxIndex] = 0;
                len--;

            }
            System.out.println(len);
        }



    }

}