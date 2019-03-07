package stacksqueues;

public class StackImplWithArray<T> implements Stack<T>{

    private T[] array;
    private int size = 0;
   
    
	public StackImplWithArray(T[] val) {
		this.array = val;
	}

	@Override
	public void push(T value) {
//		if (size == array.length) {
//			T[] biggerArray = new T[array.length*2];  //--> cannot create a generic array of T
//			}
		if (size == 0) {
			array[0] = value;
			size++;
		}else {
			array[size] = value;
			size++;
		}
	}
	
	@Override
	public T pop() {
		T last = array[size-1];
		array[size-1] = null;
		size--;
		return last;
		
		
	}

	@Override
	public void peek() {
		System.out.println(array[size-1]);
		
	}

	@Override
	public void print() {
		for (T i : array) {
			System.out.print(i + " ");
		}
		
	}

}