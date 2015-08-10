/**
 * Created by HARISH on 5/30/2015.
 */

import java.io.*;
import java.util.Arrays;

 class CCRupsa {
    public static void main(String[] args) throws Exception{
//        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ) );
        Read kb = new Read(System.in);
        int tt = kb.nextInt(),arr[],no,min,max,j,k,seqLen;
        String  ip[];
        while(tt-- > 0){
            no = kb.nextInt();
            //ip = kb.readLine().split(" ");
            arr =  new int[no];
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = kb.nextInt();
            }
            Arrays.sort(arr);
            min = max = 0;
            for (int i = 0; i <  arr.length;) {
                j = i;
                for(; j < arr.length-1 && arr[j+1]-arr[j]==1;j++);
                //System.out.println( (j-i)+1 +" "+i+" "+j);
                seqLen = ( (j-i)+1);
                min+=( seqLen>>1 );
                if( (seqLen&1) !=0){
                    min++;
                }
                max+=(seqLen/3);
                if(seqLen%3!=0){
                    max++;
                }

                i=j+1;
            }
            System.out.println(max+" "+min);
        }
    }
}
class Read {

    final private int BUFFER_SIZE = 1 << 17;
    public DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Read(InputStream in) {
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
}

