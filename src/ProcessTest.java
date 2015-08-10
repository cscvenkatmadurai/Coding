import java.io.*;

/**
 * Created by HARISH on 7/28/2015.
 */
public class ProcessTest {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            Process x = r.exec("javac F:\\Add.java");
             BufferedReader kb ;
            String temp;
            kb = new BufferedReader(new InputStreamReader(x.getInputStream()));
            while((temp = kb.readLine())!=null){
                System.out.println(temp);
            }
            kb = new BufferedReader(new InputStreamReader( x.getErrorStream()) );
            temp = null;
            while((temp = kb.readLine())!=null){
                System.out.println(temp);
            }
            System.out.println("comilation over");
            Process p = r.exec("java -cp F:\\ Add < F:\\ip.txt > F:\\op.txt");
            System.out.println("hihihi");
            kb = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while((temp = kb.readLine())!=null){
                System.out.println(temp);
            }
            kb = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            while((temp = kb.readLine())!=null){
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
