package mycode;

import java.util.Iterator;
import java.util.NoSuchElementException;

import mycode.MyArrayList.Node;

public class MyArrayList<T> implements Iterable<T> {
public class Node<T>{
	Node<T> prev;
	Node<T> next;
	T obj;
	Node(){

	}
}
Node<T> Head;
Node<T> Tail;
Node<T> curr;
int size;
MyArrayList(){
	curr = new Node<T>();
	Head = new Node<T>();
	Tail = new Node<T>();
	Head.next = Tail;
	Tail.prev = Head;
	Head.obj = null;
	Tail.obj = null;
	curr = Head;
	size = 0;
}
void add_To_Head(T val) {
	Node<T> tmp = new Node();
	tmp.obj = val;
	tmp.prev = Head;
	tmp.next = Head.next;
	Head.next.prev = tmp;
	Head.next = tmp;
	size++;
}
void print() {
	Node<T> tmp = Head.next;
	while(tmp.obj!=null) {
		System.out.println(tmp.obj);
		tmp = tmp.next;
	}
}
int getsize() {
	return size;
}
void remove(int index){
	Node<T> tmp = Head.next;
	for(int i = 0;i < index; i++) {
		tmp = tmp.next;
	}
	tmp.next.prev = tmp.prev;
	tmp.prev.next = tmp.next;
	size--;
}
boolean contains(T item) {
	Node<T> tmp = Head.next;
	for(int i = 0;i < size; i++) {
		if(tmp.obj==item) {
			return true;
		}
		tmp = tmp.next;
	}
	return false;
}
T get(int index) {
	Node<T> tmp = Head.next;
	for(int i = 0;i < index; i++) {
		tmp = tmp.next;
	}
	return tmp.obj;
}

@Override
public Iterator<T> iterator() {
	return new Iterator<T>(){
        int len = size;
        int index = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < len;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
		  Node<T> tmp = Head;
		  index++;
		  for(int i = 0; i < index; i++) {
			  tmp = tmp.next;
		  }
		  return tmp.obj;
		}
		
	};
}
}
