/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5q2;

/**
 *
 * @author mhmdd
 */
public class PostFixEvaluation {
    
    public static String evaluatePostfix(String expression){
        
        MyStack stack = new MyStack();
        
            for(int i = 0; i < expression.length(); i++){
                char c = expression.charAt(i);
            
                if(Character.isDigit(c)) stack.push(String.valueOf(c - '0'));
                else{
                    int val1 = Integer.parseInt(stack.pop());
                    int val2 = Integer.parseInt(stack.pop());
                    
                    switch(c){
                            case '+' :
                                stack.push(String.valueOf(val1 + val2));
                                break;
                                
                            case '-' :
                                stack.push(String.valueOf(val1 - val2));
                                break;
                                
                            case '*' :
                                stack.push(String.valueOf(val1 * val2));
                                break;
                                
                            case '/' :
                                stack.push(String.valueOf(val1 / val2));
                                break;
                    }
                }
            }
        return stack.pop();
    }
    
}
