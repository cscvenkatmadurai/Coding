import java.util.ArrayList;

/**
 * Created by HARISH on 5/19/2015.
 */
import java.io.*;
import java.util.Collections;

class UvaBorrowers implements Comparable<UvaBorrowers>{
    String authour;
    String title;
    boolean present;

    public UvaBorrowers(String authour, String title, boolean present) {
        this.authour = authour;
        this.title = title;
        this.present = present;

    }
    public int compareTo(UvaBorrowers a){
        if(this.authour.equals(a.authour)){
            if(this.title.compareTo(a.title) <0){
                return -1;
            }else{
                return 1;
            }
        }else if(this.authour.compareTo(a.authour) < 0){
            return -1;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) throws  IOException{


        int retC = 0;
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        String arr[],ip;
        ArrayList<UvaBorrowers> input = new ArrayList<>();
        ArrayList<UvaBorrowers> returnB = new ArrayList<>();
        ArrayList<UvaBorrowers> shelf ;
        while(!(ip = kb.readLine()).equals("END")){
            arr = ip.split(" by ");
            input.add(new UvaBorrowers(arr[1].trim(),arr[0].trim(),true));
        }
        Collections.sort(input);

      /*  System.out.println("SortedIp");
        for (int i = 0; i < input.size() ; i++) {
            System.out.println(input.get(i).title);
        }*/
        while(!(ip = kb.readLine()).equals("END")){

            if(ip.charAt(0)=='B'){
                String bTitle= ip.substring(7,ip.length()).trim();

                setFalse(input,bTitle);
            }else if(ip.charAt(0)=='R'){
                String bTitle= ip.substring(7,ip.length()).trim();

                    returnB.add(getOb(input,bTitle));


            }else {
                retC++;
                if(returnB.size() > 0) {


                    Collections.sort(returnB);

                    for (int i = 0; i < returnB.size(); i++) {


                        int ans = lastTrue(input, returnB.get(i).title);
                        if (ans == -1) {
                            System.out.println("Put " + returnB.get(i).title + " first");

                        } else {
                            System.out.println("Put " + returnB.get(i).title + " after " + input.get(ans).title);
                        }
                    }
                }
       /*         System.out.println(retC);
                for (int j = 0; j < input.size(); j++) {
                    System.out.println(" " + input.get(j).title + " " + input.get(j).present);
                }*/
                System.out.println("END");
                returnB = new ArrayList<>();









            }
        }




    }


    public static void setFalse(ArrayList<UvaBorrowers>input,String title){
        for (int i = 0; i < input.size()  ; i++) {
            if(title.equals(input.get(i).title)){
                input.get(i).present = false;
                return;
            }

        }
    }
    public static UvaBorrowers getOb(ArrayList<UvaBorrowers> input,String sTitle ){

        for (int i = 0; i < input.size()  ; i++) {
            if(sTitle.equals(input.get(i).title)){

                return input.get(i);

            }

        }
        return null;
    }
    public static int lastTrue(ArrayList<UvaBorrowers> input,String title){
        int ans = -1;
        for (int i = 0; i < input.size() ; i++) {
            if(title.equals(input.get(i).title)){
                input.get(i).present = true;
                return ans;
            }else if(input.get(i).present){
                ans = i;
            }
        }
        return ans;

    }



}
