package mycode;

import java.io.IOException;
import java.util.Iterator;

public class Programm {
	public static void main(String[] args) throws NumberFormatException, IOException {
		MyArrayList<Integer> a = new MyArrayList<Integer>();
		a.add(5);
		a.add(3);
		a.add(7);
		a.add(1);
		a.remove(1);
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer i: a) {
			System.out.println(i);
		}
	}
}
