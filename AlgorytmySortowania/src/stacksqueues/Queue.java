public interface Queue<T>{

    T peek();

    T poll();

    void push(T value);

}