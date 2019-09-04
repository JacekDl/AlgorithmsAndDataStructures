package datastructures.stacksqueues;

public interface Stack<T> {

    public T pop(); // sciagnij wartosc ze stosu

    public void peek(); //zobacz, jaka wartosc jest na szczycie stosu

    public void push(T value); //umiesc wartosc na stosie

	public void print();

}