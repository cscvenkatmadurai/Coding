import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by HARISH on 7/21/2015.
 */
public class HRJourneyToMoon {

    static ArrayList<Integer> arr[];
    static int isVisited[];
    final static int notVisited = 0 ,visiting = 1 , visited = 2;
    static long noOfConnectedComp,connectedCompSize;
    static ArrayList<Long> connectedCompSizes;
    public static void dfs(){
          noOfConnectedComp = connectedCompSize = 0;
        isVisited = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if(isVisited[i] == 0){
                noOfConnectedComp++;
                connectedCompSize = 0;
                dfs_visit(i);

                connectedCompSizes.add(connectedCompSize);
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
    public static void getIp() throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        connectedCompSizes = new ArrayList<>();
        String ip[] = kb.readLine().split(" ");
        ArrayList<Integer> uniqueNodes = new ArrayList<>();
        int rel = Integer.parseInt(ip[1]);
        String ipRel[][] = new String[Integer.parseInt(ip[1])][2];
        for (int i = 0; i < rel; i++) {
            ipRel[i] = kb.readLine().split(" ");
            if(uniqueNodes.size()==0 || uniqueNodes.lastIndexOf(Integer.parseInt(ipRel[i][0]))==-1){
                uniqueNodes.add(Integer.parseInt(ipRel[i][0]));
            }

            if(uniqueNodes.size()==0 || uniqueNodes.lastIndexOf(Integer.parseInt(ipRel[i][1]))==-1){
                uniqueNodes.add(Integer.parseInt(ipRel[i][1]));
            }
        }
        arr = new ArrayList[uniqueNodes.size()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < rel ; i++) {
            if( arr[uniqueNodes.indexOf(Integer.parseInt(ipRel[i][0])) ].size() == 0 ||

                    arr[uniqueNodes.indexOf(Integer.parseInt(ipRel[i][0])) ].lastIndexOf( uniqueNodes.indexOf( Integer.parseInt(ipRel[i][1]))) == -1){
                arr[uniqueNodes.indexOf(Integer.parseInt(ipRel[i][0]))].add( uniqueNodes.indexOf(Integer.parseInt(ipRel[i][1])) );
            }
            if( arr[uniqueNodes.indexOf(Integer.parseInt(ipRel[i][1])) ].size() == 0 ||

                    arr[uniqueNodes.indexOf(Integer.parseInt(ipRel[i][1])) ].lastIndexOf( uniqueNodes.indexOf(Integer.parseInt(ipRel[i][0]))) == -1){
                arr[uniqueNodes.indexOf(Integer.parseInt(ipRel[i][1]))].add( uniqueNodes.indexOf(Integer.parseInt(ipRel[i][0])) );
            }


        }



    }
    public static void calcCombination(){
        long ans = 0;
        for (int i = 0; i < connectedCompSizes.size() ; i++) {
            for (int j = i+1; j < connectedCompSizes.size() ; j++) {
                ans += (connectedCompSizes.get(i)*connectedCompSizes.get(j));

            }

        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException{
        getIp();
        dfs();
        calcCombination();
    }

}
