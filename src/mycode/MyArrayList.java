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
Node<T> head;
Node<T> tail;
int size;
MyArrayList(){
	head = new Node<T>();
	tail = new Node<T>();
	head.next = tail;
	tail.prev = head;
	head.obj = null;
	tail.obj = null;
	size = 0;
}
void add(T val) {
	Node<T> tmp = new Node();
	tmp.obj = val;
	tmp.prev = tail.prev;
	tmp.next = tail;
	tail.prev.next = tmp;
	tail.prev = tmp;
	size++;
}
int getSize() {
	return size;
}
void remove(int index){
	Node<T> tmp = head.next;
	for(int i = 0;i < index; i++) {
		tmp = tmp.next;
	}
	tmp.next.prev = tmp.prev;
	tmp.prev.next = tmp.next;
	size--;
}
boolean contains(T item) {
	Node<T> tmp = head.next;
	for(int i = 0;i < size; i++) {
		if(tmp.obj==item) {
			return true;
		}
		tmp = tmp.next;
	}
	return false;
}
T get(int index) {
	Node<T> tmp = head.next;
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
		  Node<T> tmp = head;
		  index++;
		  for(int i = 0; i < index; i++) {
			  tmp = tmp.next;
		  }
		  return tmp.obj;
		}
		
	};
}
}
