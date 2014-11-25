package adapter.enumeration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
	@SuppressWarnings("unchecked")
	public static void main (String args[]) {
		String ss[] = {"safs","","vonzhou","luyna"};
		Vector v = new Vector(Arrays.asList(ss));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
