import java.util.Scanner;

/**
 * Created by HARISH on 7/25/2015.
 */
public class Cards2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int no = kb.nextInt();
        if(no<3){
            System.out.println("1");
        }else if(no%3 == 0){
            System.out.println(no/3);
        }else{
            System.out.println(no);
        }
    }
}
