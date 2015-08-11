/**
 * Created by HARISH on 5/3/2015.
 */
import java.util.TreeSet;
public class TreeSetBySai {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        addValues(t);
        printValues(t);
        int saiIsGreat =10;
        saiIsGreat= 5;
        saiIsGreat = 45;
    }

    public static void printValues(TreeSet t) {
        System.out.println(t);
    }

    public static void addValues(TreeSet t) {
        t.add('z');
        t.add('A');
        t.add('b');
        t.add('A');
    }
}
