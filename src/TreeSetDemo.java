import java.util.*;

public class TreeSetDemo {

    public static void main(String args[]) {
        // Create a tree set
        TreeSet <String> ts = new TreeSet<>();
        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("B");
        ts.add("B");
        ts.add("F");
        ts.add("D");
        ts.add("C");
        System.out.println(ts);
        LinkedList<String> l = new LinkedList(ts);
        System.out.println(l);
    }
}