import java.util.ArrayList;

public class ALStack<T> implements Stack<T> {
  private ArrayList<T> _stack;
  public ALStack(){
      _stack = new ArrayList<T>();
  }
  public boolean isEmpty() {
    return _stack.size() == 0;
  }

  public T peekTop() {
    return _stack.get(_stack.size()-1);
  }

  public T pop() {
    if (!isEmpty()) {
      return _stack.remove(_stack.size()-1);
    }
    return null;
  }

  public void push( T x ) {
    _stack.add(x);
  }

}
