/**
 * Created by HARISH on 6/24/2015.
 */
import java.io.*;
public class HRMazeBT {
    static boolean ans;
    final private int BUFFER_SIZE = 1 << 17;
    public DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    static HRMazeBT kb;
    static{

         kb = new HRMazeBT(System.in);

    }
    public HRMazeBT(InputStream in) {
        din = new DataInputStream(in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String nextString() throws Exception {
        StringBuffer sb = new StringBuffer("");
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        do {
            sb.append((char) c);
            c = read();
        } while (c > ' ');
        return sb.toString();
    }

    public char nextChar() throws Exception {
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        return (char) c;
    }

    public int nextInt() throws Exception {
        int ret = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        do {
            ret = ret * 10 + c - '0';
            c = read();
        } while (c > ' ');
        return ret;
    }

    public long nextLong() throws Exception {
        long ret = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        do {
            ret = ret * 10 + c - '0';
            c = read();
        } while (c > ' ');
        return ret;
    }

    public void skipNext() throws Exception {
        byte c = read();
        while (isSpaceChar(c)) {
            c = read();
        }
        do {
            c = read();
        } while (!isSpaceChar(c));
    }

    private static boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private void fillBuffer() throws Exception {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) {
            buffer[0] = -1;
        }
    }

    private byte read() throws Exception {
        if (bufferPointer == bytesRead) {
            fillBuffer();
        }
        return buffer[bufferPointer++];
    }


    public static void main(String[] args) throws Exception{
      //  BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );

        int tt = kb.nextInt(),n;
        int arr[][] = null;
        String ip[];
        while(tt-- > 0){
            n = kb.nextInt();
            arr = new int[n][n];
            ans = false;
            getInputArray( n, arr);
            //printArray(n, arr);
            backTrack(arr,0,0,n);
            if(ans){
                System.out.println("POSSIBLE");
            }else{
                System.out.println("NOT POSSIBLE");
            }


        }


    }
    public static void backTrack(int arr[][],int row,int col,int n){
        if(ans){
            return;
        }
        if(row == (n-1)  && col == (n-1) ){
            ans = true;
            return;
        }
        if(checkDown(arr,row,col,n) || checkRight(arr,row,col,n)){
            if(checkDown(arr,row,col,n)){
                backTrack(arr,row+1,col,n);
            }
            if(checkRight(arr,row,col,n)){
                backTrack(arr,row,col+1,n);
            }


        }else{
            return;
        }




    }
    public static boolean checkRight(int arr[][],int row,int col,int n){
        if( (col+1<n) && (arr[row][col+1] ) == 1 ){
            return true;
        }
        return false;

    }

    public static boolean checkDown(int arr[][],int row,int col,int n){
        if( (row+1<n) && (arr[row+1][col] ) == 1 ){
            return true;
        }
        return false;

    }

    public static void getInputArray( int n, int[][] arr) throws Exception {
        String[] ip;
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
    }

    public static void printArray(int n, char[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
    }
}
