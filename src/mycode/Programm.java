package mycode;

import java.io.IOException;
import java.util.Iterator;

public class Programm {
	public static void main(String[] args) throws NumberFormatException, IOException {
		MyArrayList<Integer> a = new MyArrayList<Integer>();
		a.add_To_Head(5);
		a.add_To_Head(3);
		a.add_To_Head(7);
		a.add_To_Head(1);
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//a.remove(1);
		//System.out.println(a.get(1));
		//a.print();
	}
}
