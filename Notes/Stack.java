/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprep;

/**
 *
 * @author mhmdd
 */
public class Stack<T> {
    int maxsize;
    int top;
    T arr[];
    
    public Stack(int n){
        this.maxsize = n;
        arr = (T[]) new Object[maxsize];
        top = 0;
    }
    
    public boolean isEmpty(){
        return top == 0;
    }
    
    public boolean isFull(){
        return top == maxsize;
    }
    
    public void push(T data){
        if(!isFull()){
            arr[top] = data;
            top++;
        }
    }
    
    public T pop(){
        if(!isEmpty()){
            T temp = peek();
            arr[top - 1] = null;
            top--;
            return temp;
        }else return null;
    }
    
    public T peek(){
        if(!isEmpty()){
            return arr[top - 1];
        }else return null;
    }
    
    public void resize(){
        int newCap = maxsize * 2;
        T[] newArr = (T[]) new Object[newCap];
        
        for(int i = 0; i < top; i++){
            newArr[i] = arr[i];
        }
        
        arr = newArr;
        maxsize = newCap;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(T item : arr){
            sb.append(item).append(" > ");
        }
        return sb.toString();
    }
}
