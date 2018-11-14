package mycode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestCollection {

	@Test
	void test() {
		MyArrayList<String> str = new MyArrayList<String>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.remove(0);
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.remove(0);
		boolean result = true;
		for(int i = 0; i < str.getSize();++i) {
			if(str.get(i) != l.get(i)) {
				result = false;
			}
		}
		assertEquals(true,result);
		//fail("Not yet implemented");
	}
	@Test
	void testSize() {
		MyArrayList<String> str = new MyArrayList<String>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.remove(0);
		assertEquals(2,str.getSize());
	}

}
