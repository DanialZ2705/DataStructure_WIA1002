/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5q4;


class Convert{
    public static String toPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        MyStack<Character> stack = new MyStack<>();

        for (char c : infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Operand, append to postfix
                postfix.append(c);
            } else if (c == '(') {
                // Left parenthesis, push onto stack
                stack.push(c);
            } else if (c == ')') {
                // Right parenthesis, pop and append operators until a left parenthesis is encountered
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                // Pop the left parenthesis
                stack.pop();
            } else {
                // Operator, pop and append operators with higher or equal precedence until stack is empty or '(' is encountered
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                // Push the current operator onto the stack
                stack.push(c);
            }
        }

        // Pop and append remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1; // Invalid operator
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String str = "((((A-B)+((M^N)*(O+P)))-((Q/(R^S))*T))+Z)";
        System.out.println("Infix: " + str);
        System.out.println("Postfix: " + Convert.toPostfix(str));
    }
}

