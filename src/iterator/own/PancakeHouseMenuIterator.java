package iterator.own;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;
 
	// 这里同样如此
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
 
	public Object next() {
		Object object = items.get(position);
		position = position + 1;
		return object;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
