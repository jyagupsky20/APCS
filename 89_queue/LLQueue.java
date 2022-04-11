import java.util.LinkedList;
public class LLQueue<T> implements Queue<T> {
	private LinkedList<T> _list;
	public LLQueue(){
		_list = new LinkedList<T>();
	}
	public void enqueue(T val){
		_list.addLast(val);
	}
	public T dequeue(){
		if(!isEmpty()){
			return _list.removeFirst();
		}
		return null;
	}
	public T peekFront(){
		return _list.getFirst();
	}
	public boolean isEmpty(){
		return _list.isEmpty();
	}

}
