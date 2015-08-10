import java.util.*;

/**
 * Created by HARISH on 7/25/2015.
 */
public class KiraAndRestOfWorld {
    static ArrayList<String> name;
    static ArrayList<Integer> arr[] = null;
    static int isVisited[];
    final static int notVisited = 0 ,visiting = 1 , visited = 2;
    static HashMap<Integer,Integer> hm;
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
            if(connectedCompSize == arr.length){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            break;
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
        int n = kb.nextInt();
        int r = kb.nextInt();
        int ip[][] = new int[n][3];
        HashSet<Integer> uniqueElements = new HashSet<>();


        for (int i = 0; i < r  ; i++) {
            for (int j = 0; j < 3 ; j++) {
                ip[i][j] = kb.nextInt();
            }
            uniqueElements.add(ip[i][1]);
            uniqueElements.add(ip[i][2]);

        }
        int querry = kb.nextInt();
        if(uniqueElements.size() != n){
            for (int i = 0; i < r ; i++) {
                System.out.println("NO");
            }

        }else {


            arr = new ArrayList[n];
            for (int i = 0; i < n; i++) {

                arr[i] = new ArrayList<>();
            }
            for (int i = 0; i < r; i++) {
                if (arr[ip[i][1]].size() == 0 || arr[ip[i][1] ].indexOf(ip[i][2] ) == -1) {
                    arr[ip[i][1] ].add( ip[i][2]);
//                System.out.print(ip[i][2]);
                }
                if (arr[ip[i][2] ].size() == 0 || arr[ip[i][2] ].indexOf( ip[i][1]) == -1) {
                    arr[ip[i][2] ].add(ip[i][1] );
                }

            }
            while (querry-- > 0) {
                int id = kb.nextInt();
                // System.out.println(ip[id][1]+" "+ip[id][2] );
                arr[ip[id][1] ].remove( arr[ip[id][1]].indexOf( ip[id][2]));
                arr[ ip[id][2] ].remove(arr[ ip[id][2]].indexOf( ip[id][1]));
                dfs();
                arr[ ip[id][1] ].add( ip[id][2]);
                arr[ ip[id][2] ].add( ip[id][1]);

            }

        }


   }

    public static void main(String[] args) {
        getInput();
    }
}
