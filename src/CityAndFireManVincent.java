import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HARISH on 7/30/2015.
 */
public class CityAndFireManVincent {

    int root[];
    int size[];
    ArrayList<Integer> listNumbers;
    CityAndFireManVincent(int no){
        root = new int[no];
        size = new int[no];
        listNumbers = new ArrayList<>();
        initialiseArray();
    }
    void initialiseArray(){
        for (int i = 0; i < root.length ; i++) {
            root[i] = i;
            size[i] = 1;
            listNumbers.add(i);
        }
    }
    int findRoot(int node){
        while(node != root[node]){
            node = root[root[node]];
        }
        return node;
    }
    boolean find(int node1,int node2){
        return findRoot(node1)==findRoot(node2);
    }
    void union(int node1,int node2){
        int root1 = findRoot(node1);
        int root2 = findRoot(node2);
      //  System.out.println(root1+" "+root2);
       // System.out.println(listNumbers.indexOf(root1)+" "+listNumbers.indexOf(root2));
        if(root1!=root2){
            if(size[root1] < size[root2]){
                root[root1] = root[root2];
                size[root2] +=size[root1];
                listNumbers.remove(listNumbers.indexOf(root1));
            }else{
                root[root2] = root[root1];
                size[root1] += size[root2];
                listNumbers.remove(listNumbers.indexOf(root2));
            }
        }
    }
    int noOfMinElements(int riskFactor[],int set){
        int min = Integer.MAX_VALUE,noOfElem = 0;
        for (int i = 0; i < root.length ; i++) {
            if(findRoot(i) == set){
                if(riskFactor[i] < min){
                    min = riskFactor[i];
                    noOfElem = 1;
                }else if(riskFactor[i] == min ){
                    noOfElem++;
                }
            }
        }
        return noOfElem;
    }

    public static void main(String[] args) {
        long ans = 1;
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(),riskFactor[],q,c1,c2;
        riskFactor = new int[n];
        CityAndFireManVincent ds = new CityAndFireManVincent(n);
        for (int i = 0; i < n; i++) {
            riskFactor[i] = kb.nextInt();
        }
        q = kb.nextInt();
        for (int i = 0; i < q; i++) {
            c1 = kb.nextInt()-1;
            c2 = kb.nextInt()-1;
            ds.union(c1,c2);
        }
        for (int i = 0; i <ds.listNumbers.size() ; i++) {
            ans = (ans *  ds.noOfMinElements(riskFactor,ds.listNumbers.get(i)))%1000000007;
        }
        System.out.println(ans);



    }
}
