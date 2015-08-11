/**
 * Created by HARISH on 6/10/2015.
 */
import java.io.*;
class ReaderChefAndLimit {

    final private int BUFFER_SIZE = 1 << 17;
    public DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public ReaderChefAndLimit(InputStream in) {
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
 class CCChefAndLimit {
    public static void main(String[] args) throws Exception{
        ReaderChefAndLimit kb = new ReaderChefAndLimit(System.in);
        int tt = kb.nextInt(),n;
        long ans = 0,arr[],alloc;
        String ip[];
        while(tt-- > 0){
            n = kb.nextInt();
            arr = new long[n];
            //ip = kb.readLine().split(" ");
            alloc = ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextLong() ;
            }
            for (int i = 0; i < n ; i++) {
                if(alloc<arr[i]){
                    ans=ans + (arr[i]-alloc);

                }
                alloc = arr[i];

            }
            System.out.println(ans);

        }
    }
}
