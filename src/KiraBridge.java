import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by HARISH on 7/26/2015.
 */
public class KiraBridge {
    static int nodes;
    static int edges;
    static boolean isVisited[];
    static  int parent[];
    static int disc[],low[],time;
    static ArrayList<Integer> adj[];
    static ArrayList<Integer> bridgeEdgeU;
    static ArrayList<Integer> bridgeEdgeV;
    static final int root = 0,parentNil = -1;
    static int ip[][];
    static boolean isBridge[];




    public static  void dfsBridgeInit(){
        isVisited = new boolean[nodes];
        parent = new int[nodes];
        disc = new int[nodes];
        low = new int[nodes];
        Arrays.fill(parent,parentNil);
        time = 0;
        isBridge = new boolean[edges];

        for (int i = 0; i < adj.length ; i++) {
            if(!isVisited[i]){
                dfsBridgeGraph(i);
            }

        }

    }
    public static void dfsBridgeGraph(int node){
        time++;

        disc[node ] = low[node] = time++;
        isVisited[node] = true;

        for (int i = 0; i < adj[node].size() ; i++) {
            int v = adj[node].get(i);
            if(!isVisited[v]){
                parent[v] = node;
                dfsBridgeGraph(v);
                low[node] = Math.min(low[node],low[v]);

                if(disc[node] < low[v]){
                    mapEdgeToId(node, v);
                //    System.out.println(node+" "+v);
                }


            }else if(parent[node] != v){
               // low[node] =  Math.min(low[node],disc[v]);
                low[node] =  Math.min(low[node],low[v]);
            }
        }


    }
    static void getInput(){
        Scanner kb = new Scanner(System.in);
        nodes = kb.nextInt();
        edges = kb.nextInt();
        HashSet<Integer> tempAdj[] = new HashSet[nodes];
        ip = new int[edges][2];
        for (int i = 0; i < tempAdj.length ; i++) {
            tempAdj[i] = new HashSet<>();
        }
        for (int i = 0; i < edges ; i++) {
            kb.nextInt();
            ip[i][0] = kb.nextInt();
            ip[i][1] = kb.nextInt();
            tempAdj[ip[i][0]].add(ip[i][1]);
            tempAdj[ip[i][1]].add(ip[i][0]);
        }
        adj = new ArrayList[nodes];
        for (int i = 0; i < nodes ; i++) {
            adj[i] = new ArrayList<>(tempAdj[i]);
        }

        dfsBridgeInit();
        int q = kb.nextInt();
        for (int i = 0; i < q; i++) {
            int id = kb.nextInt();
            if(isBridge[id]){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }


    }
    static void mapEdgeToId(int u , int v){

        for (int i = 0; i < ip.length; i++) {
            if(ip[i][0] == u && ip[i][1] == v){
                isBridge[i] = true;
                break;
            }
        }

    }

    public static void main(String[] args) {
        getInput();

    }



}
