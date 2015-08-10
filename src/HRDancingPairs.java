/**
 * Created by HARISH on 6/21/2015.
 */
import java.io.*;
import java.util.*;
public class HRDancingPairs {


        final private int BUFFER_SIZE = 1 << 17;
        public DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public HRDancingPairs(InputStream in) {
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
        HRDancingPairs kb = new HRDancingPairs(System.in );

        int no,k,ans = 0,count = 0,boy[],girl[],counti = 0,countj = 0 ,i,j;
        no = kb.nextInt();
        k = kb.nextInt();
        boy = new int[no];
        girl = new int[no];
        for ( i = 0; i < no ; i++) {
            boy[i] = kb.nextInt();
        }
        for ( i = 0; i < no; i++) {
            girl[i] = kb.nextInt();
        }

        Arrays.sort(boy);
        Arrays.sort(girl);
        int ans1 = getAns(no, k, boy, girl) ;
      //  System.out.println(ans1);
      //  System.out.println();
        int ans2 = getAns(no,k,girl,boy);
        if(  ans1 > ans2 ){
            ans = ans1;
        }else{
            ans = ans2;
        }
        System.out.println(ans);

    }

    public static int getAns(int no, int k, int[] boy, int[] girl) {
        int j,ans = 0;
        int i;
        int counti;
        int countj;
        i = j =0;
        while (i < no && j < no  ){

            countj  = counti = 0;
            for(;j < no && Math.abs(boy[i]-girl[j]) <=k;j++ ){
                countj++;
            }
         //   System.out.println(countj+" "+"couintj");
            for (; counti < countj && i < no && Math.abs(boy[i]-girl[j-1]) <=k ;) {
                ans++;
                counti++;
                i++;
            }
            if(counti == 0){
                i++;
            }
       //    System.out.println(i+" "+j);
        }
        return ans;
    }
}
