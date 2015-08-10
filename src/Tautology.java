
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;



/**
 * Created by Sriram Ganesh on 24-04-2015.
 */
class EmptyExpressionException extends Throwable {
    public EmptyExpressionException(String message) {
        super(message);
    }
}

public class Tautology {
    int arrayForVariableNames[];
    int arrayLength = 300;
    int valueForVariables[];

    private int invert(int operand) {
        return (operand == 1) ? 0 : 1;
    }

    private int compute(int operand1, int operand2, char operator) {
        return (operator == '|') ? operand1 | operand2 : operand1 & operand2;
    }

    private void performOperation(Stack<Integer> value, char operator) {
        if (operator == '&' || operator == '|') {
            value.push(compute(value.pop(), value.pop(), operator));
        } else if (operator == '!') {
            value.push(invert(value.pop()));
        }
    }

    /**
     * Evaluates a boolean expression and returns true is its a Tautology. This method generates all possible values upto
     * 2^n where n being the cardinality of the expression. For each expression it calls the method evaluateStatement and
     * checks whether it is not equal to zero. If it is true for all the generated values, this method returns true.
     * @param expression a boolean expression
     * @return true if the expression is a Tautology
     * @throws EmptyExpressionException when the input expression is empty
     */

    public boolean verifyTautology(String expression) throws EmptyExpressionException {
        expression = expression.replaceAll("\\s", "");      //Removes white spaces from the expression
        if (expression.isEmpty())
            throw new EmptyExpressionException("Input expression is empty");
        boolean result = true;
        arrayForVariableNames = new int[arrayLength];
        int countOfVariables = 0;
        Arrays.fill(arrayForVariableNames, -1);
        for (int i = 0; i < expression.length(); i++) {
            if (Character.isAlphabetic(expression.charAt(i)) && arrayForVariableNames[expression.charAt(i)] == -1) {
                arrayForVariableNames[expression.charAt(i)] = countOfVariables++;
            }
        }
        for (int i = 0; i < Math.pow(2, countOfVariables); i++) {
            valueForVariables = new int[countOfVariables];
            for (int j = 0; j < countOfVariables; j++) {
                if ((i & (1 << j)) == 0) {
                    valueForVariables[j] = 0;
                } else {
                    valueForVariables[j] = 1;
                }
            }
            if (evaluateStatement(expression) == 0) {
                return false;
            }
        }
        return result;
    }

    /**
     * Evaluates a given expression and returns the result of the evaluation. Nested expressions are taken care using a
     * stack. After evaluation the stack top will have the result. This method returns the stack top (result).
     * @param expression a boolean expression that is to be evaluated.
     * @return an integer which is the result of evaluation
     */

    private int evaluateStatement(String expression) {
        Stack<Integer> valueStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (Character.isAlphabetic(expression.charAt(i))) {
                if (!(i - 1 >= 0 && expression.charAt(i - 1) == '!')) {
                    valueStack.push(valueForVariables[arrayForVariableNames[expression.charAt(i)]]);
                }
            } else if (expression.charAt(i) == '&' || expression.charAt(i) == '|' || expression.charAt(i) == '(') {
                operatorStack.push(expression.charAt(i));
            } else if (expression.charAt(i) == '!') {
                if (expression.charAt(i + 1) == '(' || expression.charAt(i + 1) == '!') {
                    operatorStack.push(expression.charAt(i));
                } else {
                    int x = valueForVariables[arrayForVariableNames[expression.charAt(i + 1)]];
                    x = invert(x);
                    while (operatorStack.size() > 0 && operatorStack.peek() == '!') {
                        operatorStack.pop();
                        x = invert(x);
                    }
                    valueStack.push(x);
                }
            } else if (expression.charAt(i) == ')') {
                char operator;
                while ((operator = operatorStack.pop()) != '(') {
                    if (operator == '!') {
                        int x = valueStack.pop();
                        valueStack.push(invert(x));
                    } else {
                        performOperation(valueStack, operator);
                    }
                }
            }

        }
        while (operatorStack.size() > 0) {
            char op = operatorStack.pop();
            performOperation(valueStack, op);
        }
        return valueStack.pop();
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Enter a boolean expression");
        BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));
        String expression = keyBoard.readLine();
        try {
            System.out.println(new Tautology().verifyTautology(expression));
        } catch (EmptyExpressionException e) {
            System.out.println(e.getMessage());
        }
    }
}
