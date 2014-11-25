package iterator.own;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	// 把底层的存储结构传进来
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
 
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
