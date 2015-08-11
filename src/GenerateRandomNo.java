import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by HARISH on 7/21/2015.
 */
public class GenerateRandomNo {
    public static void main(String[] args) throws IOException{
         Random r = new Random();
        PrintWriter out = new PrintWriter(new FileWriter("test.txt"));
        int testCase = 10,arrSize = 99990;

        out.println(testCase);
        for (int i = 0; i < testCase; i++) {
            out.println(arrSize);

            for (int j = 0; j < arrSize; j++) {
                out.print(r.nextInt(999999990) + " ");
            }
            System.out.println();
        }
        out.close();
    }
}
