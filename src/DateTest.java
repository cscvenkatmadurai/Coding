import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by HARISH on 5/23/2015.
 */
public class DateTest {
    public static void main(String[] args) throws  Exception{
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
        Date d = sd.parse("2015-12-03");
        System.out.println(d);
    }
}
