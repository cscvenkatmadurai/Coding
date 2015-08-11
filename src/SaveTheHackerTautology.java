/**
 * Created by HARISH on 4/24/2015.
 */
import javax.management.openmbean.OpenDataException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;
public class SaveTheHackerTautology {
    static int arrForVarName[];
    static int arrLength = 300;
    static int valForVariables[];

    public static int eval(int op1,int op2,char op){
        if(op == '!'){
            return invertX(op1);
        }else  if(op =='|' ){
            return op1|op2;
        }else{   // for and
            return op1&op2;
        }

    }

    public static int invertX(int op1) {
        if(op1 == 1){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) throws IOException{
        String ip;
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ));






        ip = kb.readLine();
        boolean flag = true;
        arrForVarName = new int[arrLength];
        int countOfVariable = 0;
        Arrays.fill(arrForVarName, -1);
        for (int i = 0; i < ip.length(); i++) {
            if( Character.isAlphabetic(ip.charAt(i)) && arrForVarName[ ip.charAt(i)] == -1){
                arrForVarName[ ip.charAt(i)] = countOfVariable++ ;

            }
        }
        // ( ( (a|!a) |(b|!b))&(c|!c) )

      //  System.out.println(countOfVariable);
        for (int i = 0; i <Math.pow(2, countOfVariable) && flag ; i++) {
            valForVariables = new int[countOfVariable];
            for (int j = 0; j < countOfVariable && flag; j++) {
                if ( (i&(1<<j) ) == 0){
                    valForVariables[j] = 0;
                }else {
                    valForVariables[j] = 1;
                }



            }
            if(evalvateStatement(ip) == 0){
                flag = false;
            }
       //     System.out.println('a' +" "+ valForVariables[arrForVarName['a'] ] +" "+ 'b'+" "+valForVariables[arrForVarName[ 'b']]);

            System.out.println();

        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }

    public static int evalvateStatement(String ip) {
        Stack<Integer> value =new Stack<>();
        Stack <Character>operator =new Stack<>();
        for(int i = 0; i < ip.length();i++){
            if (Character.isAlphabetic(ip.charAt(i))){
                if ( !(i-1 >=0 && ip.charAt(i-1)=='!') ){
                  //  value.push(Character.getNumericValue(ip.charAt(i)));
                    value.push(valForVariables[arrForVarName[ip.charAt(i)]]  );
                }

            }else if(ip.charAt(i)!=' '){
                if(ip.charAt(i) == '&' || ip.charAt(i) == '|' || ip.charAt(i) == '('){
                    operator.push(ip.charAt(i));
                   // System.out.println("push" + ip.charAt(i));

                }else if(ip.charAt(i) == '!'){
                    if(ip.charAt(i+1) == '(' || ip.charAt(i+1) == '!' ){
                   //     System.out.println("push"+ ip.charAt(i));
                        operator.push(ip.charAt(i));
                    }else{
                      //  System.out.println("not"+ ip.charAt(i));
                            int x =  valForVariables[arrForVarName[ ip.charAt( i+1 )]];
                     //   System.out.println(x);
                           x = invertX(x);
                        while(operator.size()>0 && operator.peek() == '!'){
                            operator.pop();
                            x = invertX(x);
                        }

                        value.push(x);


                    }
                }else if(ip.charAt(i)== ')'){
                    char op;
                    while ((op=operator.pop())!='(') {
                       // System.out.println("in else of )");
                        if (op == '!') {
                            int x = value.pop();
                            value.push(eval(x, x, op));
                        } else {

                            performOperation(value, op);
                        }
                    }
                }
            }
        }
        while(operator.size() > 0){
            char op = operator.pop();
            performOperation(value, op);
        }


            return value.pop();

    }

    public static void performOperation(Stack<Integer> value, char op) {
        if(op == '&' || op== '|'){
            int x = value.pop();
            int y = value.pop();
            value.push(eval(x, y, op));
        }else if(op == '!'){
            int x = value.pop();
            value.push(eval(x,x,op));
        }

    }
}


