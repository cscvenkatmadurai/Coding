import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HARISH on 8/7/2015.
 */
 class Beverage {
    public static  boolean check(int arr[],int sum){
        int l,r;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++)
        {

            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = arr.length-1; // index of the last element
            while (l < r)
            {
                if( arr[i] + arr[l] + arr[r] == sum)
                {

                    return true;
                }
                else if (arr[i] + arr[l] + arr[r] < sum)
                    l++;
                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        return false;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(),arr[] = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = kb.nextInt();
        }
        int x = kb.nextInt();
        if(check(arr,x)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



    }
}
