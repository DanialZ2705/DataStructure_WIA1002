/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprep;

/**
 *
 * @author mhmdd
 */
public class PriorityQueue<T extends Comparable<T>> {
    T[] arr;
    int size;
    
    public PriorityQueue(int size){
        this.size = 0;
        arr = (T[]) new Object[size];
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean isFull(){
        return size == arr.length;
    }
    
    public void enqueue(T data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        
        arr[size] = data;
        size++;
        
        int a = size - 1;
        while(a > 0){
            int b = (a - 1)/2;
            if(arr[a].compareTo(arr[b]) > 0){
                T temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                
                a = b;
            }
            else{
                break;
            }
        }
    }
    
    
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        
        T temp = arr[0];
        
        arr[0] = arr[size - 1];
        size--;
        
        int a = 0;
        while(true){
            int left = 2 * a + 1;
            int right = 2 * a + 1;
            
            int b = a;
            
            if(left < size && (arr[left].compareTo(arr[b]) > 0)){
                b = left;
            }
            
            if(right < size && (arr[right].compareTo(arr[b]) > 0)){
                b = right;
            }
            
            if(b != a){
                T temps = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                
                a = b;
            }else{
                break;
            }
        }
        return temp;
    }
    
    public String toString(){
    StringBuilder sb = new StringBuilder();
    for(T data: arr){
        sb.append(data).append(" ");   
    }
    return sb.toString();
    }
    
}
