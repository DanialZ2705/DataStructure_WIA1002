/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5q1;

/**
 *
 * @author mhmdd
 */
class MyStack {

//     1. need a container to work ie. array with specification
//     2.  need a pointer to traverse the array
//     3.     neewd methods to implement the Stack
    
//    declare some local variable for class stack
    int maxsize; //max size of array
    int top; //pointer
    String arr[]; //create an array of type String so we can store String data
    
    public MyStack(){
        maxsize = 5;
        top = 0;
        arr = new String[maxsize];
    }
    
    public boolean isEmpty(){
        if (top == 0) return true;
        else return false;
    }
    
    public boolean isFull(){ //method only manipulate pointer
        if(top == maxsize) return true;
        else return false;
    }
    
    public void push(String data){
        if(!isFull()) {
            arr[top] = data; //push parameter to top of stack
            top++;
        }else System.out.println("Stack is full");
    }
    
    public void pop(){
        if(!isEmpty()){
            String temp = peek();
            System.out.println(temp);
            arr[top - 1 ] = null;
            top--;
        }else System.out.println("Stack is empty");
    }
    
    public String peek(){
        if(!isEmpty()) return arr[top - 1];
        else return "Stack is empty";
    }
    
    public void pushMany(String line){
        String[] elements = line.split(",");
        
        for(String data : elements) push(data);
    }
    
    public void popAll(){
        for(int i = 0; i < maxsize; i++) arr[top - 1] = null;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < maxsize; i++)
            sb.append(arr[i]).append(" ");
        return sb.toString();
    }
}
    
    public class Main{
        public static void main(String[] args) {
            MyStack stack1 = new MyStack();
            
            stack1.push("Tomato");
            stack1.push("Corn");
            stack1.push("Brinjal");
            stack1.push("Maize");
            stack1.push("Pea");
            
            System.out.println(stack1.toString());
        }
    }
    
