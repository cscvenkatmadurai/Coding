import java.io.DataInputStream;
import java.io.InputStream;

/**
 * Created by HARISH on 6/3/2015.
 */
public class HESharpenPencil {

    final private int BUFFER_SIZE = 1 << 17;
    public DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    public static long count = 0;

    public HESharpenPencil(InputStream in) {
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

    public static void main(String[] args) throws Exception {
        HESharpenPencil kb = new HESharpenPencil(System.in);
        int tt = kb.nextInt(),n,sum ;
        long x,arr[];
        boolean flag = true;
        while(tt-- > 0){
             n = kb.nextInt();
             x = kb.nextLong();
            arr = new long[n];
            sum = 0;
            flag = true;
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextLong();
            }
            for (int i = 0; i < n && flag ; i++) {
                sum = 0;
                for (int j = i; j < n && sum<x ; j++) {
                    sum+=arr[j];
                }
            //    System.out.println(i+" "+sum);
                if(sum == x){
                    System.out.println("YES");
                    flag = false;
                }

            }
            if(flag){
                System.out.println("NO");
            }
        }



    }
}
