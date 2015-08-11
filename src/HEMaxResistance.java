import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Stack;


/**
 * Created by HARISH on 6/2/2015.
 */
public class HEMaxResistance {
    final private int BUFFER_SIZE = 1 << 17;
    public DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public HEMaxResistance(InputStream in) {
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
    public static long operation(char operation,long operand1,long operand2){
        return (operation=='A')?operand1+operand2:(operand1>operand2)?operand1:operand2;
    }

    public static void main(String[] args) throws  Exception{
        HEMaxResistance kb = new HEMaxResistance(System.in);
        int tt = kb.nextInt(),count,j ,k;
        String ip;
        long arr[];
        Stack <Long> elem;
        Stack <Character> op;
        while(tt-- > 0){
            ip = kb.nextString();
            j = count  = 0;
            for (int i = 0; i < ip.length() ; i++) {
                if(ip.charAt(i) == 'X') {
                    count++;
                }
            }
            arr = new long[count];
            for (int i = 0; i < count; i++) {
                arr[i] = kb.nextLong();


            }
            j = 0;
            k = arr.length-1;
            Arrays.sort(arr);
            elem =  new Stack<>();
            op = new Stack<>();
            for (int i = 0; i < ip.length(); ) {
                if(ip.charAt(i)=='A' || ip.charAt(i)=='B'){
                    if( ip.charAt(i+1) == 'X' && ip.charAt(i+2) == 'X' ){
                        if(ip.charAt(i) == 'A'){
                            elem.push(operation( ip.charAt(i),arr[k],arr[k-1] ));
                            k-=2;
                        }else{
                            elem.push(operation(ip.charAt(i),arr[j],arr[j+1]));
                            j+=2;
                        }
                        i+=3;
                    }else{
                        op.push(ip.charAt(i));
                        if(ip.charAt(i+1)=='X'){
                            if(ip.charAt(i)=='A'){
                                elem.push(arr[k--]);
                            }else{
                                elem.push(arr[j++]);
                            }
                            i++;
                        }
                        i++;

                    }
                }else{
                    char c = op.pop();
                    if(c == 'A'){
                        elem.push(operation(c , arr[k--],elem.pop() ) );
                    }else{
                        elem.push(operation(c, arr[j++],elem.pop() ) );
                    }

                    i++;
                }
            }
            while (op.size() > 0){
                elem.push(operation(op.pop(),elem.pop(),elem.pop()));
            }
            System.out.println(elem.pop());


        }


    }
}
