package com.tgt.igniteplus;
import java.util.*;
public class Arit_expr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an expression:");
        String exp = in.nextLine();
        Arit_expr i = new Arit_expr();
        System.out.println("The value of expression is " + i.getValue(exp));
    }

    public int getValue(String expression) {
        if (expression == null || expression.length() == 0) return 0;
        Stack<Character> OptrStack = new Stack();
        Stack<Integer> OpndStack = new Stack<>();
        int digit = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ' ') continue;
            else if (Character.isDigit(c)) {
                digit = c - '0';
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    digit = digit * 10 + (expression.charAt(++i) - '0');
                }
                OpndStack.push(digit);
            } else if (isOpeator(c)) {
                while (!OptrStack.isEmpty() && hasPrecedence(c, OptrStack.peek())) {
                    OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
                }
                OptrStack.push(c);
            } else if (c == '(') {
                OptrStack.push(c);
            } else if (c == ')') {
                while (OptrStack.peek() != '(') {
                    OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
                }
                OptrStack.pop();
            }
        }
        while (!OptrStack.isEmpty()) {
            OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
        }
        return OpndStack.pop();
    }

    public boolean isOpeator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    public int applyOperation(char optr, int a, int b) {
        switch (optr) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;
        }
        return 0;
    }

    public boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
}
