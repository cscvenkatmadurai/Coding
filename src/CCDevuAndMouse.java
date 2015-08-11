/**
 * Created by HARISH on 6/7/2015.
 */
import java.io.DataInputStream;
import java.io.InputStream;
class Reader1 {

    final private int BUFFER_SIZE = 1 << 17;
    public DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader1(InputStream in) {
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
 class CCDevuAndMouse {
    public static void main(String[] args) throws Exception{
        ReaderChefAndLimit kb = new ReaderChefAndLimit(System.in);
        int tt = kb.nextInt(),arr[],mat[][],bomb;
        while(tt-- > 0){
            arr = new int[7];
            for (int i = 0; i < 7 ; i++) {
                arr[i] = kb.nextInt();
            }
            bomb = ( (arr[5]-1) * (arr[0]) )+ (arr[6]-1);
            mat = new int[arr[0] * arr[0] ][arr[0] * arr[0] ];
            for (int i = 0; i < arr[0] * arr[0] ; i++) {
                for (int j = 0; j < arr[0] * arr[0] ; j++) {
                    mat[i][j]= 1000;
                }
                if( ( i %arr[0]) !=0  && i!=bomb && (i-1)!=bomb  ){
                    mat[i][i-1] = 1;
                }
                if( ((i+1) %arr[0])!=0  && i!=bomb && (i+1)!=bomb ){
                    mat[i][i+1] = 1;
                }
                if( (i+1) > arr[0]  && i!=bomb && (i-arr[0])!=bomb ){
                    mat[i][i-arr[0]]=1;
                }
                if( (arr[0]*arr[0] ) - arr[0]  > i  && i!=bomb && (i+arr[0])!=bomb  ){
                    mat[i][i+arr[0]] = 1;
                }
            }


            for (int i = 0; i < arr[0] * arr[0] ; i++) {
                for (int j = 0; j < arr[0] * arr[0]; j++) {
                    for (int k = 0; k < arr[0] * arr[0] ; k++) {
                        if( mat[j][i]+mat[i][k] < mat[j][k] ){
                             mat[j][k] = mat[j][i]+mat[i][k] ;
                        }
                    }
                }
            }
            System.out.println(mat[( (arr[1]-1) * (arr[0]) )+ (arr[2]-1) ][ ( (arr[3]-1) * (arr[0]) )+ (arr[4]-1)  ]);




        }
    }
}
