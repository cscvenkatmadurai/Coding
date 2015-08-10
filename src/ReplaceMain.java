import javax.sql.rowset.BaseRowSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 7/30/2015.
 */
public class ReplaceMain {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new FileReader("C:\\Users\\HARISH\\IdeaProjects\\Coding\\src\\Add.java"));
        String temp,code = null;

        while((temp= kb.readLine())!=null){
            code+=temp;
//           code +="\n";
        }
        System.out.println(code);
        String ans = code.replaceAll("public +static +void +main *\\(String.*\\)\\{.+\\}", "System.out.println();");
        System.out.println(ans);
        kb.close();

    }
}
