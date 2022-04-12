/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW89 -- Queue Two Ways
2022-04-11
time spent: 0.1 hr

DISCO

QCC
*/

import java.util.ArrayList;
public class ALQueue<T> implements Queue<T> {
	private ArrayList<T> _list;
	public ALQueue(){
		_list = new ArrayList<T>();
	}
	public void enqueue(T val){
		_list.add(0, val);
	}
	public T dequeue(){
		if(!isEmpty()){
			return _list.remove(_list.size()-1);
		}
		return null;
	}
	public T peekFront(){
		return _list.get(_list.size()-1);
	}
	public boolean isEmpty(){
		return _list.isEmpty();
	}
	public static void main(String[] args) {
		ALQueue<Integer> q = new ALQueue<Integer>();
		for (int i = 0; i < 80; i+=2 ) {
			q.enqueue(i);
		}
		while (!q.isEmpty()){
			System.out.println(q.peekFront());
			q.dequeue();
		}
	}
}
