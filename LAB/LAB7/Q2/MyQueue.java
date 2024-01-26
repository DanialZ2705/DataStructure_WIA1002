/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7q2;

/**
 *
 * @author mhmdd
 */
public class MyQueue<T>{
    private int head;
    private int tail;
    int maxsize;
    private T arr[];
    
    public MyQueue(int size){
        head = 0;
        tail = 0;
        this.maxsize = size;
        arr = (T[]) new String[maxsize]; 
    }
    
    public boolean isEmpty(){
        return tail == 0;
    }
    
    public boolean isFull(){
        return tail >= maxsize;
    }
    
    public void enqueue(T value){
        if(!isFull()){
            arr[tail] = value;
            tail++;
            System.out.print(value + "--> ");
        }else{
            System.out.println("Queue is full.");
        }
    }
    
    public void dequeue(){
        if(!isEmpty()){
            // remove the data first
            T temp = arr[head];
            arr[head] = null;
            for(int i = 0; i < tail; i++){
            //shift elements forward by 1 index
                arr[i] = arr[i + 1];
        }
            tail--;
        }else System.out.println("Queue is empty");
    }
    
    public T peek(){
        return arr[head];
    }
    
    public void enqueueMany(String line){
        T[] elements = (T[]) line.trim().split("\\| ");
        for(T data : elements) enqueue( (T) data);
        }
    
    public void display(){
        System.out.println("-----------------------------------------------");
        if(!isEmpty()){
            System.out.println("There are " + tail + " items in the queue. Displaying: ");
            for(int i = 0; i <= tail - 1; i++){
                System.out.println("Data at index " + i + ": " + arr[i]);
            }
        }
    }
}