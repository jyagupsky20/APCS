import java.util.LinkedList;

public class LLStack<T> implements Stack<T>{
  private LinkedList<T> _stack;
  public LLStack(){
    _stack = new LinkedList<T>();
  }
  public boolean isEmpty(){
    return _stack.size() == 0;
  }
  public void push(T item){
    _stack.addLast(item);
  }
  public T peekTop(){
    return _stack.getLast();
  }
  public T pop(){
    if(!isEmpty()){
      return _stack.removeLast();
    }
    return null;
  }
}
