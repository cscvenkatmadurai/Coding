import java.util.Scanner;

/**
 * Created by HARISH on 7/25/2015.
 */
public class KiraDs {
    int size;
    int root[];
    //int height[];
    final int baseHeight = 1;

    KiraDs(int size){
        this.size = size;
        initialiseArray();
    }
    void initialiseArray(){
        root = new int[size];
    //    height = new int[size];
        for (int i = 0; i < size ; i++) {
            root[i] = i;
  //          height[i] = baseHeight;
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
            //if(height[root1]< height[root2]){
                root[root1] = root[root2];
            //    height[root2] += height[root1];
           // }else{
              //  root[root2] = root[root1];
           //     height[root1] += height[root2];
            //}

        }

    }
    boolean find(int node1,int node2){
        return (findRoot(node1)==findRoot(node2))?true:false;
    }
    /*int findMaxHeight(){
        int maxHeight = 0;
        for (int i = 0; i < height.length ; i++) {
            if(maxHeight < height[i]){
                maxHeight = height[i];
            }
        }
        return maxHeight;
    }*/
    void remove(int node1,int node2){
        int root1 = findRoot(node1);
        int root2 = findRoot(node2);

        if(node1 == root2){
            root[node2] = node2;
        }else if (node2 == root1){
            root[node1] = root1;
        }

    }
    boolean allRootSame(){
        boolean ans = true;
        int root = findRoot(0);
        for (int i = 0; i < size && ans; i++) {
            if(root != findRoot(i)){
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        KiraDs ds = new KiraDs(n);
        int r = kb.nextInt(),ip[][] = new int[r][3];
        for (int i = 0; i < r; i++) {
            ip[i][0] = kb.nextInt();
            ip[i][1] = kb.nextInt();
            ip[i][2] = kb.nextInt();

            ds.union(ip[i][1],ip[i][2]);

        }
        int q = kb.nextInt();
        for (int i = 0; i < q; i++) {
            int id = kb.nextInt();
            ds.remove(ip[id][1],ip[id][2]);
            if(ds.allRootSame()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            ds.union(ip[id][0],ip[id][1]);
        }
    }

}
