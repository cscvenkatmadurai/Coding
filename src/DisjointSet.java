import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by HARISH on 7/24/2015.
 */
public class DisjointSet {
    int size;
    int root[];
    int height[];
    final int baseHeight = 1;

    DisjointSet(int size){
        this.size = size;
        initialiseArray();
    }
    void initialiseArray(){
        root = new int[size];
        height = new int[size];
        for (int i = 0; i < size ; i++) {
            root[i] = i;
            height[i] = baseHeight;
        }
    }
     int findRoot(int node){
       while(root[node] != node){
           node = root[root[node]];
       }
         return node;
    }
     void union(int node1,int node2){
         int root1 = findRoot(node1);
         int root2 = findRoot(node2);
         if(root1 != root2){
             if(height[root1]< height[root2]){
                 root[root1] = root[root2];
                 height[root2] += height[root1];
             }else{
                 root[root2] = root[root1];
                 height[root1] += height[root2];
             }

         }

     }
    boolean find(int node1,int node2){
        return (findRoot(node1)==findRoot(node2))?true:false;
    }
    int findMaxHeight(){
        int maxHeight = 0;
        for (int i = 0; i < height.length ; i++) {
            if(maxHeight < height[i]){
                maxHeight = height[i];
            }
        }
        return maxHeight;
    }
    int noOfSets(){
        HashSet<Integer> noOfSet = new HashSet<>();
        for (int i = 0; i < size ; i++) {
            noOfSet.add(findRoot(i));
        }
        return noOfSet.size();
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int no = kb.nextInt();
        int rel = kb.nextInt();
        DisjointSet ds = new DisjointSet(no);
        for (int i = 0; i < rel; i++) {
            int r1 = kb.nextInt()-1;
            int r2 = kb.nextInt()-1;
            ds.union(r1, r2);
        }
        System.out.println(ds.noOfSets());



    }
}
