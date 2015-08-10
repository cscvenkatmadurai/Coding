/**
 * Created by HARISH on 4/19/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 class CCVersionControl {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt(kb.readLine()),no,ig,tr,ign[],tra[],igAndTra,unIgAndUnTra,j,k;
        boolean ignore,track;
        String temp[];
        while(tt-- > 0){
            temp = kb.readLine().split(" ");
            no = Integer.parseInt(temp[0]);
            ig = Integer.parseInt(temp[1]);
            tr = Integer.parseInt(temp[2]);
            temp = kb.readLine().split(" ");
            ign = new int[ig];
            tra = new int[tr];
            for (int i = 0; i <ig ; i++) {
                ign[i] = Integer.parseInt(temp[i]);
            }
            temp = kb.readLine().split(" ");
            for (int i = 0; i <tr ; i++) {
                tra[i] = Integer.parseInt(temp[i]);
            }
            igAndTra =0;
            unIgAndUnTra =0;
            j = 0;
            k = 0;
            for (int i = 1; i<= no ; i++) {
                ignore = true;
                track = true;

                for(;j < ign.length && ign[j]<i;j++ );
                for(;k<tra.length && tra[k]<i;k++);
;
                if( (j == ign.length && k == tra.length )  || ( k < tra.length && j == ign.length && tra[k]!=i) || (j < ign.length && k == tra.length && ign[j]!=i) || (j < ign.length && k < tra.length && ign[j]!=i && tra[k]!=i) ) {
                    unIgAndUnTra++;
                }
                else if( (j < ign.length && k <tra.length )&& (ign[j] == i ) && (tra[k] == i) ){
                    igAndTra++;
                }


            }
            System.out.println(igAndTra+" "+unIgAndUnTra);
        }

    }
}
