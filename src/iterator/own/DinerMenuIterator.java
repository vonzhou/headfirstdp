package iterator.own;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	// �ѵײ�Ĵ洢�ṹ������
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
