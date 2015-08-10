import java.io.DataInputStream;
import java.io.InputStream;

/**
 * Created by HARISH on 6/3/2015.
 */
public class HELadderRide {
    final private int BUFFER_SIZE = 1 << 17;
    public DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    public static long count = 0;

    public HELadderRide(InputStream in) {
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
    public static void recurse(int n,int cur,int k){
        if(n>=cur){
            if(n==cur) {
                count++;
            }
            return;
        }else{
            recurse(n+2,cur,k);
            recurse(n+5,cur,k);
            recurse(n+k,cur,k);
        }
        return;
    }

    public static void main(String[] args) throws Exception{
        HELadderRide kb = new HELadderRide(System.in);
        int tt = kb.nextInt(),n = kb.nextInt(),curr,k;
        while(tt-- > 0){
            curr = kb.nextInt();
            k = kb.nextInt();
            count = 0;
            recurse(0,curr,k);
            System.out.println(count%1000000007);
        }
    }
}
