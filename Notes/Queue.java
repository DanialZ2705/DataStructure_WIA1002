/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprep;

/**
 *
 * @author mhmdd
 */
public class Queue<T> {
    int maxsize;
    int head; 
    int tail;
    T arr[];
    
    public Queue(){
        maxsize = 10;
    }
    
    public Queue(int size){
        this.maxsize = size;
        this.head = 0;
        this.tail = 0;
        arr = (T[]) new Object[maxsize];
    }
    
    public boolean isEmpty(){
        return tail == 0;
    }
    
    public boolean isFull(){
        return tail == maxsize;
    }
    
    public void enqueue(T value){
        if(!isFull()){
            arr[tail] = value;
            tail++;
        }
    }
    
    public T dequeue(){
        T temp = arr[head];
        if(!isEmpty()){
            arr[head] = null;
            for(int i = 0; i < tail; i++){
                arr[i] = arr[i+1];
            }
            tail--;
        }
        return temp;
    }
    
    public T peek(){
        return arr[head];
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
