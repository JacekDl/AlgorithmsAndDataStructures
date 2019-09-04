package datastructures.stacksqueues;

public interface Queue<T>{

    void push(T value);
    
    T peek();

    T poll();

    void print();
}