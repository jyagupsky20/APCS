import java.util.LinkedList;
public class LLDeque<E> implements Deque<E>{
	LinkedList<E> _list;
	public LLDeque(){
		_list = new LinkedList<E>();
	}
}
