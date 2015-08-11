import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by HARISH on 7/21/2015.
 */
public class DfsGraph {
    static ArrayList<String> name;
    static ArrayList<Integer> arr[] = null;
    static int isVisited[];
    final static int notVisited = 0 ,visiting = 1 , visited = 2;
    static Scanner kb = new Scanner(System.in);

    static long longestConnectedComponent,noOfConnectedComp,connectedCompSize;


    public static void dfs(){
        longestConnectedComponent = noOfConnectedComp = connectedCompSize = 0;
        isVisited = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if(isVisited[i] == 0){
                noOfConnectedComp++;
                connectedCompSize = 0;
                dfs_visit(i);
                if(connectedCompSize > longestConnectedComponent){
                    longestConnectedComponent = connectedCompSize;
                }
            }
        }

    }
    public static void dfs_visit(int i){

        if(isVisited[i] == 0){
            isVisited[i] = visiting;
            connectedCompSize++;
            for (int j = 0; j < arr[i].size(); j++) {
                int node = arr[i].get(j);
                if(isVisited[node] == notVisited){
                    dfs_visit(node);
                }
            }
            isVisited[i] = visited;


        }

    }

    public static void getInput(){
        int no  = kb.nextInt();
        int relation = kb.nextInt();
        arr = new ArrayList[no];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < relation ; i++) {
            int r1 = kb.nextInt();
            int r2 = kb.nextInt();
            if( arr[r1].size() == 0 ||

                    arr[r1].lastIndexOf(r2) == -1){
                arr[r1].add(r2);
            }
            if( arr[r2].size() == 0 ||  arr[r2].lastIndexOf(r1) == -1){
                arr[r2].add(r1);
            }

        }



    }

    public static void main(String[] args) {
        getInput();
        dfs();
        System.out.println(longestConnectedComponent);


    }

}
