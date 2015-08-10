/**
 * Created by HARISH on 7/15/2015.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class AcmBobBingoBonaza {
    static ArrayList<Integer> crossPositonXCordinate,crossPositonYCordinate;
    static boolean arr[][];
    static final String eofZero = "0";
    static final char pattern = 'X',empty = '_';
    static final int noOfRowsOfPattern = 5,maxNumber = 76;
    static int tt,gameNo = 0;
    static BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));


    static void getPatternCooradinates(String row,int rowNo){
        for (int i = 0; i < row.length(); i++) {
            if(row.charAt(i) == pattern ){
                crossPositonYCordinate.add(i);
                crossPositonXCordinate.add(rowNo);
            }
        }
    }

    public static boolean getTestCases() throws IOException{
     //   System.out.println("enter test case");
        boolean exit = false;
        tt = Integer.parseInt(kb.readLine());
        if(tt  == 0){
            exit = true;

        }
        arr = new boolean[tt][maxNumber];
        int singleTt[][] ;
        String temp[];
        for(int k = 0 ; k < tt; k++) {
            singleTt =  new int[noOfRowsOfPattern][noOfRowsOfPattern];
            for (int i = 0; i < noOfRowsOfPattern; i++) {
       //         System.out.println("enter "+(i+1));
                temp = kb.readLine().trim().split(" +");
                for (int j = 0; j < noOfRowsOfPattern; j++) {
                    singleTt[i][j] =

                            Integer.parseInt(temp[j]);
                }
            }
            setBooleanArray(k, singleTt);
     //       printBooleanArray(k);
        }
        return exit;

    }
    public static void findAnswer(){
        int res;
        boolean checkAnswerIsPresent = false;
        for (int i = 1; i < tt ; i++) {
            if ( (res = compareAnArrayWithPreceedingArrays(i)) != -1) {
                if(!checkAnswerIsPresent){
                    System.out.println("Game "+gameNo);
                    checkAnswerIsPresent = true;
                }
                System.out.println("Card "+(i+1)+" is equivalent to card "+(res+1));
            }

        }
        if (checkAnswerIsPresent)
        System.out.println();
    }

    public static boolean checkTwoTestCaseHasSameNumbers(int tt1,int tt2){
        for (int i = 0; i < arr[tt1].length; i++) {
            if(arr[tt1][i]!=arr[tt2][i]){
                return false;
            }
        }
        return true;
    }
    public static int compareAnArrayWithPreceedingArrays(int ttNo){
        for (int i = 0; i < ttNo ; i++) {
            if(checkTwoTestCaseHasSameNumbers(i,ttNo)){
                return i;
            }
        }
        return -1;
    }

    public static void setBooleanArray(int testCaseNo,int singleTt[][]){
        for (int i = 0; i < crossPositonXCordinate.size(); i++) {
            arr[testCaseNo][singleTt[crossPositonXCordinate.get(i)][crossPositonYCordinate.get(i)]-1] = true;
        }

    }
    public static void printBooleanArray(int arrIndex){
        System.out.println(arrIndex+1);
        for (int i = 0; i < arr[arrIndex].length ; i++) {
            if(arr[arrIndex][i])
            System.out.println( (i+1)+" "+arr[arrIndex][i]);
        }

    }
    public static void main(String[] args) throws IOException{
        String ip;
        int i,j,k;
        boolean exit = false;
        do{
            i = j = k = 0;
            gameNo++;
            getPattern();
            exit = getTestCases();
            if(!exit)
            findAnswer();



        }while(!exit);


    }

    public static void getPattern() throws IOException {
        String ip;
        int i;

        crossPositonXCordinate = new ArrayList<>();
        crossPositonYCordinate = new ArrayList<>();
        for (i = 0; i <  noOfRowsOfPattern; i++) {
            ip = kb.readLine();
            getPatternCooradinates(ip,i);
        }
    }
}
